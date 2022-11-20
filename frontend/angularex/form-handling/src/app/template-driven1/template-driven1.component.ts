import { Component, OnInit } from '@angular/core';
import { iif } from 'rxjs';
import { Employee } from '../models/Employee';

@Component({
  selector: 'app-template-driven1',
  templateUrl: './template-driven1.component.html',
  styleUrls: ['./template-driven1.component.css'],
})
export class TemplateDriven1Component {
  employee: Employee | undefined;

  isAgeValid(age: number) {
    return age >= 18;
  }

  addEmployee(myform: any) {
    console.log('myform', myform);
    if (!myform.form.valid) {
      myform.form.markAllAsTouched();
      return;
    }
    const data = myform.value;
    console.log('inside addEmployee form data ', data);
    const empName: string = data.empName;
    const empAge: number = data.empAge;
    const ageValid = this.isAgeValid(empAge);
    console.log("age valid", ageValid , empAge);
    if(ageValid==false){
     return;
    }

    this.employee = new Employee(empName, empAge);
  }
}
