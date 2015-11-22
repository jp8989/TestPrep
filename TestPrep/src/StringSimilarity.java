import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StringSimilarity{

public static void main(String args[]) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(in.readLine());
    for (int i = 0; i < T; i++) {
        String line = in.readLine();
        System.out.println(count(line));
    }
    }

    private static int count(String input) {
    int c = 0, j;
    char[] array = input.toCharArray();
    int n = array.length;
    for (int i = 0; i < n; i++) {
        for (j = 0; j < n - i && i + j < n; j++)
        if (array[i + j] != array[j])
            break;
        c+=j;
    }
    return c;
    }
    
    
    //Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
    
    private static <E> int countElements(List<E> list) {
    	return list.size();
    }


}