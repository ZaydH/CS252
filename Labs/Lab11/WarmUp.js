/**
 * Created by zhammoud on 4/4/2016.
 */


function makeListOfAdders(x){
    var listAdders = []
    for(var i = 0; i < x.length; i++){
        listAdders.push(
            function(y){return x[i] + y;}
        )
    }
    return listAdders;
}

a=makeListOfAdders([1,5])
console.log("" + a[0](43 ));
console.log("" + a[1](42));