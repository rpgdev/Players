package io.truelogic.jd.players.model;

import java.util.List;
import io.truelogic.jd.players.entity.Player;

public class PlayerPayload {
    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return getPlayers().toString();
    }
}
