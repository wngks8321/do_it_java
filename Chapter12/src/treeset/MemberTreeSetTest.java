package treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member member1 = new Member(102, "멤버2");
		Member member2 = new Member(101, "멤버1");
		Member member3 = new Member(103, "멤버3");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		
		memberTreeSet.showAllMember();
	}

}
