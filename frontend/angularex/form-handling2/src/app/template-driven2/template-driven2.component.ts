import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Employee } from '../models/Employee';

@Component({
  selector: 'app-template-driven2',
  templateUrl: './template-driven2.component.html',
  styleUrls: ['./template-driven2.component.css'],
})
export class TemplateDriven2Component {
  isSent: boolean = false;
  employee: Employee = new Employee('', 0);


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
