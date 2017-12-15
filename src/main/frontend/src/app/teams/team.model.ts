import {FrontOffice} from "../frontoffices/frontoffice.model";
import {Player} from "../players/player.model";
import {Record} from "../records/record.model";

export class Team {
  public teamName: String;
  public homeTown: String;
  public recordList: Array<Record>;
  public frontOffice: FrontOffice;
  public playerList: Array<Player>;

  constructor(teamName: String, homeTown: String, recordList: Array<Record>,
              frontOffice: FrontOffice, playerList: Array<Player>) {
    this.teamName = teamName;
    this.homeTown = homeTown;
    this.recordList = recordList;
    this.frontOffice = frontOffice;
    this.playerList = playerList;
  }
}
