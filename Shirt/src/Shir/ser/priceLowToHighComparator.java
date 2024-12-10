package Shir.ser;

import java.util.Comparator;

public class priceLowToHighComparator implements Comparator<Shirt>{
	
	public int compare(Shirt s1, Shirt s2) {
	return (int)(s1.price-s2.price);
	}

}
