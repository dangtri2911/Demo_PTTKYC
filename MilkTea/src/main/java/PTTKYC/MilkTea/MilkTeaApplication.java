package PTTKYC.MilkTea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "PTTKYC.MilkTea.Entity")
@ComponentScan(basePackages = {"PTTKYC.MilkTea"})
public class MilkTeaApplication {
	public static void main(String[] args) {
		SpringApplication.run(MilkTeaApplication.class, args);
	}
}
