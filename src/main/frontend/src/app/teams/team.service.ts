import { HttpClient } from "@angular/common/http";
import {EventEmitter, Injectable} from "@angular/core";
import {Observable} from "rxjs/Observable";
import {Team} from "./team.model";

@Injectable()
export class TeamService {

  onTeamAdded = new EventEmitter<Team>();


  constructor(private http: HttpClient) {

  }

  getTeams(): Observable<any> {
    return this.http.get('/api/team');
  }

  getTeam(id: number): Observable<any> {
    return this.http.get('/api/team/' + id);
  }

}
