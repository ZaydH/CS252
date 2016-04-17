
syntax square = function (ctx) {
  let inCtx = ctx.next().value.inner();
  let result = #``;
  for (let stx of inCtx) {
    result = result.concat(#`${stx} = ${stx}*${stx};`);
    inCtx.next(); // Eating comma
  }
  return result;
}

var a = 1;
var b = 2;
var c = 3;

square(a, b, c);

// prints a:1 b:4 c:9
console.log("a:" + a + " b:" + b + " c:" + c);

