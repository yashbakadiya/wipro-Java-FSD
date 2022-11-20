import { Component, OnInit } from '@angular/core';
import { Employee } from '../models/Employee';

@Component({
  selector: 'app-template-driven2',
  templateUrl: './template-driven2.component.html',
  styleUrls: ['./template-driven2.component.css'],
})
export class TemplateDriven2Component {
  isSent: boolean = false;
  employee: Employee = new Employee('', 0);

  isAgeValid(age:number): boolean {
    return age >= 18;
  }

  addEmployee(myform: any) {
    if(!this.isAgeValid(this.employee.empAge)){
      return;
    }
    if(!myform.form.valid){
      myform.form.markAllAsTouched();
      return;
    }
    console.log('inside addEmployee form data ');
    this.isSent = true;
  }
}
