package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.entities.Employees;
import org.sid.dao.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{
	@Autowired 
  private EmployeesRepository employeesRepository;
  
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception{
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		employeesRepository.save(new Employees("Elmehdi","Chemlal", df.parse("4/05/1996"),"elmehdi3@gmail.com",0661645,"elmehdi.png"));
		employeesRepository.save(new Employees("Achraf","Lozad", df.parse("4/05/1998"),"achraflozad@gmail.com",0661645,"elmehdi.png"));
		employeesRepository.save(new Employees("Elmehdi","Chemlal", df.parse("4/05/1996"),"elmehdi3@gmail.com",0661645,"elmehdi.png"));

     employeesRepository.findAll().forEach(c->{
    	 System.out.println(c.getNom());
    	 
     });
		
		
	}

}
