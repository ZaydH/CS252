var largest;

function swap(arr,i,j) {
  "use strict";
  var tmp;
  tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
}
function sortAndGetLargest (arr) {
  "use strict";
  var tmp;
  var i;
  var j;
  tmp = arr[0]; // largest elem
  for (i=0; i<arr.length; i += 1) {
    if (arr[i] > tmp){ 
        tmp = arr[i];
    }
    for (j=i+1; j<arr.length; j += 1){
      if (arr[i] < arr[j]) {
        swap(arr,i,j);
      }
    }
  }
  return tmp;
}

largest = sortAndGetLargest([99,2,43,8,0,21,12]);
console.log(largest); // should be 99, but prints 0

