import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { IFormComponent } from '../IFormComponent';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css'],
})
export class AddEmployeeComponent implements IFormComponent {
  employee: Employee | undefined;

  nameCtrl: FormControl;
  myform: FormGroup;

  constructor(builder: FormBuilder) {
    this.nameCtrl = builder.control('');
    const mappingObj = {
      empName: this.nameCtrl,
    };
    this.myform = builder.group(mappingObj);
  }

  addEmployee() {
    console.log('inside addEmployee form data ');
    if (!this.myform.valid) {
      this.myform.markAllAsTouched();
      return;
    }

    const empName: string = this.nameCtrl.value;
    this.employee = new Employee();
    this.employee.name = empName;
  }

  getFormGroup(): FormGroup {
    return this.myform;
  }
}
