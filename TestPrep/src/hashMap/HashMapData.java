package hashMap;

public class HashMapData {

	int orderNumber;
	String orderDesc;
	
	public boolean equals(HashMapData hmd) {
		System.out.println("here:equals");
		if (hmd.getOrderNumber()==this.orderNumber) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public int hashCode() {
		System.out.println("here:hashcode");
		return 0;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
}
