package std_singleton;

public class Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1==s2);				//생성된 같은 객체 주소를 공유하고 있기 때문에 true가 출력된다.
	}

}
