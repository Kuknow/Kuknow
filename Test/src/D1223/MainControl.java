package D1223;
// Map�� ������ Ŭ������ �ߺ��� ���� ���ϴ� Ŭ������ �����ϵ��� �Ѵ�.
// �׷��� �����ϰ� ���ڸ� �߻��Ͽ� �� ���ڸ� 3���� ���� �������� 1 �̸� one.java
//																							2 �̸� two.java
//																							3 �̸� three.java
import	java.util.*;
public class MainControl {
	MainControl() {
		try {
		Class		oneC = Class.forName("D1223.One");
		Class		twoC = Class.forName("D1223.Two");
		Class		threeC = Class.forName("D1223.Three");
		// �̰��� ����� Ŭ������ �ε��ϰ� �ִ�.
		Object	oneO = oneC.newInstance();
		Object	twoO = twoC.newInstance();
		Object	threeO = threeC.newInstance();
		// new�� ��Ų��.
		
		HashMap map = new HashMap();
		map.put(0, oneO);
		map.put(1, twoO);
		map.put(2, threeO);	//������ ��û�� ���� ������ Ŭ���� map�� ���
		
		// ���� �ڵ������� ��3���� �ϳ��� �����ϵ��� ����.
		int num = (int)(Math.random() * 100);
		num = num % 3;
		// ���� �� ���ڿ� ���õ� Ŭ������ ������.
		Total	total = (Total)map.get(num);
		total.action();
		
		// �� ������ �̿��ؼ� ��û�� ������ �� ��û�� ����� Ŭ������ ���� ��Ʈ�ѷ���
		// �����Ͽ� ���� �л��� �� �ִ�.
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
	}
}
