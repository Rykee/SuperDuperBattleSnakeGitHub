package hu.rykee.battlesnake.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameStart {

    private Game game;
    private int turn;
    private Board board;
    private BattleSnake you;

}
