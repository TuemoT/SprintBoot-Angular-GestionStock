import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Client } from './client';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private baseUrl = 'http://localhost:7070/api/v1';

  constructor(private http: HttpClient) { }

  getClient(idClient: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${idClient}`);
  }

  createClient(client: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, Client);
    return this.http.post<Client>('./client/api/v1/addClient', client);
  }

  updateClient(idClient: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${idClient}`, value);
  }

  deleteClient(idClient: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${idClient}`, { responseType: 'text' });
  }

  getClientsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
