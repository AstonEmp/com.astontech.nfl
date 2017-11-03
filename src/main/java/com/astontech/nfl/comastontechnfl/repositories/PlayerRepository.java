package com.astontech.nfl.comastontechnfl.repositories;

import com.astontech.nfl.comastontechnfl.domain.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
}
