import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EventbindingDemoComponent } from './eventbinding-demo/eventbinding-demo.component';
import { InterpolationDemoComponent } from './interpolation-demo/interpolation-demo.component';
import { PipesDemoComponent } from './pipes-demo/pipes-demo.component';
import { StructuraldirectivesDemoComponent } from './structuraldirectives-demo/structuraldirectives-demo.component';
import { TwowaybindingDemoComponent } from './twowaybinding-demo/twowaybinding-demo.component';

const routes: Routes = [
  {
    path: 'interpolation',
    component: InterpolationDemoComponent,
  },

  {
    path:'eventbinding',
    component:EventbindingDemoComponent
  },

  {
    path:"structural",
    component:StructuraldirectivesDemoComponent
  }
,
  {
    path: 'twoway',
    component: TwowaybindingDemoComponent,
  },
  {
    path: 'pipes',
    component: PipesDemoComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
