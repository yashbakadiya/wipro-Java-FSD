import { Component, OnInit } from '@angular/core';
import {
  ActivatedRoute,
  ActivatedRouteSnapshot,
  ParamMap,
} from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css'],
})
export class EmployeeDetailsComponent {
  id: number | undefined;
  employee: Employee | undefined;
  employees: Employee[] = [
    { id: 1, name: 'shivam' },
    { id: 2, name: 'repul' },
    { id: 3, name: 'harsha' },
  ];

  
  constructor(route: ActivatedRoute) {
    const observer = {
      next: (result: ParamMap) => {
        const idFetched = result.get('id');
        this.id = parseInt(idFetched);
        this.employee=this.findEmployeeById(this.id);
      },
    };
    
    const observable: Observable<ParamMap> = route.paramMap;
    observable.subscribe(observer);
  }
  
  


  findEmployeeById(id: number) {
    for (let emp of this.employees) {
      if (emp.id === id) {
        return emp;
      }
    }
    return undefined;
  }
}
