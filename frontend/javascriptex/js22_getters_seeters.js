/*
getter setter
*/

class Employee {
    _id;

    constructor(id) {
        this._id = id;
    }

    get id() {
        console.log("inside getter");
        return this._id;
    }

    set id(id) {
        console.log("inside setter id="+id);
        this._id = id;
    }

}

let emp=new Employee(8);
//let idVal=emp.id;
//console.log(idVal);
emp.id=20;



