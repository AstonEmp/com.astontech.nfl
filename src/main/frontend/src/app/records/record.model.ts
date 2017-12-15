export class Record {
  public wins: number;
  public losses: number;
  public ties: number;
  public seasonSpan: String;

  constructor(wins: number, losses: number, ties: number, seasonSpan: String) {
    this.wins = wins;
    this.losses = losses;
    this.ties = ties;
    this.seasonSpan = seasonSpan;
  }
}
