import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CompteService {

  constructor(private _http: HttpClient) { }
  createcompte(body: any) {
    return this._http.post('http://localhost:8080/comptesave', body, {
      observe: 'body',
      headers: new HttpHeaders().append('Content-Type', 'application/json')

    });

  }
}
