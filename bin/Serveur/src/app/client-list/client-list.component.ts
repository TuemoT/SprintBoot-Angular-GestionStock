import { ClientDetailsComponent } from '../client-details/client-details.component';
import { Observable } from "rxjs";
import { ClientService } from "../client.service";
import { Client } from "../client";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

  import { format } from 'url';
@Component({
  selector: 'app-client-list',
  templateUrl: './client-list.component.html',
  styleUrls: ['./client-list.component.scss']
})
export class ClientListComponent implements OnInit {
  
  clients: Observable<Client[]>;

  constructor(private clientService: ClientService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.clients = this.clientService.getClientsList();
  }
  deleteClient(idClient: number) {
    this.clientService.deleteClient(idClient)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  clientDetails(idClient: number){
    this.router.navigate(['details', idClient]);
  }
}
