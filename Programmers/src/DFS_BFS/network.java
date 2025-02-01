package DFS_BFS;

public class network {
	
	// 컴퓨터를 노드, 네트워크를 간선이라고 생각하고 그래프 탐색으로 풀자
	// 연결 요소 개수를 구해야함 
	// DFS, BFS 둘다 가능
    
    public int solution(int n, int[][] computers) {
        int answer = 0; // 결과값 저장
        
        boolean[] visited = new boolean[n]; // 방문배열 생성
        
        for(int i=0; i<n ; i++){
            if(!visited[i]){
                dfs(i, computers, visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int node, int[][]computers, boolean[] visited){
        
        visited[node] = true; // 방문했음 
        
        for(int i=0; i<computers.length; i++){ // 컴퓨터 수만큼 반복
            if(computers[node][i] == 1 && !visited[i]){ // 방문하지 않거나 다른 컴퓨터 연결 노드가 1일때 재귀호출
                dfs(i, computers, visited);
            }
        }
        
    }
}