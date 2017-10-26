package com.astontech.nfl.comastontechnfl.services.impl;

import com.astontech.nfl.comastontechnfl.domain.Team;
import com.astontech.nfl.comastontechnfl.repositories.TeamRepository;
import com.astontech.nfl.comastontechnfl.services.TeamService;
import org.springframework.stereotype.Service;

@Service
public class TeamImpl implements TeamService
{
    private final TeamRepository teamRepository;

    public TeamImpl(TeamRepository teamRepository)
    {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team getTeamById(Integer id) {
        return teamRepository.findOne(id);
    }

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Iterable<Team> listAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Iterable<Team> saveTeamList(Iterable<Team> teams) {
        return teamRepository.save(teams);
    }

    @Override
    public boolean deleteTeam(Integer id) {
        try
        {
            teamRepository.delete(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
