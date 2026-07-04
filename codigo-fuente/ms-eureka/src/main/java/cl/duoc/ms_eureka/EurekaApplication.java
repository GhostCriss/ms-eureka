package cl.duoc.ms_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer; // <-- ASEGÚRATE DE QUE ESTE IMPORT ESTÉ ESCRITO ASÍ

@SpringBootApplication
@EnableEurekaServer // <-- Aquí ya no debería marcar error si el import y la dependencia están OK
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}