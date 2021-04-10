package PTTKYC.MilkTea;

import PTTKYC.MilkTea.Storage.StorageProperties;
import PTTKYC.MilkTea.Storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = "PTTKYC.MilkTea")
@EnableTransactionManagement
@SpringBootApplication
@EntityScan(basePackages = "PTTKYC.MilkTea.Entity")
@EnableJpaRepositories(basePackages = "PTTKYC.MilkTea.Repository")
@EnableConfigurationProperties(StorageProperties.class)
public class MilkTeaApplication {
	public static void main(String[] args) {
		SpringApplication.run(MilkTeaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.init();
		};
	}
}
