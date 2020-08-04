package Main.DTO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDAO {
	private static long nextId = 0;
	private static Map<String, MemberDTO> map = new HashMap<String, MemberDTO>(); 
	// 해쉬맵은 맵을 상속받고 있음
	// 맵으로 부터 
	
	public void insert(MemberDTO dto) {
		dto.setId(++nextId); 
		map.put(dto.getEmail(), dto);
	}
	
	public MemberDTO selectByEmail(String email) {
		return map.get(email);
	}

	public Collection<MemberDTO> selectAll() {
		
		return map.values(); // 맵의 벨류를 리텁하면 컬렉션이ㄲ
	}
} 
