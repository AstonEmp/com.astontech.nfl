
import {Team} from "../teams/team.model";

export class Division {
  public id: number;
  public teamList: Team[];
  public divisionName: String;

  constructor(teamList: Team[], divisionName: String){
    this.teamList = teamList;
    this.divisionName = divisionName;
  }
}
