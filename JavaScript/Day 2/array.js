let arr = [1,3,32,2,"Mayuresh"];
for(let i =0;i<=arr.length-1;i++){
console.log(arr[i]);
}
//type of operator
console.log(typeof arr[4]);
 //Destructuring of array
const arr1 = [1,3,32,2,"Mayuresh"];
let var1=arr1[0];
let var2=arr1[1];

console.log(var1);
console.log(var2);

//spread operator
let arr2=[1,2,3,4,5];
let arr3=[...arr2,6];
console.log(arr3);