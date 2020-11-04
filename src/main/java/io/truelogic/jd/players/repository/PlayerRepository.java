package io.truelogic.jd.players.repository;

import io.truelogic.jd.players.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
