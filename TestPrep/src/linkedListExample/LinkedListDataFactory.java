package linkedListExample;

import java.util.LinkedList;
import java.util.Comparator;

public class LinkedListDataFactory {
	
	public LinkedList<LinkedListData> oda =new LinkedList<LinkedListData>();

	public LinkedList<LinkedListData> getOrderDataLinked() {
		return oda;
	}

	public void setOrderDataLinked(LinkedList orderDataLinked) {
		this.oda = oda;
	}
	
	public void logOrderDataLinked() {	
	
			log("OD:" + oda);
			log("OD:toString()" +oda.toString());
			log("OD:get(3)" + oda.get(3));
			
			LinkedListData ll = oda.get(2);
			log("ll:get(2):" + ll.orderNumber);
			

	}
		
	public void log(String msg) {
		System.out.println(msg);
	}

	public boolean createOrderDataLinked(int length,int maxValue)
	{
		
		log("start createOrderDataLinked:parm length:"+length+ " maxValue:"+maxValue);
		java.util.Random rand=new java.util.Random();
		//LinkedList<OrderData> oda=new LinkedList<OrderData>(length);		
	
        for (int i = 0; i < length; i++) {
        	LinkedListData od = new LinkedListData();
			od.orderNumber=rand.nextInt(maxValue+1);        	
        	oda.add(od);
        }
		
		return true;
		
		/*4 iterate methods for Linkedlist
		
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
	

