/*
arrow functions
*/

let add=function(num1, num2){
let result=num1+num2;
return result;
};

let sumFun1=(num1, num2)=>num1+num2;

let sumFun2=(num1, num2)=>{
    let result=num1+num2;
    return result;
}

let result2=sumFun1(1,2);
console.log("result2="+result2);

let result3=sumFun2(4,5);
console.log("result3="+result3);