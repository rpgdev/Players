package io.truelogic.jd.players.service;

import io.truelogic.jd.players.entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();

    Player findById(int id);

    void save(Player player);

    void deleteById(int id);

}
