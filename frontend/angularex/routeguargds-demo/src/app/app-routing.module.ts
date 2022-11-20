import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { ErrorComponent } from './error/error.component';
import { FormGuard } from './form.guard';
import { UrlGuard } from './url.guard';

const routes: Routes = [
  {
    path: 'employee/:id',
    component: EmployeeDetailsComponent,
    canActivate: [UrlGuard]
  },

  {
   path: 'add',
   component:AddEmployeeComponent,
   canDeactivate: [FormGuard]
  
  },

  {
    path: 'error', component:ErrorComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
