function add2(a,b){return a+b;}
function sub2(a,b){return a-b;}
function double(a){ return 2*a; }

function my_foldl(b, arr, f){
	if(arr.length == 0) return b;
	return my_foldl(f(b, arr[0]), arr.slice(1), f);
}

function my_foldr(b, arr, f){
	if(arr.length == 0) return b;
	return f(arr[0], my_foldr(b, arr.slice(1), f));
}

function my_map(arr, f){
	if(arr.length ==0) return[];
	return [f(arr[0])].concat(my_map(arr.slice(1), f));
}


var myArr=[1,2,3,4];
console.log("my_foldl add = " + my_foldl(0, myArr, add2));
console.log("my_foldl sub = " + my_foldl(0, myArr, sub2));
console.log("my_foldr sub = " + my_foldr(0, myArr, sub2));
var arr=my_map(myArr, double);
console.log("map double = " + arr);
console.log("my_foldl sub = " + my_foldr(0, arr, sub2));