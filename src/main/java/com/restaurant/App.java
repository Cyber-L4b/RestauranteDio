package com.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.restaurant.facade.RestaurantFacade;
import com.restaurant.order.CreditCardPayment;
import com.restaurant.order.Order;
import com.restaurant.order.PayPalPayment;


@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}


	@Component
	public class AppRunner implements CommandLineRunner {

		@Autowired
		private RestaurantFacade facade;

		@Autowired
		private CreditCardPayment creditCardPayment;

		@Override
		public void run(String... args) throws Exception {
			Order order1 = new Order(1, 50.0);
			facade.placeOrder(order1, creditCardPayment);

			Order order2 = new Order(2, 75.0);
			facade.placeOrder(order2, new PayPalPayment("user@example.com"));
		}
	}
}
