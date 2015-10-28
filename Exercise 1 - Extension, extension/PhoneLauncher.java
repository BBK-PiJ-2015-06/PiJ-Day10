public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		Smartphone myphone = new Smartphone();
		myphone.call("07985970880");
		myphone.call("01483565929");
		myphone.call("07918088592");
		myphone.call("01483565929");
		myphone.call("01483888000");
		myphone.call("07985970880");
		myphone.call("01483565929");
		myphone.call("07918088592");
		myphone.call("01483565929");
		myphone.call("01483888000");
		myphone.ringAlarm("Wake Up!");
		myphone.playGame("Minesweeper");
		myphone.printLastNumbers();
		myphone.browseWeb("Google");
		myphone.findPosition();
	}
}