import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplateDriven1Component } from './template-driven1.component';

describe('TemplateDriven1Component', () => {
  let component: TemplateDriven1Component;
  let fixture: ComponentFixture<TemplateDriven1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TemplateDriven1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplateDriven1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
