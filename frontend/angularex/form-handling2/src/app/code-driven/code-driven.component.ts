import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from '../models/Employee';

@Component({
  selector: 'app-code-driven',
  templateUrl: './code-driven.component.html',
  styleUrls: ['./code-driven.component.css']
})
export class CodeDrivenComponent  {
 employee:Employee|undefined;

 nameCtrl:FormControl;
 ageCtrl:FormControl;
 myform:FormGroup;


 constructor(builder:FormBuilder){
   this.nameCtrl=builder.control('',[Validators.required, Validators.minLength(2)]);
   this.ageCtrl=builder.control('',[Validators.required,Validators.min(18), Validators.max(100)]);
   const mappingObj={
    empName:this.nameCtrl,
    empAge:this.ageCtrl
  };
   this.myform=builder.group(mappingObj);

 }

  addEmployee() {
    console.log('inside addEmployee form data ');
    if(!this.myform.valid){
      this.myform.markAllAsTouched();
      return;
    }
   
    const empName:string=this.nameCtrl.value;
    const empAge:number=this.ageCtrl.value;
    this.employee=new Employee(empName,empAge); 
  }

  isControlTouchedOrDirty(control:FormControl){
  return (control.touched || control.dirty);
  }

  isControlRequireValid(control:FormControl){
    const touchedOrDirty=this.isControlTouchedOrDirty(control);
    if(!touchedOrDirty){
      return true;
    }
    return !control.errors?.required;
  }

  isNameCtrlRequireValid(){
    const valid=this.isControlRequireValid(this.nameCtrl);
     return valid;  
  }

  isNameCtrlMinLengthValid(){
    const touchedOrDirty=this.isControlTouchedOrDirty(this.nameCtrl);
    if(!touchedOrDirty){
      return true;
    }
    return  !this.nameCtrl.errors?.minlength
  }

  isAgeCtrlRequireValid(){
   const valid:boolean=this.isControlRequireValid(this.ageCtrl);
   return valid;
  }

  isAgeCtrlMinOrMaxValid(){
    const touchedOrDirty=this.isControlTouchedOrDirty(this.ageCtrl);
    if(!touchedOrDirty){
      return true;
    }
    return !(this.ageCtrl.errors?.min || this.ageCtrl.errors?.max )
  }

}
