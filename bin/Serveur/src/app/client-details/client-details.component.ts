import { Client } from './../client';
import { Component, OnInit, Input } from '@angular/core';
import { ClientService } from '../client.service';
import { ClientListComponent } from '../client-list/client-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-client-details',
  templateUrl: './client-details.component.html',
  styleUrls: ['./client-details.component.scss']
})
export class ClientDetailsComponent implements OnInit {

  
  idClient: number;
  client: Client;

  constructor(private route: ActivatedRoute,private router: Router,
    private clientService: ClientService) { }

  ngOnInit() {
    this.client = new Client();
    

    this.idClient = this.route.snapshot.params['idClient'];
    
    this.clientService.getClient(this.idClient)
      .subscribe(data => {
        console.log(data)
        this.client = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['clients']);
  }
}