import { Component, OnInit } from '@angular/core';
import {Conference} from "./conference.model";
import {ActivatedRoute} from "@angular/router";
import {ConferenceService} from "./conference.service";

@Component({
  selector: 'app-conferences',
  templateUrl: './conferences.component.html',
  styleUrls: ['./conferences.component.css']
})
export class ConferencesComponent implements OnInit {

  conference: Conference;
  id:any;
  sub:any;

  constructor(private route:ActivatedRoute,
              private conferenceService: ConferenceService) {
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = params['id'];
    });

    // logic to get division based on id
    this.conferenceService.getConference(this.id)
      .subscribe(
        (conference: any) => {
          this.conference = conference;
        },
        (error) => console.log(error)
      );

  }
}
