package hu.rykee.battlesnake.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Board {

    private int height;
    private int width;
    private List<Coordinate> food;
    private List<Coordinate> hazards;
    private List<BattleSnake> snakes;

}
