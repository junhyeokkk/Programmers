package STACK_QUEUE;

import java.util.*;

public class Process {
	 public int solution(int[] priorities, int location) {
		 int answer = 0;
		 
		 // (인덱스, 우선순위) 형태로 큐에 삽입 
		 Queue<int[]> queue = new LinkedList<int[]>();
		  
		 // 숫자 큰 순서부터 우선순위 ! 내림차순 정렬 
		 PriorityQueue<Integer> maxPri = new PriorityQueue<>(Collections.reverseOrder());
		 
		 for(int i=0; i<priorities.length; i++) {
			 // 큐 삽입 (인덱스, 우선순위)
			 queue.add(new int[]{i,priorities[i]});
			 // 우선순위큐 삽입 (우선순위만)
			 maxPri.add(priorities[i]);
			 
		 }
		 
		 // 작업시작 
		 while(!queue.isEmpty()) {
			 // 현재 작업 프로세스 [0,2] ==> [인덱스, 우선순위] ==> cur[1]과 우선순위 비교
			 int[] cur = queue.poll();
			 
			 if(cur[1] == maxPri.peek()) { // 우선순위 가장 높은 프로세스가 맞다면
				 answer++; // 작업 실행
				 maxPri.poll(); // 우선순위 큐에서 해제 
			 
				 if(cur[0] == location) { // 내가 찾고있는 프로세스가 일치한다면 answer 반환
					 return answer;
				 }
			 } else { // 우선순위 작업이 아니라면 다시 큐에 삽입
				 queue.add(cur);
			 }
		 }
		 
		 return answer;
	 }
}
