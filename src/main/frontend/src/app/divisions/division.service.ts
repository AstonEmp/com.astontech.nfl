import { HttpClient } from "@angular/common/http";
import {EventEmitter, Injectable} from "@angular/core";
import {Observable} from "rxjs/Observable";
import {Division} from "./division.model";

@Injectable()
export class DivisionService {

  onDivisionAdded = new EventEmitter<Division>();


  constructor(private http: HttpClient) {

  }

  getDivisions(): Observable<any> {
    return this.http.get('/api/division');
  }

  getDivision(id: number) : Observable<any> {
    return this.http.get('/api/division/' + id);
  }

}
