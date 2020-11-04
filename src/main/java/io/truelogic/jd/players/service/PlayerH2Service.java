package io.truelogic.jd.players.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.truelogic.jd.players.entity.Player;
import io.truelogic.jd.players.repository.PlayerRepository;

@Service
public class PlayerH2Service implements PlayerService{

    private PlayerRepository repository;

    @Autowired
    public PlayerH2Service(PlayerRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Player> findAll() {
        return repository.findAll();
    }

    @Override
    public Player findById(int id) {
        return repository.getOne(id);
    }

    @Override
    public void save(Player player) {
        repository.save(player);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
