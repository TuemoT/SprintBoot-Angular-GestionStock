import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientDetailsComponent } from './client-details/client-details.component';
import { CreateClientComponent } from './create-client/create-client.component';

import { ClientListComponent } from './client-list/client-list.component';
import { UpdateClientComponent } from './update-client/update-client.component';

const routes: Routes = [
  { path: '', redirectTo: 'client', pathMatch: 'full' },
  { path: 'clients', component: ClientListComponent },
  { path: 'add', component: CreateClientComponent },
  { path: 'update/:idClient', component: UpdateClientComponent },
  { path: 'details/:idClient', component: ClientDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
