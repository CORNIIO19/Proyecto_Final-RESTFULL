import { RouterModule, Routes } from '@angular/router';
import { EmpleadoNominaComponent} from './components/empleado-nomina/empleado-nomina.component';
import { NgModule } from '@angular/core';

export const routes: Routes = [
    {path: '', redirectTo: 'empleado', pathMatch: 'full'},
    {path: 'empleado', component: EmpleadoNominaComponent},
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
