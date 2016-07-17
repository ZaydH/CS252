syntax swap = function(ctx){
    let inner = ctx.next().value.inner();
    let first = inner.next().value;
    // Get the comma
    inner.next();
    let second = inner.next().value;
    let result = #`var temp = ${first}; ${first} = ${second}; ${second} = temp;`;
    return result;
}

var a = 5;
var b = 4;
console.log("Pre : a = " + a + ", b = " + b);
swap(a,b);
console.log("Post : a = " + a + ", b = " + b);