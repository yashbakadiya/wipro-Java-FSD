import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { InterpolationDemoComponent } from './interpolation-demo/interpolation-demo.component';
import { PropertybindingDemoComponent } from './propertybinding-demo/propertybinding-demo.component';
import { EventbindingDemoComponent } from './eventbinding-demo/eventbinding-demo.component';
import { TemplatevariableDemoComponent } from './templatevariable-demo/templatevariable-demo.component';
import { TwowaybindingDemoComponent } from './twowaybinding-demo/twowaybinding-demo.component';
import { StructuraldirectivesDemoComponent } from './structuraldirectives-demo/structuraldirectives-demo.component';
import { AttributeDirectiveComponent } from './attribute-directive/attribute-directive.component';
import { PipesDemoComponent } from './pipes-demo/pipes-demo.component';
import { LengthPipe } from './pipes/LengthPipe';
import { SmallestNumberPipe } from './pipes/smallest-number.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ProductDetailsComponent,
    InterpolationDemoComponent,
    PropertybindingDemoComponent,
    EventbindingDemoComponent,
    TemplatevariableDemoComponent,
    TwowaybindingDemoComponent,
    StructuraldirectivesDemoComponent,
    AttributeDirectiveComponent,
    PipesDemoComponent,
    LengthPipe,
    SmallestNumberPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
