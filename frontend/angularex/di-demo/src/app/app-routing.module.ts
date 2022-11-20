import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeDetailsBynameComponent } from './employee-details-byname/employee-details-byname.component';
import { ListEmployeesComponent } from './list-employees/list-employees.component';

const routes: Routes = [
  {path: 'list', component:ListEmployeesComponent},
  {path: 'detailsbyname', component:EmployeeDetailsBynameComponent},
  {path: 'add', component:AddEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
