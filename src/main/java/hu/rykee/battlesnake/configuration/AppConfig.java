package hu.rykee.battlesnake.configuration;

import hu.rykee.battlesnake.model.Snake;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
@Component
public class AppConfig {

    private Snake snake;

}
