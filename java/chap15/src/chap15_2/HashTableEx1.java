package chap15_2;
import java.util.*;
public class HashTableEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("kkt1234", "1004");
		map.put("yjo9515", "3202");
		map.put("tmaz1234", "1541");
		map.put("dbswnsdhch", "4778");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("[아이디] : ");
			String id = scan.nextLine();
			System.out.println("[비밀번호] : ");
			String pw = scan.nextLine();
			if(map.containsKey(id)) {
			if(map.get(id).equals(pw)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				System.out.println("비밀번호가 다릅니다.");
			}	
			} else {
				System.out.println("해당하는 아이디가 존재하지 않습니다.");
			}
			
		
		}
		
	}

}
