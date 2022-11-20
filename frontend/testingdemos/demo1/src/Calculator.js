function add(num1, num2) {
    if(!num1 || !num2){
        return undefined;
    }
    return num1 + num2;
}

function isEven(num) {

    return (num % 2 === 0);

}

function newUser(id, name){
    let user={
        id:id,
        name: name
    };
    return user;
}