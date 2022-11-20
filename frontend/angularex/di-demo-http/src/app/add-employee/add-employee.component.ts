import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { nextTick } from 'process';
import { Observable } from 'rxjs';
import { Employee } from 'src/app/model/Employee';
import { EmployeeService } from 'src/services/EmployeeService';

@Component({
  selector: 'add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent  {
  added:boolean=false;
  employee:Employee|undefined;
  nameCtrl:FormControl;
  ageCtrl:FormControl;
  myform:FormGroup;
  constructor(builder:FormBuilder, private service:EmployeeService) { 
    this.nameCtrl=builder.control('');
    this.ageCtrl=builder.control('');

    const mapping={
      empName:this.nameCtrl,
      empAge:this.ageCtrl
    };
     this.myform=builder.group(mapping);
  }

  addEmployee(){
    const name=this.nameCtrl.value;
    const age=this.ageCtrl.value;
    const employee:Employee=new Employee(name,age);
    const observer={
      next: (result:Employee)=>{
        this.employee=result;
        this.added=true;
      },
      error: (error:Error)=>{
           console.log("error is received ",error.message);
      }
    };
    const observable:Observable<Employee>=this.service.addEmployee(employee);
    observable.subscribe(observer);
  }

}
