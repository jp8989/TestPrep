package ThreadStuff;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadStuff  {
	
	public static void main(String[] args) {
		 
		final Executor executor = Executors.newCachedThreadPool();
		executor.execute(new ThreadPrinter());
		executor.execute(new ThreadPrinter());
		executor.execute(new ThreadPrinter());		
	}
}
