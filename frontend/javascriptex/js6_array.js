/*
array demo
*/

var numbers = [10, 20, 30];

for (var i = 0; i < numbers.length; i++) {
    var iterated = numbers[i];
    console.log("iterated =" + iterated);
}

var words = ["hi", "hello", "good", "bad"];

for (var i = 0; i < words.length; i++) {
    var word = words[i]
    console.log("iterated =" + word);
}

var numbersTill9 = [];

for (var i = 0; i < 10; i++) {
    numbersTill9.push(i);
}

for (var i = 0; i < numbersTill9.length; i++) {
    var num = numbersTill9[i];
    console.log(num);
}