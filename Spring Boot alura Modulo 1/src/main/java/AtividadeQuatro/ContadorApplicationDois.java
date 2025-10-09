package AtividadeQuatro;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ContadorApplicationDois implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ContadorApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
        System.out.println("Tarefa lida do JSON:");
        System.out.println(tarefaLida);


    }


    }

