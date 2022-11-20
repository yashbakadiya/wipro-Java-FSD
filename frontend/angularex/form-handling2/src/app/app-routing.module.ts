import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CodeDrivenComponent } from './code-driven/code-driven.component';
import { TemplateDriven1Component } from './template-driven1/template-driven1.component';
import { TemplateDriven2Component } from './template-driven2/template-driven2.component';

const routes: Routes = [
  {
    path: 'template-driven1',
    component: TemplateDriven1Component,
  },
  {
    path: 'template-driven2',
    component: TemplateDriven2Component,
  },

  {
    path: 'code-driven',
    component: CodeDrivenComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
