package com.astontech.nfl.comastontechnfl.ServiceTests;

import com.astontech.nfl.comastontechnfl.domain.Player;
import com.astontech.nfl.comastontechnfl.repositories.PlayerRepository;
import com.astontech.nfl.comastontechnfl.services.PlayerService;
import com.astontech.nfl.comastontechnfl.services.impl.PlayerImpl;
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

public class PlayerImplTests
{
    private final static Integer Player_Id = 1;
    private Player savedPlayer = new Player();
    private List<Player> savedPlayerList = new ArrayList<>();
    private Player newPlayer;
    private List<Player> newPlayerList;

    private PlayerRepository playerRepository = mock(PlayerRepository.class);
    private PlayerService playerService = new PlayerImpl(playerRepository);

    @Before
    public void setUp()
    {
        newPlayer = new Player();
        newPlayerList = new ArrayList<>();

        newPlayer.setId(1);
        newPlayerList.add(newPlayer);

        when(playerRepository.findOne(Player_Id)).thenReturn(newPlayer);
        when(playerRepository.findAll()).thenReturn(newPlayerList);
        when(playerRepository.save(savedPlayer)).thenReturn(newPlayer);
        when(playerRepository.save(savedPlayerList)).thenReturn(newPlayerList);
        doThrow(new IllegalArgumentException()).when(playerRepository).delete(2);
    }

    @Test
    public void test_findOne()
    {
        assertEquals(newPlayer, playerService.getPlayerById(Player_Id));
    }

    @Test
    public void test_findAll()
    {
        assertEquals(newPlayerList, playerService.listAllPlayers());
    }

    @Test
    public void test_save()
    {
        assertEquals(newPlayer, playerService.savePlayer(savedPlayer));
    }

    @Test
    public void test_saveList()
    {
        assertEquals(newPlayerList, playerService.savePlayerList(savedPlayerList));
    }

    @Test
    public void test_delete()
    {
        assertTrue(playerService.deletePlayer(1));
        assertFalse(playerService.deletePlayer(2));
    }
}