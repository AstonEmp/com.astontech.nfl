package com.astontech.nfl.comastontechnfl.rest;

import com.astontech.nfl.comastontechnfl.domain.Team;
import com.astontech.nfl.comastontechnfl.services.TeamService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j
@RestController
@RequestMapping("/api/team")
public class TeamRest
{
    private TeamService teamService;

    @Autowired
    public TeamRest(TeamService teamService)
    {
        this.teamService = teamService;
    }

    @GetMapping("/")
    public Iterable<Team> getAll()
    {
        return teamService.listAllTeams();
    }

    @GetMapping("/{id}")
    public Team getTeam(@PathVariable Integer id)
    {
        return teamService.getTeamById(id);
    }

    @PostMapping("/")
    public Team saveTeam(@RequestBody Team team)
    {
        return teamService.saveTeam(team);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteTeam(@PathVariable Integer id)
    {
        boolean success = false;
        try
        {
            teamService.deleteTeam(id);
            success = true;
        }
        catch (Exception e)
        {
            log.error(e);
        }

        return success;
    }
}
