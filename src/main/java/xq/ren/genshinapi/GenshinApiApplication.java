package xq.ren.genshinapi;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@SpringBootApplication
public class GenshinApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(GenshinApiApplication.class, args);
    }

}
