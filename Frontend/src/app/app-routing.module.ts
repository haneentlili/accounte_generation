import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreatecompteComponent } from './compte/createcompte/createcompte.component';

const routes: Routes = [
  {path:'createcompte',component:CreatecompteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
