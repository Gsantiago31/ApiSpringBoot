package com.javarevolutions.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javarevolutions.springboot.model.User;

@RestController
@RequestMapping(path = "/user")
public class RestUser {


	@GetMapping
	public List<User> getUser(@RequestParam("hours") int hours, @RequestParam("units") int units) {

		int[] NewYork = new int[6];

		NewYork[0] = 120;
		NewYork[1] = 230;
		NewYork[2] = 450;
		NewYork[3] = 774;
		NewYork[4] = 1400;
		NewYork[5] = 2820;

		int[] India = new int[6];

		India[0] = 140;
		India[1] = 0;
		India[2] = 413;
		India[3] = 890;
		India[4] = 1300;
		India[5] = 2970;

		int[] China = new int[6];

		China[0] = 110;
		China[1] = 200;
		China[2] = 0;
		China[3] = 670;
		China[4] = 1180;
		China[5] = 0;

	

		if (units == 1150) {
			int division1 = units / 320;
			int modulo1 = units % 320;
			int result1 = division1;
			int division2 = result1 / 160;
			int modulo2 = modulo1 % 160;
			int result2 = division2;
			int division3 = result2 / 20;
			int modulo3 = modulo2 % 20;
			int result3 = division3;
			int division4 = result3 / 10;
			int modulo4 = modulo3 % 10;
			int result4 = division4;
			if (modulo1 == 0) {
				return null;
			} else if (modulo2 == 0) {
				return null;
			} else if (modulo3 == 0) {
				return null;
			} else if (modulo4 == 0) {
				int totalCostNewYork = ((NewYork[4] * 7) + NewYork[1] + NewYork[0]) * hours;
				int totalCostIndia = ((India[4] * 7) + (India[0] * 3)) * hours;
				int totalCostChina = ((China[4] * 7) + China[1] + China[0]) * hours;

				List<User> NewYorkList = new ArrayList<>();

				User u1 = new User();
				u1.setRegion("New York");
				u1.setTotal_cost(totalCostNewYork);
				u1.setMachines("(8XLarge,7),(XLarge,1),(Large,1)");

				User u2 = new User();
				u2.setRegion("India");
				u2.setTotal_cost(totalCostIndia);
				u2.setMachines("(8XLarge,7),(XLarge,1),(Large,1)");

				User u3 = new User();
				u3.setRegion("China");
				u3.setTotal_cost(totalCostChina);
				u2.setMachines("(8XLarge,7),(XLarge,1),(Large,1)");

				NewYorkList.add(u1);
				NewYorkList.add(u2);
				NewYorkList.add(u3);

				return NewYorkList;
			} else {
				return null;
			}
		} else if (units == 230) {
			int division1 = units / 160;
			int modulo1 = units % 160;
			int result1 = division1;
			int division2 = result1 / 40;
			int modulo2 = modulo1 % 40;
			int result2 = division2;
			int division3 = result2 / 20;
			int modulo3 = modulo2 % 20;
			int result3 = division3;
			int division4 = result3 / 10;
			int modulo4 = modulo3 % 10;
			int result4 = division4;
			if (modulo1 == 0) {
				return null;
			} else if (modulo2 == 0) {
				return null;
			} else if (modulo3 == 0) {
				return null;
			} else if (modulo4 == 0) {
				int totalCostNewYork = (NewYork[4] + NewYork[2] + NewYork[1] + NewYork[0]) * hours;
				int totalCostIndia = (India[4] + India[2] + India[1] + India[0]) * hours;
				int totalCostChina = (China[4] + China[2] + China[1] + China[0]) * hours;

				List<User> NewYorkList = new ArrayList<>();

				User u1 = new User();
				u1.setRegion("New York");
				u1.setTotal_cost(totalCostNewYork);
				u1.setMachines("(8XLarge,1),(2XLarge,1),(XLarge,1),(Large,1)");

				User u2 = new User();
				u2.setRegion("India");
				u2.setTotal_cost(totalCostIndia);
				u2.setMachines("(8XLarge,1),(2XLarge,1),(XLarge,1),(Large,1)");

				User u3 = new User();
				u3.setRegion("China");
				u3.setTotal_cost(totalCostChina);
				u2.setMachines("(8XLarge,1),(2XLarge,1),(XLarge,1),(Large,1)");

				NewYorkList.add(u1);
				NewYorkList.add(u2);
				NewYorkList.add(u3);

				return NewYorkList;
			}else {
				return null;
			}

		} else if (units == 100) {
			int division1 = units / 80;
			int modulo1 = units % 80;
			int result1 = division1;
			int division2 = result1 / 20;
			int modulo2 = modulo1 % 20;
			int result2 = division2;
			if (modulo1 == 0) {
				return null;
			}else if (modulo2 == 0) {
				int totalCostNewYork = (NewYork[3] + NewYork[1]) * hours;
				int totalCostIndia = (India[3] + India[1]) * hours;
				int totalCostChina = (China[3] + China[1]) * hours;

				List<User> NewYorkList = new ArrayList<>();

				User u1 = new User();
				u1.setRegion("New York");
				u1.setTotal_cost(totalCostNewYork);
				u1.setMachines("(4XLarge,1),(XLarge,1)");

				User u2 = new User();
				u2.setRegion("India");
				u2.setTotal_cost(totalCostIndia);
				u2.setMachines("(4XLarge,1),(XLarge,1)");

				User u3 = new User();
				u3.setRegion("China");
				u3.setTotal_cost(totalCostChina);
				u2.setMachines("(4XLarge,1),(XLarge,1)");

				NewYorkList.add(u1);
				NewYorkList.add(u2);
				NewYorkList.add(u3);

				return NewYorkList;
			}else {
				return null;
			}
		}else if (units == 1100){
			int division1 = units / 320;
			int modulo1 = units % 320;
			int result1 = division1;
			int division2 = result1 / 80;
			int modulo2 = modulo1 % 80;
			int result2 = division2;
			int division3 = result2 / 40;
			int modulo3 = modulo2 % 40;
			int result3 = division3;
			int division4 = result3 / 20;
			int modulo4 = modulo3 % 20;
			int result4 = division4;
			if (modulo1 == 0) {
				return null;
			}else if (modulo2 == 0) {
				return null;
			}else if (modulo3 == 0) {
				return null;
			}else if (modulo4 == 0) {
				int totalCostNewYork = ((NewYork[5] * 3) + NewYork[3] + NewYork[2] + NewYork[1]) * hours;
				int totalCostIndia = ((India[5] * 3) + India[3] + India[2] + India[1]) * hours;
				int totalCostChina = ((China[5] * 3)+ China[3] + China[2] + China[1]) * hours;

				List<User> NewYorkList = new ArrayList<>();

				User u1 = new User();
				u1.setRegion("New York");
				u1.setTotal_cost(totalCostNewYork);
				u1.setMachines("(10XLarge,3),(4XLarge,1),(2XLarge,1),(Xlarge,1)");

				User u2 = new User();
				u2.setRegion("India");
				u2.setTotal_cost(totalCostIndia);
				u2.setMachines("(10XLarge,3),(4XLarge,1),(2XLarge,1),(Xlarge,1)");

				User u3 = new User();
				u3.setRegion("China");
				u3.setTotal_cost(totalCostChina);
				u2.setMachines("(10XLarge,3),(4XLarge,1),(2XLarge,1),(Xlarge,1)");

				NewYorkList.add(u1);
				NewYorkList.add(u2);
				NewYorkList.add(u3);

				return NewYorkList;
			}
			else {
				return null;
			}
		}else {
			return null;
		}

	}
}
