var Droid = {
  speak: function() {
    console.log(">>Beep, boop<<, I am " + this.name);
  },
  create: function(name) {
    var clone = Object.create(this);
    clone.name = name;
    return clone;
  },
};


syntax new = function (ctx) {
  let ident = ctx.next().value;
  let params = ctx.next().value;
  return #`${ident}.create ${params}`;
}

var areToo = Droid.create('R2-D2');
var bb8 = new Droid('BB8');

areToo.speak();
bb8.speak();

