/*
 *  Object demo
 */
var user1 = {
    username: 'repul',
    age: 21
};

var user2 = {
    username: 'shivam',
    age: 22
};


function displayUser(user) {
    console.log("user details=" + user.username + " ," + user.age);
}

displayUser(user1);
displayUser(user2);

