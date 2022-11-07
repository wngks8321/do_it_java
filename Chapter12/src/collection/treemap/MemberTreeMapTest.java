package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member member1 = new Member(102, "멤버2");
		Member member2 = new Member(101, "멤버1");
		Member member3 = new Member(103, "멤버3");
		
		memberTreeMap.addMember(member1);
		memberTreeMap.addMember(member2);
		memberTreeMap.addMember(member3);
		
		memberTreeMap.showAllMember();
		
//		memberTreeMap.removeMember(101);
//		memberTreeMap.showAllMember();
	}

}
