public class RestrictedSmartPhone extends SmartPhone {
	
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}
	
	@Override
	private void playGame(String game) {
		System.out.println("Playing " + game);
	}
}