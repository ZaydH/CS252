syntax rotate = function(ctx){
    let innerCtx = ctx.next().value.inner();
    let prev = innerCtx.next().value;
    let result = #`var tmp = ${prev};`;
    // Eat commas in the while condition
    // Read var inside
    for ( let comma of innerCtx ){
        //let next = inner.next().value;
        //result.concat(#`${next} = ${prev};`);
        //prev = next;
    }
    return result.concat(#`${prev} = tmp;`);
}

var a = 1;
var b = 2;
var c = 3;
var d = 4;
console.log("Pre - a = " + a + ", b = " + b + ", c = " + c + ", d = " + d)
rotate(a, b, c, d);
console.log("Post - a = " + a + ", b = " + b + ", c = " + c + ", d = " + d)