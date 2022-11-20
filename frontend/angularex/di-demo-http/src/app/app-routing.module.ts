import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeDetailsByidComponent } from './employee-details-byid/employee-details-byid.component';
import { EmployeeDetailsRouteidComponent } from './employee-details-routeid/employee-details-routeid.component';
import { ListEmployeesComponent } from './list-employees/list-employees.component';

const routes: Routes = [
  {path: 'list', component:ListEmployeesComponent},
  {path: 'detailsbyid', component:EmployeeDetailsByidComponent},
  {path: 'detailsbyrouteid/:id', component:EmployeeDetailsRouteidComponent},
  {path: 'add', component:AddEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
