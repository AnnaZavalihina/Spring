package car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "person")
    public Driver getDriver() {
        return new car.Driver();
    }

    @Bean(name = "car")
    public Auto getAuto() {
        return new car.Auto();
    }
}
