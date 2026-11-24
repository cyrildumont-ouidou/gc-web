package fr.orsys.msa.gc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(group = "gestionclient", types = ClientApi.class)
public class ClientWebApplication {

    static void main(String[] args) {
        SpringApplication.run(ClientWebApplication.class);
    }

}
