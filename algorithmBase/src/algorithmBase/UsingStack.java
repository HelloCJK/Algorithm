package algorithmBase;

import java.util.Iterator;
import java.util.Stack;
//list�� �������� ���δ�.

public class UsingStack {

	public static void main(String[] args) {
		Stack sta = new Stack();
		
		sta.push(12);
		sta.push("home");
		sta.push(12.6);
		//stack�� ���������� �Է�
		
		Iterator iterator1 = sta.iterator();
		while (iterator1.hasNext()) {
		    System.out.print(iterator1.next()+" ");
		}
		System.out.println();
		//stack�� ���� ���
		
		System.out.println(sta.size());
		// stack ������
		
        System.out.println(sta.peek());
        // �����͸� ���� �ʰ� ���� ���� ���� ��ġ�ϴ� ������ Ȯ��
		
		Iterator iterator2 = sta.iterator();
		while (iterator2.hasNext()) {
		    System.out.print(sta.pop()+" ");
		}
		System.out.println();
		//stack�� ���� ���������� ������
		
	}

}
