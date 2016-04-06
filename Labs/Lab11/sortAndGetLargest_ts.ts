function swap(arr : [number], i : number, j : number) {
    var tmp : number = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
}
function sortAndGetLargest (arr : [number]) {
    var tmp : number = arr[0]; // largest elem
    var i : number;
    var j : number;
    for (i=0; i<arr.length; i++) {
        if (arr[i] > tmp)
            tmp = arr[i];
        for (j=i+1; j<arr.length; j++) {
            if (arr[i] < arr[j]) swap(arr, i, j);
        }
  }
  return tmp;
}
var largest = sortAndGetLargest([99,2,43,8,0,21,12]);
console.log(largest); // should be 99, but prints 0
