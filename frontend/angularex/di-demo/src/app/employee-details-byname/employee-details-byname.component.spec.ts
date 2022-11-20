import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeDetailsBynameComponent } from './employee-details-byname.component';

describe('EmployeeDetailsBynameComponent', () => {
  let component: EmployeeDetailsBynameComponent;
  let fixture: ComponentFixture<EmployeeDetailsBynameComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeDetailsBynameComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeDetailsBynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
