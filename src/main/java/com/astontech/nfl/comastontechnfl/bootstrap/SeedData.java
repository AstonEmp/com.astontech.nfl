package com.astontech.nfl.comastontechnfl.bootstrap;

import com.astontech.nfl.comastontechnfl.domain.*;
import com.astontech.nfl.comastontechnfl.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent>
{

    private final ConferenceService conferenceService;
    private final TeamService teamService;
    private final FrontOfficeService frontOfficeService;
    private final DivisionService divisionService;
    private final PlayerService playerService;
    private final RecordService recordService;

    @Autowired
    public SeedData(DivisionService divisionService, ConferenceService conferenceService, TeamService teamService, FrontOfficeService frontOfficeService,
                    PlayerService playerService, RecordService recordService)
    {
        this.divisionService = divisionService;
        this.conferenceService = conferenceService;
        this.teamService = teamService;
        this.frontOfficeService = frontOfficeService;
        this.playerService = playerService;
        this.recordService = recordService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        generateData();
    }

    public void generateData()
    {

        //region RECORDS
        Record colts17 = new Record();
        colts17.setLosses(6);
        colts17.setWins(3);
        colts17.setSeasonSpan("2017-2018");

        Record colts16 = new Record();
        colts16.setLosses(8);
        colts16.setWins(8);
        colts16.setSeasonSpan("2016-2017");

        List<Record> coltsRecord = new ArrayList<>();
        coltsRecord.add(colts16);
        coltsRecord.add(colts17);

        Record vikings17 = new Record();
        vikings17.setLosses(2);
        vikings17.setWins(6);
        vikings17.setSeasonSpan("2017-2018");

        List<Record> vikingsRecord = new ArrayList<>();
        vikingsRecord.add(vikings17);

        recordService.saveRecordList(coltsRecord);
        recordService.saveRecordList(vikingsRecord);
        //endregion

        //region FRONT OFFICES
        FrontOffice coltsOffice = new FrontOffice();
        coltsOffice.setGeneralManager("Chris Ballard");
        coltsOffice.setHeadCoach("Chuck Pagano");
        coltsOffice.setOwner("Jim Irsay");

        FrontOffice vikingsOffice = new FrontOffice();
        vikingsOffice.setHeadCoach("Mike Zimmer");
        vikingsOffice.setOwner("Zygi Wilf");
        vikingsOffice.setGeneralManager("Rick Spielman");

        frontOfficeService.saveFrontOffice(coltsOffice);
        frontOfficeService.saveFrontOffice(vikingsOffice);


        //endregionS

        //region PLAYERS

        Player andrewLuck = new Player();
        andrewLuck.setFirstName("Andrew");
        andrewLuck.setLastName("Luck");
        andrewLuck.setPosition("QB");
        andrewLuck.setJerseyNumber(12);
        andrewLuck.setRookieSeason(2012);
        andrewLuck.setLastSeason(2017);
        andrewLuck.setStatus("Active");

        Player malikHooker = new Player();
        malikHooker.setFirstName("Malik");
        malikHooker.setLastName("Hooker");
        malikHooker.setPosition("FS");
        malikHooker.setJerseyNumber(29);
        malikHooker.setRookieSeason(2017);
        malikHooker.setLastSeason(2017);
        malikHooker.setStatus("Active");

        List<Player> coltsPlayers = new ArrayList<>();
        coltsPlayers.add(andrewLuck);
        coltsPlayers.add(malikHooker);

        Player harrisonSmith = new Player();
        harrisonSmith.setFirstName("Harrison");
        harrisonSmith.setLastName("Smith");
        harrisonSmith.setPosition("FS");
        harrisonSmith.setJerseyNumber(22);
        harrisonSmith.setRookieSeason(2012);
        harrisonSmith.setLastSeason(2017);
        harrisonSmith.setStatus("Active");

        Player dalvinCook = new Player();
        dalvinCook.setFirstName("Dalvin");
        dalvinCook.setLastName("Cook");
        dalvinCook.setPosition("RB");
        dalvinCook.setJerseyNumber(33);
        dalvinCook.setRookieSeason(2012);
        dalvinCook.setLastSeason(2012);
        dalvinCook.setStatus("Active");

        List<Player> vikingsPlayers = new ArrayList<>();
        vikingsPlayers.add(harrisonSmith);
        vikingsPlayers.add(dalvinCook);

        playerService.savePlayerList(coltsPlayers);
        playerService.savePlayerList(vikingsPlayers);

        //endregion

        //region TEAMS

        Team cardinals = new Team();
        cardinals.setHomeTown("Arizona");
        cardinals.setTeamName("Cardinals");
        teamService.saveTeam(cardinals);

        Team falcons = new Team();
        falcons.setHomeTown("Atlanta");
        falcons.setTeamName("Falcons");
        teamService.saveTeam(falcons);

        Team ravens = new Team();
        ravens.setHomeTown("Baltimore");
        ravens.setTeamName("Ravens");
        teamService.saveTeam(ravens);

        Team bills = new Team();
        bills.setHomeTown("Buffalo");
        bills.setTeamName("Bills");
        teamService.saveTeam(bills);

        Team colts = new Team();
        colts.setHomeTown("Indianapolis");
        colts.setTeamName("Colts");
        colts.setFrontOffice(coltsOffice);
        colts.setPlayerList(coltsPlayers);
        colts.setRecordList(coltsRecord);
        teamService.saveTeam(colts);

        Team panthers = new Team();
        panthers.setHomeTown("Carolina");
        panthers.setTeamName("Panthers");
        teamService.saveTeam(panthers);

        Team bears = new Team();
        bears.setHomeTown("Chicago");
        bears.setTeamName("Bears");
        teamService.saveTeam(bears);

        Team bengals = new Team();
        bengals.setHomeTown("Cincinnati");
        bengals.setTeamName("Bengals");
        teamService.saveTeam(bengals);

        Team browns = new Team();
        browns.setHomeTown("Cleveland");
        browns.setTeamName("Browns");
        teamService.saveTeam(browns);

        Team cowboys = new Team();
        cowboys.setHomeTown("Dallas");
        cowboys.setTeamName("Cowboys");
        teamService.saveTeam(cowboys);

        Team broncos = new Team();
        broncos.setHomeTown("Denver");
        broncos.setTeamName("Broncos");
        teamService.saveTeam(broncos);

        Team lions = new Team();
        lions.setHomeTown("Detroit");
        lions.setTeamName("Lions");
        teamService.saveTeam(lions);

        Team packers = new Team();
        packers.setHomeTown("Green Bay");
        packers.setTeamName("Packers");
        teamService.saveTeam(packers);

        Team texans = new Team();
        texans.setHomeTown("Houston");
        texans.setTeamName("Texans");
        teamService.saveTeam(texans);

        Team jaguars = new Team();
        jaguars.setHomeTown("Jacksonville");
        jaguars.setTeamName("Jaguars");
        teamService.saveTeam(jaguars);

        Team chiefs = new Team();
        chiefs.setHomeTown("Kansas City");
        chiefs.setTeamName("Chiefs");
        teamService.saveTeam(chiefs);

        Team chargers = new Team();
        chargers.setHomeTown("Los Angeles");
        chargers.setTeamName("Chargers");
        teamService.saveTeam(chargers);

        Team rams = new Team();
        rams.setHomeTown("Los Angeles");
        rams.setTeamName("Rams");
        teamService.saveTeam(rams);

        Team dolphins = new Team();
        dolphins.setHomeTown("Miami");
        dolphins.setTeamName("Dolphins");
        teamService.saveTeam(dolphins);

        Team vikings = new Team();
        vikings.setHomeTown("Minnesota");
        vikings.setTeamName("Vikings");
        vikings.setRecordList(vikingsRecord);
        vikings.setPlayerList(vikingsPlayers);
        vikings.setFrontOffice(vikingsOffice);
        System.out.println(vikings.getFrontOffice().getHeadCoach());
        teamService.saveTeam(vikings);
//        System.out.println(teamService.getTeamById(20).getFrontOffice().getHeadCoach());

        Team patriots = new Team();
        patriots.setHomeTown("New England");
        patriots.setTeamName("Patriots");
        teamService.saveTeam(patriots);

        Team saints = new Team();
        saints.setHomeTown("New Orleans");
        saints.setTeamName("Saints");
        teamService.saveTeam(saints);

        Team giants = new Team();
        giants.setHomeTown("New York");
        giants.setTeamName("Giants");
        teamService.saveTeam(giants);

        Team jets = new Team();
        jets.setHomeTown("New York");
        jets.setTeamName("Jets");
        teamService.saveTeam(jets);

        Team raiders = new Team();
        raiders.setHomeTown("Oakland");
        raiders.setTeamName("Raiders");
        teamService.saveTeam(raiders);

        Team eagles = new Team();
        eagles.setHomeTown("Philadelphia");
        eagles.setTeamName("Eagles");
        teamService.saveTeam(eagles);

        Team steelers = new Team();
        steelers.setHomeTown("Pittsburgh");
        steelers.setTeamName("Steelers");
        teamService.saveTeam(steelers);

        Team fortyNiners = new Team();
        fortyNiners.setHomeTown("San Francisco");
        fortyNiners.setTeamName("49ers");
        teamService.saveTeam(fortyNiners);

        Team seahawks = new Team();
        seahawks.setHomeTown("Seattle");
        seahawks.setTeamName("Seahawks");
        teamService.saveTeam(seahawks);

        Team buccaneers = new Team();
        buccaneers.setHomeTown("Tampa Bay");
        buccaneers.setTeamName("Buccaneers");
        teamService.saveTeam(buccaneers);

        Team titans = new Team();
        titans.setHomeTown("Tennessee");
        titans.setTeamName("Titans");
        teamService.saveTeam(titans);

        Team redskins = new Team();
        redskins.setHomeTown("Washington");
        redskins.setTeamName("Redskins");
        teamService.saveTeam(redskins);

        //endregion

        //region DIVISIONS

        List<Team> afcSouthList = new ArrayList<>();
        afcSouthList.add(colts);
        afcSouthList.add(titans);
        afcSouthList.add(texans);
        afcSouthList.add(jaguars);

        List<Team> afcEastList = new ArrayList<>();
        afcEastList.add(patriots);
        afcEastList.add(jets);
        afcEastList.add(bills);
        afcEastList.add(dolphins);

        List<Team> afcNorthList = new ArrayList<>();
        afcNorthList.add(steelers);
        afcNorthList.add(ravens);
        afcNorthList.add(bengals);
        afcNorthList.add(browns);

        List<Team> afcWestList = new ArrayList<>();
        afcWestList.add(chiefs);
        afcWestList.add(raiders);
        afcWestList.add(chargers);
        afcWestList.add(broncos);

        List<Team> nfcNorthList = new ArrayList<>();
        nfcNorthList.add(vikings);
        nfcNorthList.add(packers);
        nfcNorthList.add(lions);
        nfcNorthList.add(bears);

        List<Team> nfcSouthList = new ArrayList<>();
        nfcSouthList.add(saints);
        nfcSouthList.add(panthers);
        nfcSouthList.add(falcons);
        nfcSouthList.add(buccaneers);

        List<Team> nfcEastList = new ArrayList<>();
        nfcEastList.add(eagles);
        nfcEastList.add(cowboys);
        nfcEastList.add(giants);
        nfcEastList.add(redskins);

        List<Team> nfcWestList = new ArrayList<>();
        nfcWestList.add(rams);
        nfcWestList.add(seahawks);
        nfcWestList.add(cardinals);
        nfcWestList.add(fortyNiners);


        Division afcSouth = new Division();
        afcSouth.setTeamList(afcSouthList);

        Division afcEast = new Division();
        afcEast.setTeamList(afcEastList);

        Division afcNorth = new Division();
        afcNorth.setTeamList(afcNorthList);

        Division afcWest = new Division();
        afcWest.setTeamList(afcWestList);

        List<Division> afcDivisions = new ArrayList<>();
        afcDivisions.add(afcEast);
        afcDivisions.add(afcNorth);
        afcDivisions.add(afcSouth);
        afcDivisions.add(afcWest);

        Division nfcSouth = new Division();
        nfcSouth.setTeamList(nfcSouthList);

        Division nfcEast = new Division();
        nfcEast.setTeamList(nfcEastList);

        Division nfcNorth = new Division();
        nfcNorth.setTeamList(nfcNorthList);

        Division nfcWest = new Division();
        nfcWest.setTeamList(nfcWestList);

        List<Division> nfcDivisions = new ArrayList<>();
        nfcDivisions.add(nfcEast);
        nfcDivisions.add(nfcNorth);
        nfcDivisions.add(nfcSouth);
        nfcDivisions.add(nfcWest);

        divisionService.saveDivisionList(afcDivisions);
        divisionService.saveDivisionList(nfcDivisions);


        //endregion

        //region CONFERENCES
        Conference afc = new Conference();
        afc.setConferenceName("AFC");
        afc.setDivisionList(afcDivisions);


        Conference nfc = new Conference();
        nfc.setConferenceName("NFC");
        nfc.setDivisionList(nfcDivisions);

        List<Conference> conferenceList = new ArrayList<>();
        conferenceList.add(afc);
        conferenceList.add(nfc);

        conferenceService.saveConferenceList(conferenceList);
        //endregion
    }
}
