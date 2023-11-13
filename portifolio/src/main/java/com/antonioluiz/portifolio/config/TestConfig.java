package com.antonioluiz.portifolio.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.antonioluiz.portifolio.entities.Category;
import com.antonioluiz.portifolio.entities.Order;
import com.antonioluiz.portifolio.entities.Product;
import com.antonioluiz.portifolio.entities.Publicador;
import com.antonioluiz.portifolio.entities.User;
import com.antonioluiz.portifolio.entities.enums.OrdersStatus;
import com.antonioluiz.portifolio.repositories.CategoryRepository;
import com.antonioluiz.portifolio.repositories.OrderRepository;
import com.antonioluiz.portifolio.repositories.ProductRepository;
import com.antonioluiz.portifolio.repositories.PublicadorRepository;
import com.antonioluiz.portifolio.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private PublicadorRepository publicadoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
//		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Antonio James", "james@gmail.com", "994110718", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrdersStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrdersStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrdersStatus.WAITING_PAYMENT, u1);
		
		Publicador pu= new Publicador(0, "Luiz", "41", "8888-9999");
		Publicador pu1= new Publicador(0, "João", "41", "8888-9999");
		Publicador pu2= new Publicador(0, "Tiago", "41", "8888-9999");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		publicadoryRepository.saveAll(Arrays.asList(pu,pu1,pu2));
		
		
	}
	

	
	
}
