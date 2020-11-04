package io.truelogic.jd.players.controller;

import io.truelogic.jd.players.entity.Player;
import io.truelogic.jd.players.model.PlayerPayload;
import io.truelogic.jd.players.model.PlayerResponse;
import io.truelogic.jd.players.service.PlayerProducer;
import io.truelogic.jd.players.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayersController {

    private PlayerService playerService;
    private PlayerProducer playerProducer;

    @Autowired
    public PlayersController(PlayerService service, PlayerProducer producer){
        playerService = service;
        playerProducer = producer;
    }

    @PostMapping("/players")
    public PlayerResponse addPlayers(@RequestBody PlayerPayload payload){
        PlayerResponse response = new PlayerResponse();
        for(Player player : payload.getPlayers()){
            switch (player.getType()){
                case "expert":
                    playerService.save(player);
                    response.addResult(String.format("Player %s stored in DB", player.getName()));
                    break;
                case "novice":
                    playerProducer.sendMessage(player);
                    response.addResult(String.format("Player %s sent to Kafka topic", player.getName()));
                    break;
                default:
                    response.addResult(String.format("Player %s did not fit", player.getName()));
                    break;
            }
        }
        return response;
    }
}
