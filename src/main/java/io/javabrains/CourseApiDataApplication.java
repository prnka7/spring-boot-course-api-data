package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.course.CourseController;
import com.example.demo.topics.TopicController;

@SpringBootApplication
@ComponentScan(basePackageClasses= {TopicController.class,CourseController.class})
@Configuration
public class CourseApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
	}

}
