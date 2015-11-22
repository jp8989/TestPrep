package reverseOrderSortExample;

import java.util.ArrayList;
import java.util.Comparator;

public class OrderDataFactory {
	
	public ArrayList<OrderData> oda =new ArrayList<OrderData>();

	public ArrayList<OrderData> getOrderDataArray() {
		return oda;
	}

	public void setOrderDataArray(ArrayList orderDataArray) {
		this.oda = oda;
	}
	
	public void logOrderDataArray() {	
		for (OrderData od : oda ) {
			log("OD:" + od.orderNumber);
		}
	}
		
	public void log(String msg) {
		System.out.println(msg);
	}

	public boolean createOrderDataArray(int length,int maxValue)
	{
		
		log("start createOrderDataArray:parm length:"+length+ " maxValue:"+maxValue);
		java.util.Random rand=new java.util.Random();
		//ArrayList<OrderData> oda=new ArrayList<OrderData>(length);		
	
        for (int i = 0; i < length; i++) {
        	OrderData od = new OrderData();
			od.orderNumber=rand.nextInt(maxValue+1);        	
        	oda.add(od);
        }
		
		return true;
		
		/*4 iterate methods for arraylist
		
        //Method #1 : Iterate using for loop
        System.out.println("Using for loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
 
        //Method #2 : Iterate using advanced for loop
        System.out.println("Using Advanced for loop");
        for (String name : names) {
            System.out.println(name);
        }
 
        //Method #3 : Iterate using advanced for loop
        System.out.println("Using Iterator");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
 
        //Method #4 : Iterate using while loop
        System.out.println("Using while  loop");
        int index = 0 ;
        while (names.size()> index) {
            System.out.println(names.get(index));
            index++ ;
        }
        */
				
		
	}

}
	

