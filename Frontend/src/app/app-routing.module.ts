import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreatecompteComponent } from './compte/createcompte/createcompte.component';
import { AddclientComponent } from './client/addclient/addclient.component';
import { GetcompteComponent } from './compte/getcompte/getcompte.component';
import { GetclientsComponent } from './client/getclients/getclients.component';
import { VersementComponent } from './versement/versement.component';

const routes: Routes = [
  {path:'createcompte',component:CreatecompteComponent},
  {path:'addclient',component:AddclientComponent},
  {path:'getcompte/:id',component:GetcompteComponent},
  {path:'getclients',component:GetclientsComponent},
  {path:'versement',component:VersementComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
