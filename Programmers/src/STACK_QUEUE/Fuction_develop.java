package STACK_QUEUE;
import java.util.*;

public class Fuction_develop {
	public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();

        for(int i=0; i<progresses.length; i++){
            int a = 100 - progresses[i];
            int res = (int) Math.ceil((double) a / speeds[i]);
            daysQueue.add(res);

        }

        while(!daysQueue.isEmpty()) {
            int deday = daysQueue.poll();
            int num = 1;

            while(!daysQueue.isEmpty() && daysQueue.peek() <= deday) {
                daysQueue.poll();
                num ++;
            }
            result.add(num);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
