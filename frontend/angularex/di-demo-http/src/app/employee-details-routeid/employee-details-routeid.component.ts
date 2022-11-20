import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { observable, Observable } from 'rxjs';
import { EmployeeService } from 'src/services/EmployeeService';
import { Employee } from '../model/Employee';

@Component({
  selector: 'app-employee-details-routeid',
  templateUrl: './employee-details-routeid.component.html',
  styleUrls: ['./employee-details-routeid.component.css'],
})
export class EmployeeDetailsRouteidComponent {
  employee: Employee | undefined;


  constructor(private route: ActivatedRoute, private service: EmployeeService) {
    const observable: Observable<ParamMap> = route.paramMap;
    const observer={
      next: (result:ParamMap)=>{
        const idVal=  result.get('id');
        const id:number=parseInt(idVal);
        console.log("id fetched from route="+id);
        this.fetchEmployee(id);
      }
    }
     observable.subscribe(observer);
  
  }

  fetchEmployee(id:number): void {
    const observer = {
      next: (result: Employee) => {
        this.employee = result;
      },
      error: (error: Error) => {
        console.log('error received', error.message);
      },
    };
    const observable: Observable<Employee> = this.service.findById(id);
    observable.subscribe(observer);
  }
}
