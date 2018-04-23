package bookticket.app.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import bookticket.app.DAO.MovieDAO;

@Configuration
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = MovieDAO.class)
@EntityScan("bookticket.app.model") 
public class BookMyshowSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	 @Bean
		public PasswordEncoder passwordEncoder(){
			PasswordEncoder encoder = new BCryptPasswordEncoder();
			return encoder;
	 }
			
			
	@Value("${spring.queries.users-query}")
	private String usersQuery;

	@Value("${spring.queries.roles-query}")
	private String rolesQuery;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// auth.jdbcAuthentication().dataSource(dataSource);
		auth.jdbcAuthentication()
        .usersByUsernameQuery(usersQuery)
        .authoritiesByUsernameQuery(rolesQuery)
        .dataSource(dataSource)
        .passwordEncoder(passwordEncoder());
		
		
		/*
		 * UserBuilder userr = User.withDefaultPasswordEncoder();
		 * 
		 * auth.inMemoryAuthentication().withUser(userr.username("gaurav").password(
		 * "123").roles("ADMIN"))
		 * .withUser(userr.username("amit").password("123").roles("EMPLOYEE"))
		 * .withUser(userr.username("super").password("123").roles("MANAGER"))
		 * .withUser(userr.username("admin").password("admin").roles("ADMIN"));
		 */

	}

	
	//custom_pass
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		/*http
		.authorizeRequests()
			.anyRequest().authenticated()
			.and()
		.formLogin();
		
		*
		*/
		/*http.authorizeRequests()
		.antMatchers("/", "/h2_console/").hasAnyRole("ADMIN","EMPLOYEE","USER","MANAGER")
		.antMatchers("/hello/**").hasAnyRole("EMPLOYEE", "MANAGER")
		.anyRequest().authenticated().and().formLogin().loginPage("/login")
		.loginProcessingUrl("/authenticateUser").permitAll().and().logout().permitAll();

		 http.exceptionHandling().accessDeniedPage("/403");
		http.csrf().disable();
		http.headers().frameOptions().disable();
		*/
		
		http.
		authorizeRequests()
			.antMatchers("/").authenticated()
			.antMatchers("/login").permitAll()
			.antMatchers("/registration").permitAll()
			.antMatchers("/**").hasAuthority("ADMIN").anyRequest()
			.authenticated().and().formLogin()
			.loginPage("/login")
			.loginProcessingUrl("/authenticateUser").permitAll()
			//.defaultSuccessUrl("/admin/home")
			//.usernameParameter("username")
			//.passwordParameter("password")
			.and().logout()
			.permitAll();
		
		//http.csrf().disable();
		http.headers().frameOptions().disable();
		
	}

}
