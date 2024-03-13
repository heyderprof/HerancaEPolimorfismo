package etiquetaProdutos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner lendoDados = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = lendoDados.nextInt();
		
		for (int i=0; i<n; i++) {
			lendoDados.nextLine();
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			String type = lendoDados.nextLine();
			System.out.print("Name: ");
			String name = lendoDados.next();
			System.out.print("Price: ");
			double price = lendoDados.nextDouble();
			
			if (type.equals("u")) {
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = dateFormat.parse(lendoDados.next()); 
				Product product = new UsedProduct(name, price, manufactureDate);
				
				list.add(product);
				
			} else if (type.equals("i")) {
				
				System.out.print("Customs fee: ");
				double customsFee = lendoDados.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				
				list.add(product);
				
			} else {
				Product product = new Product(name, price);
				list.add(product);
				
			}	

		}
		
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		lendoDados.close();

	}

}
