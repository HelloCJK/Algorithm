package algorithmBase;

import java.util.*;

public class UsingQueue {

	public static void main(String[] args) {
		Queue que = new LinkedList();
		//queue는 인터페이스로만 정의해 놓아 별도의클래스를 제공하고 있지 않다. 대신 queue를 구현한 다른 클래스들을 이용해 사용한다.
		//such as..Collection, LinkedList, PriorityQueue, LinkedBlockingQueue
		//BlockingQueue, ArrayBlockingQueue, LinkedBlockingQueue, PriorityBlockingQueue
		
		que.offer(80);
		que.offer("made");
		que.offer(12.3);
		
		Iterator iterator = que.iterator();
		while (iterator.hasNext()) {
		    System.out.print(iterator.next()+" ");
		}
		System.out.println();
		//queue의 내용 출력
		
		System.out.println(que.size());
		// queue 사이즈
		
        System.out.println(que.peek());
        // 데이터를 빼지 않고 현재 가장 위에 위치하는 데이터 확인
        
		while (!que.isEmpty()) {
		    System.out.print(que.poll()+" ");
		}
		System.out.println();
		//queue의 내용 순차적으로 내보냄
        
		que.clear();
		//queue초기화

	}

}
