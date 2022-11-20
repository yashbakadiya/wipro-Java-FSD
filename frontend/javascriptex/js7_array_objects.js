/*
array and objects
*/

var users = [];

var user1 = {
    username: "shivam",
    age: 21,
    displayUser: function () {
        console.log(this.username + " " + this.age);
    }

};

users.push(user1);

var user2 = {
    username: "ajay",
    age: 22,
    displayUser: function () {
        console.log(this.username + " " + this.age);
    }

};

users.push(user2);


for (var i =0;i<users.length;i++){
    var iteratedUser=users[i];
    iteratedUser.displayUser();
}

