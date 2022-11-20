import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from 'src/app/model/Employee';
import { EmployeeService } from 'src/services/EmployeeService';

@Component({
  selector: 'list-employees',
  templateUrl: './list-employees.component.html',
  styleUrls: ['./list-employees.component.css'],
})
export class ListEmployeesComponent {
  employees: Employee[] | undefined;

  constructor(private service: EmployeeService) {
    const observer = {
      next: (result: Employee[]) => {
        this.employees = result;
      },

      error: (err: Error) => {
        console.log('error received', err.message);
      },
    };
    const observable: Observable<Employee[]> = service.getAllEmployees();
    observable.subscribe(observer);
  }
}
