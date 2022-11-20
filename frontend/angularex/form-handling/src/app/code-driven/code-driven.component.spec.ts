import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CodeDrivenComponent } from './code-driven.component';

describe('CodeDrivenComponent', () => {
  let component: CodeDrivenComponent;
  let fixture: ComponentFixture<CodeDrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CodeDrivenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CodeDrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
