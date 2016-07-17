syntax rotate = function(ctx){
    let inner = ctx.next().value.inner();
    let prev = inner.next().value;
    let result = #`var tmp = ${prev};`;
    for(let comma of inner){
        let next = inner.next().value;
        result = result.concat(#`${prev} = ${next};`);
        prev = next;
    }
    result = result.concat(#`${prev} = tmp;`);
    return result;
}
var a = 4;
var b = 6;
var c = 9;
var d = 10;
console.log("Pre : a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
rotate(a, b, c, d);
console.log("Post : a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);