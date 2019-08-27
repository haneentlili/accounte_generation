import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ClientService } from 'src/app/services/client.service';

@Component({
  selector: 'app-getclients',
  templateUrl: './getclients.component.html',
  styleUrls: ['./getclients.component.css']
})
export class GetclientsComponent implements OnInit {
  clients:any;
  constructor(private _router :Router,private _clientService:ClientService) { }

  ngOnInit() {
    this._clientService.getclients().subscribe(
      data=>{
        this.clients=data;
        console.log(this.clients);
      },
      error=>console.error(error)
  )

  }

}
