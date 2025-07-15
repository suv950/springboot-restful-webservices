package net.javaguides.springboot;

import net.javaguides.springboot.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestfulWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);

		Student student = new Student(1, "Ramesh");
		System.out.println(student.getId());
		System.out.println(student.getName());

	}

}
