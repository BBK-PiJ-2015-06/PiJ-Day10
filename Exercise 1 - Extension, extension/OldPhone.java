public class OldPhone implements Phone {
	
	private int number;
	
	public OldPhone() {
		this.number = 0;
	}
	
	public void call(String number) {
		System.out.println("Calling " + number);
		this.number = number;
	} 
	
}