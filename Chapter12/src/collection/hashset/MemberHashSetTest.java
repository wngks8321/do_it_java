package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member1 = new Member(101, "멤버1");
		Member member2 = new Member(102, "멤버2");
		Member member3 = new Member(103, "멤버3");
		Member member1_2 = new Member(101, "멤버1_2");
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		
		// id가 같지만 등록이 되는 이유는 Member클래스에  equals와 hashCode를 구현하지 않았기 때문임.
		// Member 클래스에 hashCode와 equals를 구현해서 같은 id인 경우 addMember되지 않음. 
		memberHashSet.addMember(member1_2);  

		memberHashSet.showAllMember();
	}

}
