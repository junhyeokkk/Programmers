package DFS_BFS;

public class targatnumber {

    public static int solution(int[] numbers, int target) {
        
        return findTarget(numbers, target, 0 , 0);
    }
    
    // 타깃숫자 찾는 함수 
    public static int findTarget(int numbers[], int target, int index, int sum) {
    	
    	// 모든 숫자
    	if(index == numbers.length) {
    		return sum == target ? 1 : 0;
    	}
    	
    	int add = findTarget(numbers ,target, index + 1, sum + numbers[index]);
    	int sub = findTarget(numbers ,target, index + 1, sum - numbers[index]);
    	
    	return add + sub;
    }
	
	public static void main(String args[]) {
		
		// 테스트 케이스 
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3; 
		
	
		System.out.println("답 : " + solution(numbers, target));
		
	}
}
