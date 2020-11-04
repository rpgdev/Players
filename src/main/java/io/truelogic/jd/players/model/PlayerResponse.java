package io.truelogic.jd.players.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerResponse {

    List<String> result;

    public PlayerResponse(){
        result = new ArrayList<>();
    }

    public void addResult(String result){
        this.result.add(result);
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }
}
