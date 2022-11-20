var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
/*
class example
*/
var Student = /** @class */ (function () {
    function Student(name, age) {
        this.name = name;
        this.age = age;
    }
    Student.prototype.displayDetails = function () {
        console.log("name=" + this.name);
        console.log("age=" + this.age);
    };
    return Student;
}());
var student1 = new Student("anusha", 22);
console.log(student1.name + "," + student1.age);
var CseStudent = /** @class */ (function (_super) {
    __extends(CseStudent, _super);
    function CseStudent(name, age, language) {
        var _this = _super.call(this, name, age) || this;
        _this.language = language;
        return _this;
    }
    CseStudent.prototype.displayDetails = function () {
        _super.prototype.displayDetails.call(this);
        console.log("language=" + this.language);
    };
    return CseStudent;
}(Student));
var cse1 = new CseStudent('ayush', 22, 'java');
cse1.displayDetails();
