package Hash;

import java.util.*;

// 완주하지 못한 선수 
public class DNF {
	 public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        Map<String,Integer> resultMap = new HashMap<>();
	        
	        // 참가자 이름 : 카운트 맵 형태로 저장 
	        for(String name : participant) {
	        	// getOrDefault 동명이인일 경우 같은 키로 접근하여 value를 +1 
	            resultMap.put(name, resultMap.getOrDefault(name, 0) + 1);
	        }
	        
	        for(String name : completion) {
	        	// Map에서 값을 업데이트 해주려면 put으로 해줘야 업데이트가 가능
	        	resultMap.put(name, resultMap.getOrDefault(name, 0) - 1);
	        }
	        
	        // Map의 value가 0이 아닌 name return 
	        for(String result : resultMap.keySet()) {
	        	if(resultMap.get(result) != 0) {
	        		answer = result;
	        	}
	        }
	        
	        return answer;
	    }
}
