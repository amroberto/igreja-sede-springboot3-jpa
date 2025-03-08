package com.igreja_sede.igreja_sede.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.igreja_sede.igreja_sede.entities.State;
import com.igreja_sede.igreja_sede.entities.User;
import com.igreja_sede.igreja_sede.repositories.StateRepository;
import com.igreja_sede.igreja_sede.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;	
	
	@Autowired
    private StateRepository stateRepository;
	
	@Override
	public void run(String... args) throws Exception {	
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		
		State s1 = new State(null, "Rondônia", "RO");
        State s2 = new State(null, "Acre", "AC");
        State s3 = new State(null, "Amazonas", "AM");
        State s4 = new State(null, "Roraima", "RR");
        State s5 = new State(null, "Pará", "PA");
        State s6 = new State(null, "Amapá", "AP");
        State s7 = new State(null, "Tocantins", "TO");
        State s8 = new State(null, "Maranhão", "MA");
        State s9 = new State(null, "Piauí", "PI");
        State s10 = new State(null, "Ceará", "CE");
        State s11 = new State(null, "Rio Grande do Norte", "RN");
        State s12 = new State(null, "Paraíba", "PB");
        State s13 = new State(null, "Pernambuco", "PE");
        State s14 = new State(null, "Alagoas", "AL");
        State s15 = new State(null, "Sergipe", "SE");
        State s16 = new State(null, "Bahia", "BA");
        State s17 = new State(null, "Minas Gerais", "MG");
        State s18 = new State(null, "Espírito Santo", "ES");
        State s19 = new State(null, "Rio de Janeiro", "RJ");
        State s20 = new State(null, "São Paulo", "SP");
        State s21 = new State(null, "Paraná", "PR");
        State s22 = new State(null, "Santa Catarina", "SC");
        State s23 = new State(null, "Rio Grande do Sul", "RS");
        State s24 = new State(null, "Mato Grosso do Sul", "MS");
        State s25 = new State(null, "Mato Grosso", "MT");
        State s26 = new State(null, "Goiás", "GO");
        State s27 = new State(null, "Distrito Federal", "DF");

        stateRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27));
        
	} 

}
