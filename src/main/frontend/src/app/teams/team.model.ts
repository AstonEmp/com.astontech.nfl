import {FrontOffice} from "../frontoffices/frontoffice.model";
import {Player} from "../players/player.model";
import {Record} from "../records/record.model";

export class Team {
  public id: number;
  public teamName: String;
  public homeTown: String;
  public recordList: Record[];
  public frontOffice: FrontOffice;
  public playerList: Player[];

  constructor(teamName: String, homeTown: String, recordList: Record[],
              frontOffice: FrontOffice, playerList: Player[]) {
    this.teamName = teamName;
    this.homeTown = homeTown;
    this.recordList = recordList;
    this.frontOffice = frontOffice;
    this.playerList = playerList;
  }
}
