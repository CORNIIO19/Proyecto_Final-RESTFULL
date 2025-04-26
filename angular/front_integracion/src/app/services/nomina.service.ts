import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Nomina {
  id: number;
  rol: string;
  salario: string;
}

@Injectable({
  providedIn: 'root'
})
export class NominaService {
  private apiUrl = 'http://localhost:8081/nomina'; // Cambia esto a la URL de tu API

  constructor(private http: HttpClient) { }

  getNomina(): Observable<Nomina[]> {
    return this.http.get<Nomina[]>(this.apiUrl);
  }

  getNominaById(id: number): Observable<Nomina> {
    return this.http.get<Nomina>(`${this.apiUrl}/${id}`);
  }

  createNomina(nomina: Nomina): Observable<Nomina> {
    return this.http.post<Nomina>(this.apiUrl, nomina);
  }

  updateNomina(id: number, nomina: Nomina): Observable<Nomina> {
    return this.http.put<Nomina>(`${this.apiUrl}/${id}`, nomina);
  }

  deleteNomina(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
