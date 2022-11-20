var Employee = /** @class */ (function () {
    //public  name: string;
    function Employee(name) {
        this.name = name;
        //  this.name=name;
    }
    return Employee;
}());
var emp = new Employee('roshi');
console.log(emp.name);
