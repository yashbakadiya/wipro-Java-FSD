/*
 rest operator example
*/
let numbers=[1,2,3,4];
let [number1, number2, number3,number4]=numbers;

console.log(number1+","+number2+","+number3+","+number4);

let [num1, ...remaining]=numbers;

console.log("num1="+num1);

for(let iterated of remaining){
    console.log("iterated num="+iterated);
}