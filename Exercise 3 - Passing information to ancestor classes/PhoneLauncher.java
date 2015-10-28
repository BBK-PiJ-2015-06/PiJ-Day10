public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhone myphone = new SmartPhone("Sony");
		myphone.call("07985970880");
		myphone.call("00483565929");
		myphone.ringAlarm("Wake Up!");
		myphone.playGame("Minesweeper");
		myphone.printLastNumbers();
		myphone.browseWeb("Google");
		myphone.findPosition();
		System.out.println(myphone.getBrand());
	}
}