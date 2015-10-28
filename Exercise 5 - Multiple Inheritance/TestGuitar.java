public class TestGuitar {
	public static void main(String[] args) {
		TestGuitar launcher = new TestGuitar();
		launcher.launch();
	}
	public void launch() {
		Guitar myGuitar = new Guitar();
		myGuitar.play();
		myGuitar.burn();
	}
}