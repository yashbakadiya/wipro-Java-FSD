import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StructuraldirectivesDemoComponent } from './structuraldirectives-demo.component';

describe('StructuraldirectivesDemoComponent', () => {
  let component: StructuraldirectivesDemoComponent;
  let fixture: ComponentFixture<StructuraldirectivesDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StructuraldirectivesDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StructuraldirectivesDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
