package abstractEx;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	/*
	 * 훅 메서
	 * 구현코드 없지만 하위 클래스에서 필요에 의해 구현을 하면 추가됨.
	 * */
	public void washCar() {};
	
	public void startCar() {
		System.out.println("시동을 겁니다. ");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다. ");
	}
	
	/*
	 * 자동차를 운행하는 일련의 과정.
	 * 시동걸기 -> 운전하기 -> 멈추기 -> 시동끄기
	 * 이 과정은 차종에 관계없이 동일해야함.
	 * 이 경우 final키워드를 사용하면 하위 메소드에서 오버라이딩 할 수 없음.
	 * 
	 * wiper() 메서드는 추상 메서드인데 추가하는 경우 하위클래스에서는 wiper를 구현해야할 의무가 있음.
	 * */
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // 빈값으로라도 메서드가 구현되어있음.
		turnOff();
	}
}
