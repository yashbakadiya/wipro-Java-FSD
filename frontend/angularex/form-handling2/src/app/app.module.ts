import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemplateDriven1Component } from './template-driven1/template-driven1.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TemplateDriven2Component } from './template-driven2/template-driven2.component';
import { CodeDrivenComponent } from './code-driven/code-driven.component';

@NgModule({
  declarations: [
    AppComponent,
    TemplateDriven1Component,
    TemplateDriven2Component,
    CodeDrivenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
