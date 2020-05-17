package chapter2;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import io.reactivex.Observable;

public class ObservableFromPublisher {

	//람다를 활용한 fromPublisher() 함수
	public static void main(String[] args) {
		Publisher<String> publisher = (Subscriber<? super String> s) -> {
			s.onNext("Hello Observable.fromPublisher()");
			s.onComplete();
		};
		
		Observable<String> source = Observable.fromPublisher(publisher);
		source.subscribe(System.out::println);

	}

}
