package scheduler;

public class AgentGetCall implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담원이 전화요청 ");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화상담을 가져감. ");
	}

}
