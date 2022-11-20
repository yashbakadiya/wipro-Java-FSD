
## Layered Architection Spring Dependency injection task


Employee{

 id: long
 
 name: String
 age: int

}


IEmployeeDao{

 add( employee : Employee ) : void

findById(long id): Employee

update(employee: Employee): void

}


IEmployeeService{

register(String name, int age): Employee 

findEmployeeById(long empId) throws EmployeeNotFoundException : Employee

changeName(long empId, String newName) throws EmployeeNotFoundException : Employee


}

FrontEnd{

Use service and add 2 employees

find employee by id and display details

change employee name and display details

}

Validations

id can't be zero or negative

name can't be smaller than 2 letters and max 10 letters

age can't be smaller than 18 and more than 60




