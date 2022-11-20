import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Employee } from 'src/model/Employee';
import { EmployeeService } from 'src/services/EmployeeService';

@Component({
  selector: 'employee-details-byname',
  templateUrl: './employee-details-byname.component.html',
  styleUrls: ['./employee-details-byname.component.css']
})
export class EmployeeDetailsBynameComponent  {

  employee:Employee|undefined;
  nameCtrl:FormControl;
  myform:FormGroup;
  constructor(builder:FormBuilder, private service:EmployeeService) { 
    this.nameCtrl=builder.control('');
    const mapping={empName:this.nameCtrl};
     this.myform=builder.group(mapping);
  }

  fetchEmployee():void{
    const name:string=this.nameCtrl.value;
    this.employee=this.service.findByName(name);
  }

}
