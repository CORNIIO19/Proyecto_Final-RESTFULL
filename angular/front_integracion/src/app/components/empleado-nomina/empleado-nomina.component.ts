import { Component, OnInit } from '@angular/core';
import { Employee, EmpleadoService } from '/Users/diego/OneDrive/Documentos/integracion_sistemas/proyecto_integracion/angular/front_integracion/src/app/services/empleado.service';
import { Nomina, NominaService } from '/Users/diego/OneDrive/Documentos/integracion_sistemas/proyecto_integracion/angular/front_integracion/src/app/services/nomina.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-empleado-nomina',
  imports: [CommonModule],
  templateUrl: './empleado-nomina.component.html',
  styleUrl: './empleado-nomina.component.css'
})
export class EmpleadoNominaComponent implements OnInit {
  nomina: Nomina[] = [];
  employee: Employee[] = [];

  constructor(private empleadoService: EmpleadoService, private nominaService: NominaService) { }

  ngOnInit(): void {
    this.empleadoService.getEmployee().subscribe(
      (data: Employee[]) => {
        this.employee = data;
      }
    )
    this.nominaService.getNomina().subscribe(
      (data: Nomina[]) => {
        this.nomina = data;
      }
    );
  };

}




