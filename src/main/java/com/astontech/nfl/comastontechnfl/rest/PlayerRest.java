package com.astontech.nfl.comastontechnfl.rest;

import com.astontech.nfl.comastontechnfl.domain.Player;
import com.astontech.nfl.comastontechnfl.services.PlayerService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Log4j
@RestController
@RequestMapping("/api/player")
public class PlayerRest
{
    private PlayerService playerService;

    @Autowired
    public PlayerRest(PlayerService playerService)
    {
        this.playerService = playerService;
    }

    @GetMapping("/")
    public Iterable<Player> getAll()
    {
        return playerService.listAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable Integer id)
    {
        return playerService.getPlayerById(id);
    }

    @PostMapping("/")
    public Player savePlayer(@RequestBody Player player)
    {
        return playerService.savePlayer(player);
    }

    @DeleteMapping("/{id}")
    public Boolean deletePlayer(@PathVariable Integer id)
    {
        boolean success = false;
        try
        {
            playerService.deletePlayer(id);
            success = true;
        }
        catch (Exception e)
        {
            log.error(e);
        }

        return success;
    }
}
