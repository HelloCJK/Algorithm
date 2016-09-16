package algorithmBase;

import java.util.*;

public class UsingQueue {

	public static void main(String[] args) {
		Queue que = new LinkedList();
		//queue�� �������̽��θ� ������ ���� ������Ŭ������ �����ϰ� ���� �ʴ�. ��� queue�� ������ �ٸ� Ŭ�������� �̿��� ����Ѵ�.
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
		//queue�� ���� ���
		
		System.out.println(que.size());
		// queue ������
		
        System.out.println(que.peek());
        // �����͸� ���� �ʰ� ���� ���� ���� ��ġ�ϴ� ������ Ȯ��
        
		while (!que.isEmpty()) {
		    System.out.print(que.poll()+" ");
		}
		System.out.println();
		//queue�� ���� ���������� ������
        
		que.clear();
		//queue�ʱ�ȭ

	}

}
