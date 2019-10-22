import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ConsultaComponent } from './consulta/consulta.component';
import { TimeComponent } from './time/time.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'consulta', component: ConsultaComponent},
  {path: 'time', component: TimeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
