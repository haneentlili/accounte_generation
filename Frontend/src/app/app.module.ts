import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CompteService } from './services/compte.service';
import { CreatecompteComponent } from './compte/createcompte/createcompte.component';
import { HttpClientModule } from '@angular/common/http';
import { AddclientComponent } from './client/addclient/addclient.component';
import { ClientService } from './services/client.service';
import { GetcompteComponent } from './compte/getcompte/getcompte.component';
import { GetclientsComponent } from './client/getclients/getclients.component';

@NgModule({
  declarations: [
    AppComponent,
    CreatecompteComponent,
    AddclientComponent,
    GetcompteComponent,
    GetclientsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule

    
  ],
  providers: [
    CompteService,
    ClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
