import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeDetailsRouteidComponent } from './employee-details-routeid.component';

describe('EmployeeDetailsRouteidComponent', () => {
  let component: EmployeeDetailsRouteidComponent;
  let fixture: ComponentFixture<EmployeeDetailsRouteidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeDetailsRouteidComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeDetailsRouteidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
