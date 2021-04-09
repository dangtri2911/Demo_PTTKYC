package PTTKYC.MilkTea;

import PTTKYC.MilkTea.Storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "PTTKYC.MilkTea.Entity")
@ComponentScan(basePackages = {"PTTKYC.MilkTea"})
@EnableConfigurationProperties(StorageProperties.class)
public class MilkTeaApplication {
	public static void main(String[] args) {
		SpringApplication.run(MilkTeaApplication.class, args);
	}
}
