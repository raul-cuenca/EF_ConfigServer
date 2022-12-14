package pe.cuenca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EfRaulCuencaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfRaulCuencaConfigServerApplication.class, args);
	}

}
