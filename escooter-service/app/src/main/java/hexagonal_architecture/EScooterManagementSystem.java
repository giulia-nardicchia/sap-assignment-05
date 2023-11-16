package hexagonal_architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = GsonAutoConfiguration.class)
@EnableMongoRepositories
public class EScooterManagementSystem {
    public static void main(String[] args) {
        SpringApplication.run(EScooterManagementSystem.class, args);
    }
}