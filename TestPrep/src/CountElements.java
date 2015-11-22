import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CountElements{

public static void main(String args[]) throws Exception {
	ArrayList al = new ArrayList();
	al.add("1234");
	System.out.println("countList1: " +countList(al));
	
	LinkedList ll = new LinkedList();
	ll.add("4321");
	ll.add("8765");
	System.out.println("countList2: " +countList(ll));	
	
	
    }

	/*
	 *     //Write a generic method to count the number of elements in a collection 
	 *     that have a specific property (for example, odd integers, prime numbers, palindromes).
	 */
   
    private static <E> int countList(List<E> list) {
    	return list.size();
    }


}