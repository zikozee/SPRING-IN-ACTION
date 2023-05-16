package tacos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import tacos.domain.User;
import tacos.repository.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author: Ezekiel Eromosei
 * @created: 16 May 2023
 */

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
//        List<UserDetails> users = List.of(
//                new User("buzz", passwordEncoder().encode("password"),
//                        Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))),
//                new User("woody", passwordEncoder().encode("password"),
//                        Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")))
//        );
//
//        return new InMemoryUserDetailsManager(users);
//    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository){
        return username -> userRepository                                                     .findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User '" + username + "' not found"));
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeRequests()
//                .antMatchers("/design", "/orders").hasRole("USER")
                .antMatchers("/design", "/orders").access("hasRole('USER')")
//                .antMatchers("/", "/**").permitAll()
                .antMatchers("/", "/**").access("permitAll()")
                .and()
                .formLogin()
                    .loginPage("/login")
                .and()
                .oauth2Login()
                    .loginPage("/login")
                .and()
                .logout()
                .and().build();
    }
}
