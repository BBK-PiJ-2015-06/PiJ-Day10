public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		SmartPhone myphone = new SmartPhone("brand");
		myphone.call("07985970880");
		myphone.call("00483565929");
		myphone.ringAlarm("Wake Up!");
		myphone.playGame("Minesweeper");
		myphone.printLastNumbers();
		myphone.browseWeb("Google");
		myphone.findPosition();
		System.out.println(myphone.getBrand());
		
		System.out.println("");
		
		MobilePhone myMobile = new MobilePhone("brand");
		myMobile.call("07985970880");
		myMobile.call("00483565929");
		myMobile.ringAlarm("Wake Up!");
		myMobile.playGame("Minesweeper");
		myMobile.printLastNumbers();
		System.out.println(myMobile.getBrand());
		
		System.out.println("");
		
		OldPhone myOld = new OldPhone("brand");
		myOld.call("07985970880");
		myOld.call("00483565929");
		System.out.println(myOld.getBrand());
	}
	
}