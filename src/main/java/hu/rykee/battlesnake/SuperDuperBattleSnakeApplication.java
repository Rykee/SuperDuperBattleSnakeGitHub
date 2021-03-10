package hu.rykee.battlesnake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SuperDuperBattleSnakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperDuperBattleSnakeApplication.class, args);
    }

}
