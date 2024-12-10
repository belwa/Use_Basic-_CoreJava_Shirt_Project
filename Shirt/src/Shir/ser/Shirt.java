package Shir.ser;

public class Shirt {
	
	
		String brand;
		int size;
		double price;
		String color;
		Shirt(){
			
		}
		Shirt(String brand, int size, double price, String color){
			this.brand=brand;
			this.size=size;
			this.price=price;
			this.color=color;
		}
		public String toString() {
		return "Brand is: "+brand+"\tSize is: "+size+"\tPrice is: "+price+"\tColor is: "+color;
		}

	}


