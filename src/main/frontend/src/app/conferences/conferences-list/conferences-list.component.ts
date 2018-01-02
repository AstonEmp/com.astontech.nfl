import { Component, OnInit } from '@angular/core';
import {Conference} from "../conference.model";
import {ConferenceService} from "../conference.service";

@Component({
  selector: 'app-conferences-list',
  templateUrl: './conferences-list.component.html',
  styleUrls: ['./conferences-list.component.css']
})
export class ConferencesListComponent implements OnInit {

  conferenceList: Conference[] = [];

  constructor(private conferenceService: ConferenceService) { }


  ngOnInit() {
    this.conferenceService.getConferences()
      .subscribe(
        (conferences: any[]) => {
          console.log("Conferences: " + conferences);
          this.conferenceList = conferences;
        },
        (error) => console.log(error)
      )
  }

}
