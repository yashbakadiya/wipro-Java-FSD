/*
spread operators 
*/

let user1={username:"shivam", age:21, company:'wipro'};
let user2={...user1};
user1.username='ajay';
console.log("user2="+user2.username+" ,"+user2.age+","+user2.company);

let user3={...user1,username:'anurag'};
console.log("user3="+user3.username+","+user3.age+","+user3.company);
