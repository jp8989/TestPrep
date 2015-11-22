package hashMap;

import java.util.HashMap;
import java.util.Comparator;

public class HashMapDataFactory {
	
	public HashMap<Integer,String> oda =new HashMap<Integer,String>();

	public HashMap<Integer,String> getOrderDataLinked() {
		return oda;
	}

	public void setOrderDataLinked(HashMap orderDataLinked) {
		this.oda = oda;
	}
	
	public void logOrderDataLinked() {	
	
			log("OD:" + oda);
			log("OD:toString()" +oda.toString());
			log("OD:get(3)" + oda.get(3));
			
			//HashMap ll = oda.get(new Integer(2));
			//log("ll:get(2):" + ll.orderNumber);
			

	}
		
	public void log(String msg) {
		System.out.println(msg);
	}

	public boolean createOrderDataLinked(int length,int maxValue)
	{
		
		log("start createOrderDataLinked:parm length:"+length+ " maxValue:"+maxValue);
		java.util.Random rand=new java.util.Random();
		//HashMap<OrderData> oda=new HashMap<OrderData>(length);		
	
		int i;
		for (i = 0; i < length; i++) {
        	HashMapData od = new HashMapData();
			od.orderNumber=rand.nextInt(maxValue+1);        	
        	oda.put(new Integer(i),"DESC:"+i);
        	oda.put(new Integer(i),"DESC2:"+i);  //overwrites original with new description...no dups,
        }
        
       //	oda.put(new Integer(i),"DESC:"+i);   //dups
        
        
		
		return true;
		
		/*4 iterate methods for HashMap
		
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
	

