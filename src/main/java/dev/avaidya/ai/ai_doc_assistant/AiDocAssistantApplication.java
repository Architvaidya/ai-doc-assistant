package dev.avaidya.ai.ai_doc_assistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@CommandScan
public class AiDocAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiDocAssistantApplication.class, args);
	}

}
