package D1223;
// Map에 실행할 클래스를 중복해 놓고 원하는 클래스를 실행하도록 한다.
// 그래서 랜덤하게 숫자를 발생하여 그 숫자를 3으로 나눈 나머지가 1 이면 one.java
//																							2 이면 two.java
//																							3 이면 three.java
import	java.util.*;
public class MainControl {
	MainControl() {
		try {
		Class		oneC = Class.forName("D1223.One");
		Class		twoC = Class.forName("D1223.Two");
		Class		threeC = Class.forName("D1223.Three");
		// 이것은 사용할 클래스를 로딩하고 있다.
		Object	oneO = oneC.newInstance();
		Object	twoO = twoC.newInstance();
		Object	threeO = threeC.newInstance();
		// new를 시킨다.
		
		HashMap map = new HashMap();
		map.put(0, oneO);
		map.put(1, twoO);
		map.put(2, threeO);	//각각의 요청에 의해 실행할 클래스 map에 등록
		
		// 이제 자동적으로 이3개중 하나를 실행하도록 하자.
		int num = (int)(Math.random() * 100);
		num = num % 3;
		// 이제 이 숫자에 관련된 클래스를 꺼낸다.
		Total	total = (Total)map.get(num);
		total.action();
		
		// 이 원리를 이용해서 요청이 들어오면 그 요청을 담당할 클래스를 메인 컨트롤러가
		// 선택하여 일을 분산할 수 있다.
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
	}
}
