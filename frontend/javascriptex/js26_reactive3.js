/*
Reactive Programming using Promise
*/

function add(num1, num2) {
    let promise = new Promise((resolve, reject) => {
        if (!num1 || !num2) {
            reject(new Error("num1 or num2 is undefined"));
        }

        setTimeout(() => {
            let result = num1 + num2;
            resolve(result);
        }, 10000);

    });
    return promise;

}

function useAdd() {
    let num1 = 3;
    let num2 = 2;
    let successHandler = (result) => {
        console.log("addition result is " + result);
    }
    let errHandler = (err) => {
        console.log("error is " + err.message);
    }
    let promise = add(num1, num2);
    promise.then(successHandler, errHandler);
    console.log("our program is about to end");
    console.log("bye");
}

useAdd();
