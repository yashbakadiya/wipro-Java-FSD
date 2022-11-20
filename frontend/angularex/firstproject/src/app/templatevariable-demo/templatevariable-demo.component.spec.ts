import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplatevariableDemoComponent } from './templatevariable-demo.component';

describe('TemplatevariableDemoComponent', () => {
  let component: TemplatevariableDemoComponent;
  let fixture: ComponentFixture<TemplatevariableDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TemplatevariableDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplatevariableDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
