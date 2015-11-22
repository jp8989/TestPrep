package reverseOrderSortExample;

import java.util.Comparator;

public class ReverseOrderSort implements Comparator<OrderData> {
		public int compare(OrderData o1, OrderData o2) {
		// TODO Auto-generated method stub
			/*
			-1 : o1 < o2
			0 : o1 == o2
			+1 : o1 > o2
			*/
			
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
