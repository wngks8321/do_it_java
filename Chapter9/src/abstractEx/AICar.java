package abstractEx;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}

	@Override
	public void wiper() {
		System.out.println("자동차가 스스로 와이퍼를 조정합니다.");
	}

	@Override
	public void washCar() {
		System.out.println("자동차가 스스로 세차합니다. ");
	}

}
