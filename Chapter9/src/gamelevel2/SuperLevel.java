package gamelevel2;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("Super run");
	}

	@Override
	public void jump() {
		System.out.println("Super jump");		
	}

	@Override
	public void turn() {
		System.out.println("Super turn");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("====Super Level====");		
	}
}
