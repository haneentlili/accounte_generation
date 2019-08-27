import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OperationService {

  constructor(private _http: HttpClient) { }
  verser(code:number,montant:number) {
    return  this._http.put(`http://localhost:8080/versement?code=${code}&montant=${montant}`, {
      headers: new HttpHeaders().append('Content-Type', 'application json')
    });

  }

}
