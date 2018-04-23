
package bookticket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import bookticket.app.DAO.MovieDAO;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = MovieDAO.class)
@EntityScan("bookticket.app.model") 

public class BookMyShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}
}
