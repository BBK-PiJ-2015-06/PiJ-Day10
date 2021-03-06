public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		RestrictedSmartPhone myRestrictedPhone = new RestrictedSmartPhone("brand");
		myRestrictedPhone.call("01");
		myRestrictedPhone.call("02");
		myRestrictedPhone.ringAlarm("Wake Up!");
		myRestrictedPhone.playGame("Minesweeper");
		myRestrictedPhone.printLastNumbers();
		myRestrictedPhone.browseWeb("Google");
		myRestrictedPhone.findPosition();
		System.out.println(myRestrictedPhone.getBrand());
		
		SmartPhone myphone = new SmartPhone("brand");
		myphone.call("01");
		myphone.call("02");
		myphone.call("03");
		myphone.call("04");
		myphone.call("05");
		myphone.call("06");
		myphone.call("07");
		myphone.call("08");
		myphone.call("09");
		myphone.call("10");
		myphone.call("11");
		myphone.call("00");
		myphone.ringAlarm("Wake Up!");
		myphone.playGame("Minesweeper");
		myphone.printLastNumbers();
		myphone.browseWeb("Google");
		myphone.findPosition();
		System.out.println(myphone.getBrand());
		
		System.out.println("");
		
		MobilePhone myMobile = new MobilePhone("brand");
		myMobile.call("01");
		myMobile.call("02");
		myMobile.call("03");
		myMobile.call("04");
		myMobile.call("05");
		myMobile.call("06");
		myMobile.call("07");
		myMobile.call("08");
		myMobile.call("09");
		myMobile.call("10");
		myMobile.call("11");
		
		myMobile.ringAlarm("Wake Up!");
		myMobile.printLastNumbers();
		System.out.println(myMobile.getBrand());
		
		System.out.println("");
		
		OldPhone myOld = new OldPhone("brand");
		myOld.call("07985970880");
		myOld.call("00483565929");
		System.out.println(myOld.getBrand());
	}
	
}