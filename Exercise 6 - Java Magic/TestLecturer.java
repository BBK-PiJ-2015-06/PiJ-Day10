public class TestLecturer {
	public static void main(String[] args) {
		TestLecturer launcher = new TestLecturer();
		launcher.launch();
	}
	private void launch() {
		Lecturer programmingLecturer = new Lecturer("Sergio");
		String name = programmingLecturer.getName();
		System.out.println(name + " is....");
		programmingLecturer.teach("Programming in Java");
		programmingLecturer.doResearch("machine learning");
	}
}