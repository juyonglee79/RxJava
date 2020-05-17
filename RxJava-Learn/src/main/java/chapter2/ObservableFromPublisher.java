package chapter2;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import io.reactivex.Observable;

public class ObservableFromPublisher {

	public static void main(String[] args) {
		/*
		//람다를 활용한 fromPublisher() 함수
		Publisher<String> publisher = (Subscriber<? super String> s) -> {
			s.onNext("Hello Observable.fromPublisher()");
			s.onComplete();
		};
		
		Observable<String> source = Observable.fromPublisher(publisher);
		source.subscribe(System.out::println);
		*/
		
		//람다를 사용하지 않은 fromPublisher() 함수
		Publisher<String> publisher = new Publisher<String>() {
			@Override
			public void subscribe(Subscriber<? super String> s) {
				s.onNext("Hello Observable.fromPublisher()");
				s.onComplete();
			}
		};
		
		Observable<String> source = Observable.fromPublisher(publisher);
		source.subscribe(System.out::println);
	}

}
