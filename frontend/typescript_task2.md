

Customer{

id: number

name : String

age: number 

balance: number

displayDetails():void

}

RegularCustomer extends Customer{

offer:String 

displayDetails():void

}

BusinessCustomer extends Customer{

discount: double 

displayDetails(): void

}




/*

store/array of Customer  

add regular customers an business customer in the store

iterate and display all customers in array

*/


