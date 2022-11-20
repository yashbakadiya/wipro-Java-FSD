import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeDetailsByidComponent } from './employee-details-byid.component';

describe('EmployeeDetailsByidComponent', () => {
  let component: EmployeeDetailsByidComponent;
  let fixture: ComponentFixture<EmployeeDetailsByidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeDetailsByidComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeDetailsByidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
