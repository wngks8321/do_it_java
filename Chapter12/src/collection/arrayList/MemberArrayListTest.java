package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(101, "멤버1");
		Member member2 = new Member(102, "멤버2");
		Member member3 = new Member(103, "멤버3");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(member2.getMemberId());
		memberArrayList.showAll();
		
		memberArrayList.insertMember(member2, 2);
	}

}
