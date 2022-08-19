package com.idat.EFDanyTamaraServicioPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.idat.EFDanyTamaraServicioPizza.client.OpenFeignCliente;
import com.idat.EFDanyTamaraServicioPizza.client.OpenFeignPizzeria;

@EnableFeignClients(basePackageClasses = {OpenFeignCliente.class,OpenFeignPizzeria.class})
@SpringBootApplication
public class EfDanyTamaraServicioPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDanyTamaraServicioPizzaApplication.class, args);
	}

}
