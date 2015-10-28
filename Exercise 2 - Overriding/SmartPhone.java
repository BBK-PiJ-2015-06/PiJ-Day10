public class SmartPhone extends MobilePhone {
	
	@Override
	public void call(String number) {
		if(number.substring(0,2).equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money.");
		} else {
			super.call(number);
		}
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