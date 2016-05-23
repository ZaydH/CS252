syntax swap = function (ctx) {
    let innerCtx = ctx.next().value.inner();
    //Get the first parameter
    let firstParam = innerCtx.next().value;
    // Eat the comma
    innerCtx.next();
    //Get the second parameter
    let secondParam = innerCtx.next().value;
    return #`var tmp = ${firstParam}; ${firstParam} = ${secondParam}; ${secondParam} = tmp;`;
}

var a = 5;
var b = 10;
console.log("Preswap : a = " + a + "; b = " + b);
swap(a, b);
console.log("Postswap : a = " + a + "; b = " + b);
