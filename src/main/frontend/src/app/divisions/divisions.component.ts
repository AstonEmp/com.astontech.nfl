import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from "@angular/router";
import {Division} from "../divisions/division.model";
import {DivisionService} from "./division.service";
import {Observable} from "rxjs/Observable";

@Component({
  selector: 'app-divisions',
  templateUrl: './divisions.component.html',
  styleUrls: ['./divisions.component.css']
})
export class DivisionsComponent implements OnInit {

  division: Division;
  id:any;
  sub:any;

  constructor(private route:ActivatedRoute,
              private divisionService: DivisionService) {
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = params['id'];
    });

      // logic to get division based on id
      this.divisionService.getDivision(this.id)
        .subscribe(
          (division: any) => {
            this.division = division;
          },
          (error) => console.log(error)
        );

  }

}
