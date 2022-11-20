import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwowaybindingDemoComponent } from './twowaybinding-demo.component';

describe('TwowaybindingDemoComponent', () => {
  let component: TwowaybindingDemoComponent;
  let fixture: ComponentFixture<TwowaybindingDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TwowaybindingDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TwowaybindingDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
