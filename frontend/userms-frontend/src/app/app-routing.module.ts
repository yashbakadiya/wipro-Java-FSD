import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginGuard } from './guards/login.guard';
import { ListProductsComponent } from './list-products/list-products.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [

  {path:"login",component:LoginComponent },
  {path:"dashboard",component:DashboardComponent,canActivate:[LoginGuard] },
  {path:"list-products",component:ListProductsComponent, canActivate:[LoginGuard] }
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
