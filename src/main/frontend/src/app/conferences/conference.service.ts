import { HttpClient } from "@angular/common/http";
import {EventEmitter, Injectable} from "@angular/core";
import {Observable} from "rxjs/Observable";
import {Conference} from "./conference.model";

@Injectable()
export class ConferenceService {

  onConferenceAdded = new EventEmitter<Conference>();


  constructor(private http: HttpClient) {

  }

  getConferences(): Observable<any> {
    return this.http.get('/api/conference');
  }

  getConference(id:number): Observable<any> {
    return this.http.get('api/conference/' + id);
  }

}
