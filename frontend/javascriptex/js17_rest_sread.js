/*
 rest operator example
*/

function add(...numbers) {
    let sum = 0;
    for (let num of numbers) {
    sum=sum+num;
    }
  return sum;

}

let result1=add(1);
let result2=add(1,2);
let result3=add(1,2,3);
console.log("result1="+result1);
console.log("result2="+result2);
console.log("result3="+result3);