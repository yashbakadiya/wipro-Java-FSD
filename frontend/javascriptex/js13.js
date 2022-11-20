/*
fetch object members value dynamically
*/

let user={
    username: "lakshmi",
    age:21
};

let product={
    productName: "samsung",
    price: 20000
}

let username1=user['username'];
let age1=user['age'];

function getValue(object, fieldName){
    let fieldValue=object[fieldName];
    return fieldValue;
}

let username2=getValue(user,'username');
let age2=getValue(user,'age');
console.log("username2="+username2);
console.log("age2="+age2);

let price1=getValue(product,'price');
console.log(price1);