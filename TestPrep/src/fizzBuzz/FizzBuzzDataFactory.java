package fizzBuzz;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.ListIterator;

public class FizzBuzzDataFactory {
	
	public LinkedList<FizzBuzzData> oda =new LinkedList<FizzBuzzData>();

	public LinkedList<FizzBuzzData> getOrderDataLinked() {
		return oda;
	}

	public void setOrderDataLinked(LinkedList orderDataLinked) {
		this.oda = oda;
	}
	
	public void logOrderDataLinked() {	
		
        // ListIterator approach
        //System.out.println("ListIterator Approach: ");
        ListIterator<FizzBuzzData> listIterator = oda.listIterator();
        while (listIterator.hasNext()) {
            log(listIterator.next().getOrderNumber());
        }
	
			/*log("OD:" + oda);
			log("OD:toString()" +oda.toString());
			log("OD:get(3)" + oda.get(3));
			
			FizzBuzzData ll = oda.get(2);
			log("ll:get(2):" + ll.orderNumber);
			*/

	}
		
	public void log(String msg) {
		System.out.println(msg);
	}

	public boolean createOrderDataLinked(int length)
	{
		
		log("start createOrderDataLinked:parm length:"+length);
	
        for (int i = 0; i < length; i++) {
        	FizzBuzzData od = new FizzBuzzData();
       	    if ( i % 15 == 0 ) {
       	    	od.orderNumber="FizzBuzz";
  
       	    } else if ( i % 3 == 0 ) {
        		od.orderNumber="Fizz";
        		//continue;
        	} else if ( i % 5 == 0 ) {
        		od.orderNumber="Buzz";
        		//continue;
        	} else {
        		od.orderNumber = String.valueOf(i);
        	}
        	
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
	

