
Customer{

 id: long
 
 name: String
 age: int

}


ICustomerDao{

 add( customer :Cutomer ) : void

findById(long id): Customer

update(customer: Customer): void

}


ICustomerService{

register(String name, int age) 

findCustomerById(long customerId) throws CustomerNotFoundException : Customer

changeName(long customerId, String newName) throws CustomerNotFoundException : Customer


}

FrontEnd{

Use service and add 2 customers

find customer by id

change customer name

}

Validations

id can't be zero or negative

name can't be smaller than 2 letters and max 10 letters

age can't be smaller than 15 and more than 100




