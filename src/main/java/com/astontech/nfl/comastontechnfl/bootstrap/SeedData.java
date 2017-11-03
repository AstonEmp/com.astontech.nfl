package com.astontech.nfl.comastontechnfl.bootstrap;

import com.astontech.nfl.comastontechnfl.domain.Conference;
import com.astontech.nfl.comastontechnfl.domain.Division;
import com.astontech.nfl.comastontechnfl.domain.Team;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent>
{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        generateData();
    }

    public void generateData()
    {
        Team colts = new Team();
        colts.setHomeTown("Indianapolis");
        colts.setTeamName("Colts");

        Team cardinals = new Team();
        cardinals.setHomeTown("Arizona");
        cardinals.setTeamName("Cardinals");

        Team falcons = new Team();
        falcons.setHomeTown("Atlanta");
        falcons.setTeamName("Falcons");

        Team ravens = new Team();
        ravens.setHomeTown("Baltimore");
        ravens.setTeamName("Ravens");

        Team bills = new Team();
        bills.setHomeTown("Buffalo");
        bills.setTeamName("Bills");

        Team panthers = new Team();
        panthers.setHomeTown("Carolina");
        panthers.setTeamName("Panthers");

        Team bears = new Team();
        bears.setHomeTown("Chicago");
        bears.setTeamName("Bears");

        Team bengals = new Team();
        bengals.setHomeTown("Cincinnati");
        bengals.setTeamName("Bengals");

        Team browns = new Team();
        browns.setHomeTown("Cleveland");
        browns.setTeamName("Browns");

        Team cowboys = new Team();
        cowboys.setHomeTown("Dallas");
        cowboys.setTeamName("Cowboys");

        Team broncos = new Team();
        broncos.setHomeTown("Denver");
        broncos.setTeamName("Broncos");

        Team lions = new Team();
        lions.setHomeTown("Detroit");
        lions.setTeamName("Lions");

        Team packers = new Team();
        packers.setHomeTown("Green Bay");
        packers.setTeamName("Packers");

        Team texans = new Team();
        texans.setHomeTown("Houston");
        texans.setTeamName("Texans");

        Team jaguars = new Team();
        jaguars.setHomeTown("Jacksonville");
        jaguars.setTeamName("Jaguars");

        Team chiefs = new Team();
        chiefs.setHomeTown("Kansas City");
        chiefs.setTeamName("Chiefs");

        Team chargers = new Team();
        chargers.setHomeTown("Los Angeles");
        chargers.setTeamName("Chargers");

        Team rams = new Team();
        rams.setHomeTown("Los Angeles");
        rams.setTeamName("Rams");

        Team dolphins = new Team();
        dolphins.setHomeTown("Miami");
        dolphins.setTeamName("Dolphins");

        Team vikings = new Team();
        vikings.setHomeTown("Minnesota");
        vikings.setTeamName("Vikings");

        Team patriots = new Team();
        patriots.setHomeTown("New England");
        patriots.setTeamName("Patriots");

        Team saints = new Team();
        saints.setHomeTown("New Orleans");
        saints.setTeamName("Saints");

        Team giants = new Team();
        giants.setHomeTown("New York");
        giants.setTeamName("Giants");

        Team jets = new Team();
        jets.setHomeTown("New York");
        jets.setTeamName("Jets");

        Team raiders = new Team();
        raiders.setHomeTown("Oakland");
        raiders.setTeamName("Raiders");

        Team eagles = new Team();
        eagles.setHomeTown("Philadelphia");
        eagles.setTeamName("Eagles");

        Team steelers = new Team();
        steelers.setHomeTown("Pittsburgh");
        steelers.setTeamName("Steelers");

        Team fortyNiners = new Team();
        fortyNiners.setHomeTown("San Francisco");
        fortyNiners.setTeamName("49ers");

        Team seahawks = new Team();
        seahawks.setHomeTown("Seattle");
        seahawks.setTeamName("Seahawks");

        Team buccaneers = new Team();
        buccaneers.setHomeTown("Tampa Bay");
        buccaneers.setTeamName("Buccaneers");

        Team titans = new Team();
        titans.setHomeTown("Tennessee");
        titans.setTeamName("Titans");

        Team redskins = new Team();
        redskins.setHomeTown("Washington");
        redskins.setTeamName("Redskins");

        List<Team> afcSouthList = new ArrayList<>();
        afcSouthList.add(colts);
        afcSouthList.add(titans);
        afcSouthList.add(texans);
        afcSouthList.add(jaguars);

        List<Team> afcEastList = new ArrayList<>();
        afcSouthList.add(patriots);
        afcSouthList.add(jets);
        afcSouthList.add(bills);
        afcSouthList.add(dolphins);


        Division afcSouth = new Division();
        afcSouth.setTeamList(afcSouthList);

        Division afcEast = new Division();
        afcEast.setTeamList(afcEastList);

        Division afcNorth = new Division();
        Division afcWest = new Division();

        Division nfcSouth = new Division();
        Division nfcEast = new Division();
        Division nfcNorth = new Division();
        Division nfcWest = new Division();

        Conference afc = new Conference();
        afc.setConferenceName("AFC");

        Conference nfc = new Conference();
        nfc.setConferenceName("NFC");


    }
}
