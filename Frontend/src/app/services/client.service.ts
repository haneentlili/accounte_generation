import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor(private _http: HttpClient) { }
  addclient(body: any) {
    return this._http.post('http://localhost:8080/clients', body, {
      observe: 'body',
      headers: new HttpHeaders().append('Content-Type', 'application/json')

    });

  }
  getclients() {
    return  this._http.get('http://localhost:8080/clients', {
      observe: 'body',
      headers: new HttpHeaders().append('Content-Type', 'application json')
    });
  
  }
}
