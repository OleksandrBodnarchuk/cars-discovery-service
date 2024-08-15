package pl.alex.discovery.cars.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CarappApplication {

  public static void main(String[] args) {
    SpringApplication.run(CarappApplication.class, args);
  }

}
