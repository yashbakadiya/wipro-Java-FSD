let array1=[1,2,3];
let array2=[4,5,6];
let consolidatedArray=[...array1, ...array2];

for(let num of consolidatedArray){
    console.log(num);
}