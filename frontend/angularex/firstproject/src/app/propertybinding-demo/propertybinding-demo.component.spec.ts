import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropertybindingDemoComponent } from './propertybinding-demo.component';

describe('PropertybindingDemoComponent', () => {
  let component: PropertybindingDemoComponent;
  let fixture: ComponentFixture<PropertybindingDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PropertybindingDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PropertybindingDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
