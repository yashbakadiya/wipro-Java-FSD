import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/model/Employee';
import { EmployeeService } from 'src/services/EmployeeService';

@Component({
  selector: 'list-employees',
  templateUrl: './list-employees.component.html',
  styleUrls: ['./list-employees.component.css']
})
export class ListEmployeesComponent  {

  employees:Employee[];

  constructor(private service:EmployeeService) { 
    this.employees=service.getAllEmployees();
  }


}
