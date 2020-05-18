package chapter2;

import io.reactivex.Observable;
import io.reactivex.Single;

public class SingleExample {

	public static void main(String[] args) {
	
		//Single 클래스의 just() 함수 활용 예시
		Single<String> source = Single.just("Hello Single");
		source.subscribe(System.out::println);
		
		// 1.기존 Observable에서 Single 객체로 변환하기
		Observable<String> source2 = Observable.just("Hello Single");
		Single.fromObservable(source2)
			.subscribe(System.out::println);
		
		// 2.single() 함수를 호출해 Single 객체 생성하기
		Observable.just("Hello Single")
			.single("default item")
			.subscribe(System.out::println);
		
		// 3.first() 함수를 호출해 Single 객체 생성하기
		String[] colors = {"Red", "Blue", "Gold"};
		Observable.fromArray(colors)
			.single("default item")
			.subscribe(System.out::println);
		
		// 4.empty Observable에서 Single 객체 생성하기
		Observable.empty()
			.single("default item")
			.subscribe(System.out::println);
		
		// 5.take() 함수에서 Single 객체 생성하기
		Observable.just(new Order("ORD-1"), new Order("ORD-2"))
			.take(1)
			.single(new Order("default order"))
			.subscribe(System.out::println);

	}

}
