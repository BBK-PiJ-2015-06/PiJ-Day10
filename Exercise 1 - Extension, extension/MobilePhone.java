public class MobilePhone extends OldPhone {
	
	private String[] callNumbers;
	
	public MobilePhone() {
		String[] callNumbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		callNumbers[9] = callNumbers[8];
		callNumbers[8] = callNumbers[7];
		callNumbers[7] = callNumbers[6];
		callNumbers[6] = callNumbers[5];
		callNumbers[5] = callNumbers[4];
		callNumbers[4] = callNumbers[3];
		callNumbers[3] = callNumbers[2];
		callNumbers[2] = callNumbers[1];
		callNumbers[1] = callNumbers[0];
		callNumbers[0] = number;
	}
	
	public void ringAlarm(String event) {
		System.out.println("Alarm ringing for " + event);
	}
	
	public void playGame(String game) {
		System.out.println("Playing " + game);
	}
	
	public void printLastNumbers() {
		System.out.println("Recent contacts: ")
		for(int count = 0; count < 10; count++) {
			System.out.println(callNumbers[count]);
		}
	}
	
}