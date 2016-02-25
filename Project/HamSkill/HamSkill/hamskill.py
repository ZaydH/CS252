'''
Created on Feb 25, 2016

@author: Zayd
'''
# 
# # Create a generic function
# def generic_function(): pass
# 
# def test1():
#     generic_function.__code__ = compile('print "hi from test1"', '<string>', 'exec')
#     generic_function()
#  
# def test2():
#     generic_function.__code__ = compile('print "hi from test2"', '<string>', 'exec')
#     generic_function() in globals(), locals()
# 
# if __name__ == '__main__':
#     
# #     # Create a temporary memory space
# #     temp_heap = {'name': 'Zayd', 'x': 32, 'param1': "input Parameter"}
# #     
# #     # Create executable code
# #     code = compile("def my_function(param1): \n print name\nmy_function()", '<string>', 'exec')
# #     
# #     generic_function.__code__ = code
# #     my_function(x)
#     
#      test1()
#      test2()
#     
# #      code = compile("print \"hi from test1\"", '<string>', 'exec')
# #      generic_function.__code__ = code 
# #      generic_function()

if __name__ == '__main__':
    
    
    # Create a temporary memory space
    temp_heap = {'x': 10}
    
    # Define the recursive function as a string.
    string_fibonacci = """\
def string_fibonacci(n):
    if n==0 or n==1:
        return n
    return string_fibonacci(n-1) + string_fibonacci(n-2)

result = string_fibonacci(x)"""    

    # Run the function above
    exec(string_fibonacci, temp_heap)
    
    # Print the result
    print temp_heap['result']
    