public class MobilePhone extends OldPhone {
	
	public MobilePhone() {
		super();
	}
	
	public void ringAlarm(String event) {
		System.out.println("Alarm ringing for " + event);
	}
	
	public void playGame(String game) {
		System.out.println("Playing " + game);
	}
	
	public void printLastNumbers() {
		System.out.println(this.number);
	}
	
}