package collection.hashmap;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPack = new Member(300, "Pack");
		Member memberPack2 = new Member(300, "Pack");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPack);
		manager.addMember(memberPack2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
		
	}

}
