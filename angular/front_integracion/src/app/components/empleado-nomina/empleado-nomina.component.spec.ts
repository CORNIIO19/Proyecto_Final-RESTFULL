import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpleadoNominaComponent } from './empleado-nomina.component';

describe('EmpleadoNominaComponent', () => {
  let component: EmpleadoNominaComponent;
  let fixture: ComponentFixture<EmpleadoNominaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmpleadoNominaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmpleadoNominaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
