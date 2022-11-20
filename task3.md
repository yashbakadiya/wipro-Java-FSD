
/**
 exception handling task
 

package com.traningapps.customerms
**/

Customer{

id: long

name : String

age: int 

balance: double


}

RegularCustomer extends Customer{

offer:String 

}

BusinessCustomer extends Customer{

discount: double 


}




/*

store/array of Customer  

add regular customers an business customer in the store

iterate and display all customers in array

*/

CustomerMain{


//
// name length should be between 2 and 10
// min balance should be 5000
// offer length cant be only 3 letters 
//
 addRegularCustomer(id, name , age , balance, offer)


//
// name length should be between 2 and 10
// min balance should be 5000
// discount can't be negative  
//
 addBusinessCustomer(id, name , age , balance, discount)
 
 
 //handle exceptions and give proper messages to enduser

}
}

