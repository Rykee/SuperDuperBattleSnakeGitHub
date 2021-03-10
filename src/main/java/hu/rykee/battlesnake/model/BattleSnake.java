package hu.rykee.battlesnake.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BattleSnake {

    private String id;
    private String name;
    private int health;
    private List<Coordinate> body;
    private String latency;
    private Coordinate head;
    private int length;
    private String shout;
    private String squad;

}
