package Shir.ser;
import java.util.*;

public class ShirtService {
  
	
		private List<Shirt> l1=new ArrayList<>();
		
		public void addShirt(Shirt s) {
			l1.add(s);
		}
		public  void getAllShirts() {
			for(Shirt s:l1)
				System.out.println(s);
		}
		public  void getShirtByBrand(String brand) {
			for(Shirt s:l1) {
				if(s.brand.equalsIgnoreCase(brand))
					System.out.println(s);
			}
		}
		public  void getShirtByPriceAndColor(double min, double max, String color) {
			for(Shirt s:l1) {
				if(s.price>=min && s.price<=max && s.color.equalsIgnoreCase(color))
					System.out.println(s);
			}
		}
		public void sortShirtOnLowToHighPrice() {
			Collections.sort(l1, new priceLowToHighComparator());
			getAllShirts();
			
		}
		public void getAllBrands() {
			Set<String> brand=new TreeSet<>();
			for(Shirt s:l1)
				brand.add(s.brand);
			//System.out.println(st);
			for(String s:brand)
				System.out.println(s);
		}
		public void getCountOfBrands() {
			Map<String, Integer> m=new TreeMap<>();
			for(Shirt s:l1) {
				if(m.containsKey(s.brand))
					m.put(s.brand, m.get(s.brand)+1);
				else
					m.put(s.brand, 1);
			}
		//System.out.println(m);
			Set<Map.Entry<String, Integer>> ent=m.entrySet();
			for(Map.Entry<String, Integer> p:ent)
				System.out.println(p.getKey()+" ==> "+p.getValue());
		}
		public void getCountBySize() {
			Map<Integer, Integer> m1=new TreeMap<>();
			for(Shirt s:l1) {
				if(m1.containsKey(s.size))
					m1.put(s.size, m1.get(s.size)+1);
				else
					m1.put(s.size, 1);
			}
			Set<Map.Entry<Integer, Integer>> ent=m1.entrySet();
			for(Map.Entry<Integer, Integer> p:ent)
				System.out.println(p.getKey()+"==> "+p.getValue());
		}
	}







	
	

