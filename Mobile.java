package week1.day1;

public class Mobile {
	
	String mobileModel = "Samsung M30";
	int mobileWeight = 400;
	boolean isFullCharge = false;
	double mobileCost = 15400.450;
	
	public void makeCall() {
		System.out.println("Please give me a call at 10AM");
		sendMsg();
		
	}
	public void sendMsg() {
		System.out.println("Message me when you have time");
		
	}
public static void main(String[] args) {
	Mobile obj = new Mobile();
	obj.makeCall();
	obj.sendMsg();
	System.out.println(obj.mobileModel);
	System.out.println(obj.mobileWeight);
	System.out.println(obj.isFullCharge);
	System.out.println(obj.mobileCost);
}
}
