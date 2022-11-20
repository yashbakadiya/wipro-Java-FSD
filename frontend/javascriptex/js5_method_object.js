/*
 declaring function as member of object
*/
var user = {
    username: "shivam",
    age: 21,
    displayUser: function () {
        console.log(this.username + " " + this.age);
    }

}

user.displayUser();