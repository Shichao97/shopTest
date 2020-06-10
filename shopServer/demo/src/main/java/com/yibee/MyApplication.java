package com.yibee;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@ServletComponentScan
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		
	}
	
	
	
	
	@GetMapping("/helloWorld")
	public String showUsers(@RequestParam(value = "name", defaultValue = "") String name) {
		return "Hello world:"+name;
	}
	
	
	
	/*
	public static void userCreate(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("testJPA");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Teacher u = new Teacher("t000007");
        u.setFirstName("yc");
        u.setLastName("liu");
        
    	//Date d = Date.valueOf("1997-10-27");
    	//u.setBirthday(d);
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        factory.close();
	}
	
	
	public static void userSearch(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("testJPA");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        String jpql = "from User2 where name like 'lyc%' ";
        Query query = em.createQuery(jpql);
        List list = query.getResultList();
        if(list.size()>3) {
        	User2 u = (User2)list.get(0);
        	//u.setName("lyc33");
        	em.remove(u);
        }
        em.getTransaction().commit();
        em.close();
        factory.close();
	}	
	
	*/
	
	
}