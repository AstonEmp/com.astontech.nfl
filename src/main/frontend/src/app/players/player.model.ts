export class Player {
  public firstName: String;
  public lastName: String;
  public position: String;
  public rookieSeason: number;
  public lastSeason: number;
  public jerseyNumber: number;
  public status: String;

  constructor(firstName: String, lastName: String, position: String,
  rookieSeason: number, lastSeason: number, jerseyNumber: number,
  status: String){
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.rookieSeason = rookieSeason;
    this.lastSeason = lastSeason;
    this.jerseyNumber = jerseyNumber;
    this.status = status;
  }

}
