package std_singleton;

public class Singleton {
	private static Singleton one;				//정적 변수 one, 데이터 영역에 할당되어 프로그램의 시작에 할당되고 프로그램 종료에 소멸
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(one==null) {							//프로그램이 시작된 후, 객체 생성이 한 번만 이루어지도록 강제하기 위한 조건
			one = new Singleton();				//heap영역에 객체 생성
		}
		return one;
	}

}
