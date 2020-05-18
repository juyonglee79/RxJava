package chapter2;

import io.reactivex.Single;

public class SingleExample {

	public static void main(String[] args) {
	
		//Single 클래스의 just() 함수 활용 예시
		Single<String> source = Single.just("Hello Single");
		source.subscribe(System.out::println);

	}

}
