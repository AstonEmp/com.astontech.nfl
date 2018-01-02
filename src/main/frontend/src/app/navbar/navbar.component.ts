import { Component, OnInit } from '@angular/core';
import {ConferenceService} from "../conferences/conference.service";
import {Conference} from "../conferences/conference.model";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

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
