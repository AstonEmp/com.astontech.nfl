package com.astontech.nfl.comastontechnfl.services;

import com.astontech.nfl.comastontechnfl.domain.Team;

public interface TeamService
{
    Team getTeamById(Integer id);
    Team saveTeam(Team team);
    Iterable<Team> listAllTeams();
    Iterable<Team> saveTeamList(Iterable<Team> teams);
    boolean deleteTeam(Integer id);
}
