/*
 Function demo

*/
function add(num1, num2) {
    var result = num1 + num2;
    return result;
}


var sum = add;

var result1 = add(1, 2);
var result2 = sum(3, 4);
console.log("result1=" + result1);
console.log("result2=" + result2);
