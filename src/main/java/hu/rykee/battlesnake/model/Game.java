package hu.rykee.battlesnake.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {

    private String id;
    private RuleSet ruleSet;
    private int timeout;

}
