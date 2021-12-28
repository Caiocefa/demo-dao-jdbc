package application;

import java.text.ParseException;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Department department = new Department(1, "Books");
		Seller seller = new Seller(1, "Joao", "joao@gmail.com", new Date(), 5000.0, department);
		System.out.println(seller);

	}

}
