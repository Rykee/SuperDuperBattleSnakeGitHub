package hu.rykee.battlesnake.web;

import hu.rykee.battlesnake.configuration.AppConfig;
import hu.rykee.battlesnake.model.GameStart;
import hu.rykee.battlesnake.model.Move;
import hu.rykee.battlesnake.model.Snake;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
public class SnakeController {

    AppConfig appConfig;

    @GetMapping(path = "/")
    public ResponseEntity<Snake> getSnake() {
        return ResponseEntity.ok(appConfig.getSnake());
    }

    @PostMapping(path = "/start")
    public void start(@RequestBody GameStart gameStart) {
        gameStart.getGame();
    }

    @PostMapping(path = "/move")
    public ResponseEntity<Move> move(@RequestBody GameStart gameInfo) {
        Move move = new Move();
        move.setShout("left is good");
        move.setMove("left");
        return ResponseEntity.ok(move);
    }

}
