package ThreadStuff;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPrinter implements Runnable  {
	
	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("From the new thread:"+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();				}
			}
		}
	}

