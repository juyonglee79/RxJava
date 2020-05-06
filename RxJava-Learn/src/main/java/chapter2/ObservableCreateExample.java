package chapter2;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.functions.Consumer;

public class ObservableCreateExample {
	
	public static void main(String[] args) {
		
		/*
		Observable<Integer> source = Observable.create(
				(ObservableEmitter<Integer> emitter)-> {
					emitter.onNext(100);
					emitter.onNext(200);
					emitter.onNext(300);
					emitter.onComplete();
				});
		
		source.subscribe(System.out::println);
		
		
		//subscribe 함수를 호출하지 않았으므로 아무것도 출력되지 않는다.
		Observable<Integer> source = Observable.create(
				(ObservableEmitter<Integer> emitter)-> {
					emitter.onNext(100);
					emitter.onNext(200);
					emitter.onNext(300);
					emitter.onComplete();
				});
		
		
		//람다를 사용한 함수
		Observable<Integer> source = Observable.create(
				(ObservableEmitter<Integer> emitter)-> {
					emitter.onNext(100);
					emitter.onNext(200);
					emitter.onNext(300);
					emitter.onComplete();
				});
		source.subscribe(data -> System.out.println("Result : "+ data));
		*/
		
		//익명 객체 활용 예
		Observable<Integer> source = Observable.create(
				(ObservableEmitter<Integer> emitter)-> {
					emitter.onNext(100);
					emitter.onNext(200);
					emitter.onNext(300);
					emitter.onComplete();
				});
		
		source.subscribe(new Consumer<Integer>() {
			@Override
			public void accept(Integer data) throws Exception {
				System.out.println("Result : "+ data);
			}
		});
		
	}

}
