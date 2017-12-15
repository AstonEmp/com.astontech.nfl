import {Division} from "../divisions/division.model";

export class Conference {
  public divisionList: Array<Division>;
  public conferenceName: String;

  constructor(divisionList: Array<Division>, conferenceName: String){
    this.divisionList = divisionList;
    this.conferenceName = conferenceName;
  }

}
