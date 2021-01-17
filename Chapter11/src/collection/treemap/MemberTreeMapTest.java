package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPack = new Member(300, "Pack");
		Member memberPack2 = new Member(400, "Pack");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPack);
		manager.addMember(memberPack2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
		
	}

}
