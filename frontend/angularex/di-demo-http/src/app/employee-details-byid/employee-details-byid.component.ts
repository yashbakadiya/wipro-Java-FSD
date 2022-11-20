import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { EmployeeService } from 'src/services/EmployeeService';
import { Employee } from '../model/Employee';

@Component({
  selector: 'app-employee-details-byid',
  templateUrl: './employee-details-byid.component.html',
  styleUrls: ['./employee-details-byid.component.css'],
})
export class EmployeeDetailsByidComponent {
  employee: Employee | undefined;
  idCtrl: FormControl;
  myform: FormGroup;
  constructor(builder: FormBuilder, private service: EmployeeService) {
    this.idCtrl = builder.control('');
    const mapping = { empId: this.idCtrl };
    this.myform = builder.group(mapping);
  }

  fetchEmployee(): void {
    const id: number = this.idCtrl.value;
    const observer = {
      next: (result: Employee) => {
        this.employee = result;
      },
      error: (error: Error) => {
        console.log('error received', error.message);
      }
    };
    const observable: Observable<Employee> = this.service.findById(id);
    observable.subscribe(observer);
  }
}
