public class SmartPhone extends MobilePhone {
	
	public SmartPhone() {
		super();
	}
	
	public void browseWeb(String website) {
		System.out.println("Browsing to " + website);
	}
	
	public int findPosition() {
		int output = 767032735;
		System.out.println("GPS-found position: " + output);
		return output;
	}
	
}