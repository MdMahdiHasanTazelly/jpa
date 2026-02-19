package com.mahdi.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import com.mahdi.jpa.models.Author;
import com.mahdi.jpa.repositories.AuthorRepository;
import com.mahdi.jpa.repositories.VideoRepository;
import com.mahdi.jpa.specification.AuthorSpecification;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository repository,
		VideoRepository videoRepository
	){
		return args->{

			Specification<Author> spec = Specification
				.where(AuthorSpecification.hasAge(45))
				.or(AuthorSpecification.firstNameLike("i"));

				repository.findAll(spec).forEach(System.out::println);


			// for(int i=0; i<50; i++){
			// 	Faker faker = new Faker();

			// 	var author = Author.builder()
			// 	.firstName(faker.name().firstName())
			// 	.lastName(faker.name().lastName())
			// 	.email("mahdi"+i+"@gmail.com")
			// 	.age(faker.number().numberBetween(19, 50))
			// 	.build();

			// 	repository.save(author);
			// }




			// var video = Video.builder()
			// .name("abc")
			// .length(5)
			// .build();
			// videoRepository.save(video);
			
		};
	}


}




