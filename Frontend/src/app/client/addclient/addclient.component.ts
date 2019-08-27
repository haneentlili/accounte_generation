import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ClientService } from 'src/app/services/client.service';

@Component({
  selector: 'app-addclient',
  templateUrl: './addclient.component.html',
  styleUrls: ['./addclient.component.css']
})
export class AddclientComponent implements OnInit {
  clientForm: FormGroup = new FormGroup({
    nomClient: new FormControl(null, Validators.required),
   
    });


  constructor(private _router: Router,private _clientService: ClientService) { }

  ngOnInit() {
  }
  register() {
    if (!this.clientForm.valid ) {
      console.log('invalid form'); return;

    }

    this._clientService.addclient(JSON.stringify(this.clientForm.value))
      .subscribe(
        data => { console.log(data);  },

         error => console.error(error)

      );

}

}
