package com.astontech.nfl.comastontechnfl.ServiceTests;

import com.astontech.nfl.comastontechnfl.domain.Team;
import com.astontech.nfl.comastontechnfl.repositories.TeamRepository;
import com.astontech.nfl.comastontechnfl.services.TeamService;
import com.astontech.nfl.comastontechnfl.services.impl.TeamImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TeamImplTests
{
    private final static Integer Team_Id = 1;
    private Team savedTeam = new Team();
    private List<Team> savedTeamList = new ArrayList<>();
    private Team newTeam;
    private List<Team> newTeamList;

    private TeamRepository teamRepository = mock(TeamRepository.class);
    private TeamService teamService = new TeamImpl(teamRepository);

    @Before
    public void setUp()
    {
        newTeam = new Team();
        newTeamList = new ArrayList<>();

        newTeam.setId(1);
        newTeamList.add(newTeam);

        when(teamRepository.findOne(Team_Id)).thenReturn(newTeam);
        when(teamRepository.findAll()).thenReturn(newTeamList);
        when(teamRepository.save(savedTeam)).thenReturn(newTeam);
        when(teamRepository.save(savedTeamList)).thenReturn(newTeamList);
        doThrow(new IllegalArgumentException()).when(teamRepository).delete(2);
    }

    @Test
    public void test_findOne()
    {
        assertEquals(newTeam, teamService.getTeamById(Team_Id));
    }

    @Test
    public void test_findAll()
    {
        assertEquals(newTeamList, teamService.listAllTeams());
    }

    @Test
    public void test_save()
    {
        assertEquals(newTeam, teamService.saveTeam(savedTeam));
    }

    @Test
    public void test_saveList()
    {
        assertEquals(newTeamList, teamService.saveTeamList(savedTeamList));
    }

    @Test
    public void test_delete()
    {
        assertTrue(teamService.deleteTeam(1));
        assertFalse(teamService.deleteTeam(2));
    }
}