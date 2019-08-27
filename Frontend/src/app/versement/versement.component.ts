import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { OperationService } from '../services/operation.service';

@Component({
  selector: 'app-versement',
  templateUrl: './versement.component.html',
  styleUrls: ['./versement.component.css']
})
export class VersementComponent implements OnInit {

  VersementForm: FormGroup = new FormGroup({
    code: new FormControl(null, Validators.required),

    montant: new FormControl(null, Validators.required)
  });

  constructor(private operationService: OperationService) { }

  ngOnInit() {
  }
  verser() {
    if (!this.VersementForm.valid ) {
      console.log('invalid form'); return;

    }
    console.log(this.VersementForm.get('code').value)

    this.operationService.verser(this.VersementForm.get('code').value,this.VersementForm.get('montant').value)
      .subscribe(
        data => { console.log(data);  },

         error => console.error(error)

      );
  }

}
