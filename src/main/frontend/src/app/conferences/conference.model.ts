import {Division} from "../divisions/division.model";

export class Conference {
  public id: number;
  public divisionList: Division[];
  public conferenceName: String;

  constructor(divisionList: Division[], conferenceName: String){
    this.divisionList = divisionList;
    this.conferenceName = conferenceName;
  }

}
