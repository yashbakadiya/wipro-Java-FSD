import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventbindingDemoComponent } from './eventbinding-demo.component';

describe('EventbindingDemoComponent', () => {
  let component: EventbindingDemoComponent;
  let fixture: ComponentFixture<EventbindingDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventbindingDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventbindingDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
