import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CompteService } from 'src/app/services/compte.service';

@Component({
  selector: 'app-createcompte',
  templateUrl: './createcompte.component.html',
  styleUrls: ['./createcompte.component.css']
})
export class CreatecompteComponent implements OnInit {
  CompteForm: FormGroup = new FormGroup({
    type: new FormControl(null, Validators.required),
    client: new FormGroup({
      codeClient:new FormControl(null,Validators.required),
      nomClient: new FormControl(null,Validators.required)
    }),
    solde: new FormControl(null, Validators.required),
    decouvert: new FormControl(null, Validators.required),
    
  });

  constructor(private _router: Router, private _compteService: CompteService) { }

  ngOnInit() {
  }
  register() {
    if (!this.CompteForm.valid ) {
      console.log('invalid form'); return;

    }

    this._compteService.createcompte(JSON.stringify(this.CompteForm.value))
      .subscribe(
        data => { console.log(data);  },

         error => console.error(error)

      );

}
}