#! /usr/bin/ruby -w

#Represents a Rogerian psychiatrist
class Shrink

  #initializes 'memory' of Eliza.
  def initialize()
    @they='they'
    @he='he'
    @she='she'
  end

  #read a statement and convert it to a psychiatric response.
  def generateResponse(blather)
    #downcase for ease of substitution
    blather = blather.downcase

    # Handle master override cases
    if blather.include?('never') or blather.include?('always')
      return 'CAN YOU BE MORE SPECIFIC?'
    end
    start_str = 'are you '
    if blather.start_with?(start_str)
      return 'IS IT IMPORTANT IF I AM?'
    end

    # Remove the start words
    filter_words = %w(well maybe perhaps also)
    filter_words.each do |word|
      reg_exp = /#{word}\W+/
      if blather.start_with?(word)
        blather.sub!(reg_exp, '')
      end
    end

    #change 'you', 'your', etc. to uppercase 'I', 'MY'
    blather.gsub!(/\byour\b/, 'MY')
    blather.gsub!(/\byou\b/, 'I')

    #Replace 'my' with 'your', 'me' with 'you', 'I' with 'you', etc.
    blather.gsub!(/\bmy\b[[:punct:]]?/, 'your')
    blather.gsub!(/\bme\b[[:punct:]]?/, 'you')
    blather.gsub!(/\bi\b[[:punct:]]?/, 'you')

    # Replace AM -> "are"
    #blather.gsub!(/\bare\b[[:punct:]]?/,'_____are_____')
    blather.gsub!(/\bam\b[[:punct:]]?/,'are')
    #blather.gsub!(/\b_____are_____\b[[:punct:]]?/,'am')
    blather.gsub!(/\bwas\b[[:punct:]]?/,'were')

    #Sub in past references, but only for the 1st occurrence or it looks weird
    blather.sub!(/\bhe\b/, @he)
    blather.sub!(/\bshe\b/, @she)
    blather.sub!(/\bthey\b/, @they)

    #Get future references -- note that these do NOT change the immediate output
    hePat=/.*\b(your (father|brother|(ex-?)?(husband|boyfriend)))\b.*/
    shePat = /.*\b(your (mother|sister|(ex-?)?(wife|girlfriend)))\b.*/
    theyPat = /.*\b(your (bros|parents))\b.*/
    @he=blather.sub(hePat, '\1').chomp if blather =~ hePat 
    @she=blather.sub(shePat, '\1').chomp if blather =~ shePat
    @they=blather.sub(theyPat, '\1').chomp if blather =~ theyPat

    #Deal with name
    namePat=/.*\byour name is (\w+).*/
    @name=blather.sub(namePat,'\1')
    blather.sub!(namePat,'nice to meet you, \1.  How can I help you')

    #results are uppercased, for aesthetics.
    blather.upcase!
    # Ensure no double punctuation at the end.
    last_char = blather[-1]
    if blather[-1] =~ /[[:punct:]]/
      blather = blather[0, blather.length - 1]
    end
    return blather + '?'

  end
end


#main -- reads from standard input unless -test is the first parameter.
eliza = Shrink.new()
if ARGV[0] == "-test"
    ['My girlfriend never listens to me',
     'I think she might be deaf',
     'yes',
     'I am afraid of clowns',
     'Who are you?',
     'Well, they just seem creepy',
     'Also, when I was a kid, a clown killed my dad',
     'I hate my father bro',
     'Can you be sure he is done?',
     'They are cool.',
     'Are my bros here?',
     'Yes, they are here.',
     'My name is Steve',
     'You ate him',
     'Your father is dumb.',
     'Are you a clown in disguise?',
     'I ALWAYS hated you',
     'I never loved you'
    ].each do |stmt|
        puts stmt
        puts eliza.generateResponse(stmt)
    end
else
  while line = gets
    response = eliza.generateResponse line
    puts response
  end
end
