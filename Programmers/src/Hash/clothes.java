package Hash;

import java.util.*;

public class clothes {

    // 1. 종류마다 각 종류의 개수 + 1(안입는경우)
    // 2. 각 종류의 경우의 수를 곱하기 
    public int solution(String[][] clothes) {

    	Map<String, Integer> cMap = new HashMap<>();
    	
    	for(String[] cloth : clothes) {
    		String type = cloth[1];
    		cMap.put(type, cMap.getOrDefault(type,0)+1);
    	}
    	
    	int answer = 1;
    	
    	for(int count : cMap.values()) {
    		answer *= count + 1;
    	}
    	
    	return answer -1;
 
    }
	
}
