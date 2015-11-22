package linkedListExample;

import java.util.Collections;
import java.util.Comparator;

public class LinkedListMain  {
	
	public static void main(String[] args) {
		 
		int MAX_ARRAY_VALUE=100;
		int n=10;
		
		LinkedListDataFactory odf = new LinkedListDataFactory();
		boolean res = odf.createOrderDataLinked(n, MAX_ARRAY_VALUE);

		System.out.println("..............................");
		odf.logOrderDataLinked();
		Collections.sort(odf.getOrderDataLinked(),new LinkedListSort());
		System.out.println("..............................");
		odf.logOrderDataLinked();		

		/*
		for (OrderData od_: odf.getOrderDataArray()) {
			System.out.println("od.ordernum:"+od_.orderNumber);
		}*/
		
		/*
		List<CustomObject> list = new ArrayList<CustomObject>();
		Comparator<CustomObject> comparator = new Comparator<CustomObject>() {
		    public int compare(CustomObject c1, CustomObject c2) {
		        return c2.getId() - c1.getId(); // use your logic
		    }
		};

		Collections.sort(list, comparator); // use the comparator as much as u want
		System.out.println(list);		
		*/
		
	}

}
