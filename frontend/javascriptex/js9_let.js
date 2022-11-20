/*
let is block scoped, variable declared with let is only visible in the block it is declared
*/

function display(){
    if(true){
        let msg="hello";
    }
    msg="hi";
    console.log(msg);
 }
 
 display();