package linkedListExample;

import java.util.Comparator;

public class LinkedListSort implements Comparator<LinkedListData> {
		public int compare(LinkedListData o1, LinkedListData o2) {
		// TODO Auto-generated method stub
			/*
			-1 : o1 < o2
			0 : o1 == o2
			+1 : o1 > o2
			*/
			System.out.println("o1.on:" + o1.orderNumber + " o2.on:" + o1.orderNumber);
			int res = o2.orderNumber-o1.orderNumber;
			if (res>0) {
				return 1;
			} else if (res<0) {
				return -1;
			} else {
				return 0;
			}

		}
}
