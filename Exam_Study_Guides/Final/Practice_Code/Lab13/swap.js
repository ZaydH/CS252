syntax swap = function (ctx) {
  let a = ctx.next().value;
  let b = ctx.next().value;
  return #`var tmp =${a}; ${a}=${b}; ${b}=tmp;`;
}

var a = 10;
var b = 20;

// prints a:10 b:20
console.log("a:" + a + " b:" + b);

swap a b;

//prints a:20 b:10
console.log("a:" + a + " b:" + b);



////////////////////////////////////////////////////

syntax swap2 = function (ctx) {
  let inCtx = ctx.next().value.inner();
  let a = inCtx.next().value;
  inCtx.next(); // eat ','
  let b = inCtx.next().value;
  return #`var tmp =${a}; ${a}=${b}; ${b}=tmp;`;
}

swap2(a, b);

// prints a:10 b:20
console.log("a:" + a + " b:" + b);

