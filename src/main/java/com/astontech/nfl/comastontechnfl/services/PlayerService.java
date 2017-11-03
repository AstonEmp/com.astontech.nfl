package com.astontech.nfl.comastontechnfl.services;

import com.astontech.nfl.comastontechnfl.domain.Player;

public interface PlayerService
{
    Player getPlayerById(Integer id);
    Player savePlayer(Player player);
    Iterable<Player> listAllPlayers();
    Iterable<Player> savePlayerList(Iterable<Player> players);
    boolean deletePlayer(Integer id);
}
