import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Team} from "./team.model";
import {TeamService} from "./team.service";

@Component({
  selector: 'app-teams',
  templateUrl: './teams.component.html',
  styleUrls: ['./teams.component.css']
})
export class TeamsComponent implements OnInit {

  team: Team;
  id:any;
  sub:any;

  constructor(private route:ActivatedRoute,
              private teamService: TeamService) {
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = params['id'];
    });

    // logic to get team based on id
    this.teamService.getTeam(this.id)
      .subscribe(
        (team: any) => {
          this.team = team;
        },
        (error) => console.log(error)
      );

  }

}
