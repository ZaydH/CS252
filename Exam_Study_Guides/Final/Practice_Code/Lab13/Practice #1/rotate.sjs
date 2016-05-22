syntax rotate = function (ctx) {
    let inner = ctx.next().value.inner();
    // Get the first token then eat its comma
    let prev = inner.next().value;
    let output = #`var tmp = ${prev};`;
    let next = "";
    for(let comma of inner){
        next = inner.next().value;
        output = output.concat(#`${prev} = ${next};`);
        prev = next;
    }
    if(next !== ""){
        return output.concat(#`${next} = tmp;`);
    }
    return result.concat(#`${prev} = tmp;`);
}

var a = 4;
var b = 5;
var c = 6;
var d = 7;
console.log("Pre : a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
rotate(a, b, c, d);
//console.log("Post : a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);


