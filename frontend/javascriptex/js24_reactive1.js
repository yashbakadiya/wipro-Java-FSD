/*
Reactive Programming using Promise
*/

function add(num1, num2) {
    if (!num1 || !num2) {
        let error = new Error("num 1 or num2 is undefined");
        let promise=Promise.reject(error);
        return promise;
    }

    let result = num1 + num2;
    let promise = Promise.resolve(result);
    return promise;
}

function useAdd() {
    let num1=3;
    let num2 = 2;
    let promise = add(num1, num2);
    let successHandler = (result) => {
        console.log("addition result is " + result);
    }
    let errHandler = (err) => {
        console.log("error is " + err.message);
    }
    promise.then(successHandler, errHandler);
    console.log("our program is continuing");
    console.log("bye");
}

useAdd();
