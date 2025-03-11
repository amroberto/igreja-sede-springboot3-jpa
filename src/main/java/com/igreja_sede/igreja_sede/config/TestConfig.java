package com.igreja_sede.igreja_sede.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.igreja_sede.igreja_sede.entities.City;
import com.igreja_sede.igreja_sede.entities.Community;
import com.igreja_sede.igreja_sede.entities.MainChurch;
import com.igreja_sede.igreja_sede.entities.Member;
import com.igreja_sede.igreja_sede.entities.Position;
import com.igreja_sede.igreja_sede.entities.State;
import com.igreja_sede.igreja_sede.entities.Synod;
import com.igreja_sede.igreja_sede.entities.User;
import com.igreja_sede.igreja_sede.entities.enums.MemberType;
import com.igreja_sede.igreja_sede.entities.enums.UnityType;
import com.igreja_sede.igreja_sede.repositories.CityRepository;
import com.igreja_sede.igreja_sede.repositories.CommunityRepository;
import com.igreja_sede.igreja_sede.repositories.MainChurchRepository;
import com.igreja_sede.igreja_sede.repositories.MemberRepository;
import com.igreja_sede.igreja_sede.repositories.PositionRepository;
import com.igreja_sede.igreja_sede.repositories.StateRepository;
import com.igreja_sede.igreja_sede.repositories.SynodRepository;
import com.igreja_sede.igreja_sede.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private CommunityRepository communityRepository;

	@Autowired
	private MainChurchRepository mainChurchRepository;
	
	@Autowired
	private SynodRepository synodRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private PositionRepository positionRepository;
	
	
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

        Position p1 = new Position(null, "Presidente");
        Position p2 = new Position(null, "Vice-residente");
        Position p3 = new Position(null, "Tesoureiro");
        Position p4 = new Position(null, "Vice-tesoureiro");
        Position p5 = new Position(null, "Secretário");
        Position p6 = new Position(null, "Vice-secretário");
        Position p7 = new Position(null, "Vogal");
        positionRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));        
        
        City c1 = new City(null, "ALTA FLORESTA D OESTE", 1100015, s1);
        City c2 = new City(null, "ARIQUEME", 1100023, s1);
        City c3 = new City(null, "CABIXI", 1100031, s1);
        City c4 = new City(null, "CACOAL", 1100049,s1);
        City c5 = new City(null, "CEREJEIRAS", 1100056, s1);
        City c6 = new City(null, "COLORADO DO OESTE", 1100064, s1);
        City c7 = new City(null, "CORUMBIARA", 1100072, s1);
        City c8 = new City(null, "COSTA MARQUES", 1100080, s1);
        City c9 = new City(null, "ESPIGAO D''OESTE", 1100098, s1);
        City c10 = new City(null, "GUAJARA-MIRIM", 1100106, s1);
        City c11 = new City(null, "JARU", 1100114, s1);
        City c12 = new City(null, "JI-PARANA", 1100122, s1);
        cityRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12));
        
       	MainChurch mainChurch = new MainChurch(null,"Igreja Sede","Igreja Sede Ltda","12345678000190","78000000","Avenida Principal","100","Próximo ao Centro",c10,"123456789","988888888","matriz.saojoao@exemplo.com","www.matrizsaojoao.com");
        mainChurchRepository.save(mainChurch);
        
       	Synod synod1 = new Synod(null,"Sinodo 1","Sinodo 1","12345678000280","78000000","Avenida Hum","101","Centro",c8,"123456789","988888888","sinodo1@exemplo.com","www.sinodo1.com", mainChurch);
       	Synod synod2 = new Synod(null,"Sinodo 2","Sinodo 2","12345678000280","78000000","Avenida Hum","102","Centro",c9,"123456789","988888888","sinodo2@exemplo.com","www.sinodo2.com", mainChurch);
       	Synod synod3 = new Synod(null,"Sinodo 3","Sinodo 3","12345678000280","78000000","Avenida Hum","103","Centro",c7,"123456789","988888888","sinodo3@exemplo.com","www.sinodo3.com", mainChurch);
       	Synod synod4 = new Synod(null,"Sinodo 4","Sinodo 4","12345678000280","78000000","Avenida Hum","104","Centro",c6,"123456789","988888888","sinodo4@exemplo.com","www.sinodo4.com", mainChurch);
       	Synod synod5 = new Synod(null,"Sinodo 5","Sinodo 5","12345678000280","78000000","Avenida Hum","105","Centro",c5,"123456789","988888888","sinodo5@exemplo.com","www.sinodo5.com", mainChurch);
       	Synod synod6 = new Synod(null,"Sinodo 6","Sinodo 6","12345678000280","78000000","Avenida Hum","106","Centro",c4,"123456789","988888888","sinodo6@exemplo.com","www.sinodo6.com", mainChurch);
        synodRepository.saveAll(Arrays.asList(synod1, synod2, synod3, synod4, synod5, synod6));
        
       	Community community1 = new Community(null,"Igreja São João", "Igreja São João Ltda",UnityType.PREACHING_POINT,"12345678000190","Rua A","123","Complemento 1",c1,synod1,"988888888", "12345678" ,"saojoao@exemplo.com","www.saojoao.com",null); 
        Community community2 = new Community(null,"Igreja Cristo Redentor","Cristo Redentor Ltda",UnityType.PARISH,"23456789000190","Rua B","456","Complemento 2",c2,synod2,"23456789","977777777","cristo.redentor@exemplo.com","www.cristoredentor.com",null);
       	Community community3 = new Community(null,"Igreja Nova Vida","Nova Vida Ltda",UnityType.COMMUNITY,"34567890000190","Rua C","789","Complemento 3",c3,synod3,"34567890","966666666","novavida@exemplo.com","www.novavida.com",null);
       	Community community4 = new Community(null,"Igreja do Senhor","Senhor Ltda",UnityType.PREACHING_POINT,"45678901000190","Rua D","101","Complemento 4",c4,synod4,"45678901","955555555","senhor@exemplo.com","www.senhor.com",null);
       	Community community5 = new Community(null,"Igreja da Paz","Paz Ltda",UnityType.PARISH,"56789012000190","Rua E","202","Complemento 5",c5,synod5,"56789012","944444444","paz@exemplo.com","www.paz.com",null);		
        communityRepository.saveAll(Arrays.asList(community1, community2, community3, community4, community5));

        Member member1 = new Member(null, null, "Carlos Silva", "12345678900", "Rua A", "100", "Apto 10", "Centro", c1,
                "01000-000", "11999998888", "11988887777", "1133221100", "carlos@email.com", community1, true, null, null, true,
                MemberType.SIMPATIZANTE, false);

        Member member2 = new Member(null, null, "Maria Souza", "98765432100", "Rua B", "200", "Casa 5", "Bairro Novo", c2,
                "02000-000", "11977776666", "11966665555", "1133112200", "maria@email.com", community2, true, null, null, false,
                MemberType.MEMBRO, true);

        Member member3 = new Member(null, null, "João Pereira", "65498732100", "Rua C", "300", "", "Jardim América", c1,
                "03000-000", "11955554444", "11944443333", "1133001100", "joao@email.com", community1, false, member1, member2,
                true, MemberType.MEMBRO, false);

        Member member4 = new Member(null, null, "Ana Oliveira", "11122233344", "Rua D", "400", "Bloco B", "Centro", c1,
                "04000-000", "11912345678", "11987654321", "1133556677", "ana@email.com", community2, true, null, null, true,
                MemberType.MEMBRO, false);

        Member member5 = new Member(null, null, "Fernando Lima", "55566677788", "Rua E", "500", "Sala 2", "Vila Nova", c2,
                "05000-000", "11922223333", "11933334444", "1133445566", "fernando@email.com", community1, false, null, null, false,
                MemberType.MEMBRO, true);

        Member member6 = new Member(null, null, "Beatriz Costa", "99988877766", "Rua F", "600", "Casa 3", "Jardim das Flores", c1,
                "06000-000", "11944445555", "11955556666", "1133667788", "beatriz@email.com", community2, true, null, null, false,
                MemberType.DEPENDENTE, false);

        Member member7 = new Member(null, null, "Pedro Santos", "12332112345", "Rua G", "700", "Apto 12", "Centro", c2,
                "07000-000", "11966667777", "11977778888", "1133778899", "pedro@email.com", community1, true, null, null, true,
                MemberType.MEMBRO, false);

        Member member8 = new Member(null, null, "Mariana Rocha", "54321234567", "Rua H", "800", "", "Vila Mariana", c1,
                "08000-000", "11988889999", "11999990000", "1133889900", "mariana@email.com", community2, true, null, null, false,
                MemberType.MEMBRO, true);

        Member member9 = new Member(null, null, "Ricardo Mendes", "33322211100", "Rua I", "900", "Casa 7", "Jardim Paulista", c2,
                "09000-000", "11900001111", "11911112222", "1133990011", "ricardo@email.com", community1, false, null, null, false,
                MemberType.MEMBRO, false);

        Member member10 = new Member(null, null, "Clara Nunes", "77788899900", "Rua J", "1000", "Bloco C", "Centro", c1,
                "10000-000", "11922221111", "11933332222", "1133112233", "clara@email.com", community2, true, null, null, true,
                MemberType.SIMPATIZANTE, false);

        Member member11 = new Member(null, null, "Gustavo Almeida", "88899900011", "Rua K", "1100", "Apto 22", "Jardim Botânico", c2,
                "11000-000", "11944443333", "11955554444", "1133223344", "gustavo@email.com", community1, false, member5, member6,
                true, MemberType.MEMBRO, false);

        Member member12 = new Member(null, null, "Roberta Fernandes", "99900011122", "Rua L", "1200", "", "Vila Olímpia", c1,
                "12000-000", "11966665555", "11977776666", "1133114455", "roberta@email.com", community2, true, null, null, false,
                MemberType.SIMPATIZANTE, true);

        Member member13 = new Member(null, null, "Alexandre Batista", "22233344455", "Rua M", "1300", "Sala 5", "Centro", c2,
                "13000-000", "11988887777", "11999998888", "1133445566", "alexandre@email.com", community1, true, null, null, true,
                MemberType.DEPENDENTE, false);
        memberRepository.saveAll(Arrays.asList(member1, member2, member3,member4, member5, member6, member7, member8, member9, member10, member11, member12, member13));
	}

}
