import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { TeamsComponent } from './teams/teams.component';
import { TeamsAddComponent } from './teams/teams-add/teams-add.component';
import { TeamsListComponent } from './teams/teams-list/teams-list.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ConferencesComponent } from './conferences/conferences.component';
import { ConferencesAddComponent } from './conferences/conferences-add/conferences-add.component';
import { ConferencesListComponent } from './conferences/conferences-list/conferences-list.component';
import { DivisionsComponent } from './divisions/divisions.component';
import { PlayersComponent } from './players/players.component';
import { DivisionsAddComponent } from './divisions/divisions-add/divisions-add.component';
import { DivisionsListComponent } from './divisions/divisions-list/divisions-list.component';
import { PlayersAddComponent } from './players/players-add/players-add.component';
import { PlayersListComponent } from './players/players-list/players-list.component';
import { FrontofficesComponent } from './frontoffices/frontoffices.component';
import { RecordsComponent } from './records/records.component';
import { RecordsAddComponent } from './records/records-add/records-add.component';
import { RecordsListComponent } from './records/records-list/records-list.component';
import { FrontofficesAddComponent } from './frontoffices/frontoffices-add/frontoffices-add.component';
import { FrontofficesListComponent } from './frontoffices/frontoffices-list/frontoffices-list.component';


@NgModule({
  declarations: [
    AppComponent,
    TeamsComponent,
    TeamsAddComponent,
    TeamsListComponent,
    NavbarComponent,
    ConferencesComponent,
    ConferencesAddComponent,
    ConferencesListComponent,
    DivisionsComponent,
    PlayersComponent,
    DivisionsAddComponent,
    DivisionsListComponent,
    PlayersAddComponent,
    PlayersListComponent,
    FrontofficesComponent,
    RecordsComponent,
    RecordsAddComponent,
    RecordsListComponent,
    FrontofficesAddComponent,
    FrontofficesListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
