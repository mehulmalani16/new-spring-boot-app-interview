package com.github.mehul.reservation.InventoryReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class InventoryReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryReservationApplication.class, args);
	}

}
