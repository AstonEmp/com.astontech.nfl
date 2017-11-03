package com.astontech.nfl.comastontechnfl.services.impl;

import com.astontech.nfl.comastontechnfl.domain.Player;
import com.astontech.nfl.comastontechnfl.repositories.PlayerRepository;
import com.astontech.nfl.comastontechnfl.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerImpl implements PlayerService
{
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerImpl(PlayerRepository playerRepository)
    {
        this.playerRepository = playerRepository;
    }

    @Override
    public Player getPlayerById(Integer id) {
        return playerRepository.findOne(id);
    }

    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Iterable<Player> listAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Iterable<Player> savePlayerList(Iterable<Player> players) {
        return playerRepository.save(players);
    }

    @Override
    public boolean deletePlayer(Integer id) {
        try
        {
            playerRepository.delete(id);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
