package java_20190730;

import java.util.ArrayList;

class Product{
	int number;
	String name;
	double price;
	Product(int number, String name, double price){
		this.number = number;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
}

public class ListDemo {
	
	public static void main (String [] args) {
		
		//Array
		ArrayList<Product> list = new ArrayList<Product>();
		Product p1 = new Product(1, "terra",2500);
		Product p2 = new Product(2, "신라면",1000);
		Product p3 = new Product(3, "참이슬",4000);
		Product p4 = new Product(3, "참이슬",4000);
		
		//할당
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		// 삭제
		list.remove(0);
		
		//모두삭제
		for (int i = 0; i < list.size(); i++) {
			list.remove(i--);
		}

		// 출력
		for (int i = 0; i < list.size(); i++) {
			Product temp = list.get(i);
			System.out.println(temp);
			
			
		}
		
		//emhanced for loop 출력 가능(제너릭으로 선언한 경우에만 가능) 
		for (Product product : list) {
			System.out.println(product);
		}
	}
}

