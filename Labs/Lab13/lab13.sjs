/*
Welcome to sweet.js!

You can play around with macro writing here on the left side and
your code will automatically be compiled on the right. This page
will also save your code to localStorage on every successful
compile so feel free to close the page and come back later!
*/

var a = 5;
var b = 6;
var c = 7;
console.log("Prerotate: a = " + a + ", b = " + b + ", c = " + c);

// The `syntax` keyword is used to create and name new macros.
syntax rotate = function (ctx) {
  let innerContext = ctx.next().value.inner();
  let prev = innerContext.next().value;
  let output = #`var tmp = ${prev};`;
  let next = "";
  for(let comma of innerContext){
    next = innerContext.next().value;
    output = output.concat(#`${prev} = ${next};`);
    prev = next;
  }
  if(next !== ""){
    return output.concat(#`${next} = tmp;`);
  }
  return output;
}
rotate(a, b, c);


console.log("Postrotate: a = " + a + ", b = " + b + ", c = " + c);