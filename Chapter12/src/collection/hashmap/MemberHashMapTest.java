package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(102, "멤버2");
		Member member2 = new Member(101, "멤버1");
		Member member3 = new Member(103, "멤버3");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(101);
		memberHashMap.showAllMember();
	}

}
