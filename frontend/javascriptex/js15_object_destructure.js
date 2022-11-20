/*
object destructuring 
*/
let user={username:"gautam", age:'21'};
let username1=user.username;
let age1=user.age;

let {username:username2, age:age2}=user;
console.log("username2="+username2);
console.log("age2="+age2);

let {username,age}=user;

console.log("username="+username);
console.log("age="+age);