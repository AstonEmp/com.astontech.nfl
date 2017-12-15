
import {Team} from "../teams/team.model";

export class Division {
  public teamList: Array<Team>;
  public divisionName: String;

  constructor(teamList: Array<Team>, divisionName: String){
    this.teamList = teamList;
    this.divisionName = divisionName;
  }
}
