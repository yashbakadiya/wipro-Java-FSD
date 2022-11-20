/*
throw, catch error
*/

function wordStartingWithA(input) {
    if (input == undefined) {
        throw new Error("input is undefined");
    }
    let letter = input.charAt(0);
    if (letter == 'a' || letter == 'A') {
        return true;
    }
    return false;
}

let input;
try {
    let startsWithA = wordStartingWithA(input);
    console.log("starts with a =" + startsWithA);
}
catch (err) {
    console.log("err is " + err.message);
}