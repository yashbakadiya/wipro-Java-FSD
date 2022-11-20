import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { iif } from 'rxjs';
import { Employee } from '../models/Employee';

@Component({
  selector: 'app-template-driven1',
  templateUrl: './template-driven1.component.html',
  styleUrls: ['./template-driven1.component.css'],
})
export class TemplateDriven1Component {
  employee: Employee | undefined;

 

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


  isControlTouchedOrDirty(control:FormControl):boolean{
    return (control.touched || control.dirty);
    }


  isControlRequireValid(control:FormControl):boolean{
    const touchedOrDirty=this.isControlTouchedOrDirty(control);
    if(!touchedOrDirty){
      return true;
    }
    return !control.errors?.required;
  }
  
    isNameCtrlRequireValid(nameCtrl:FormControl):boolean{
     const valid=this.isControlRequireValid(nameCtrl);
     return valid;
  
    }
  
    isNameCtrlMinLengthValid(nameCtrl:FormControl):boolean{
      const touchedOrDirty=this.isControlTouchedOrDirty(nameCtrl);
      if(!touchedOrDirty){
        return true;
      }
      return  !nameCtrl.errors?.minlength
    }
  
    isAgeCtrlRequireValid(ageCtrl:FormControl):boolean{
     const valid=this.isControlRequireValid(ageCtrl);
     return valid;
    }
  

    isAgeValid(age: number):boolean {
      return age >= 18 && age<=100;
    }

    isAgeCtrlMinOrMaxValid(ageCtrl:FormControl):boolean{
      const touchedOrDirty=this.isControlTouchedOrDirty(ageCtrl);
      if(!touchedOrDirty){
        return true;
      }
      const value=ageCtrl.value;
      const valid=this.isAgeValid(value);
      return valid;
    }
  
}
