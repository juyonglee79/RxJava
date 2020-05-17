package chapter2;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import io.reactivex.Observable;

public class ObservableFromPublisher {

	public static void main(String[] args) {
		/*
		//���ٸ� Ȱ���� fromPublisher() �Լ�
		Publisher<String> publisher = (Subscriber<? super String> s) -> {
			s.onNext("Hello Observable.fromPublisher()");
			s.onComplete();
		};
		
		Observable<String> source = Observable.fromPublisher(publisher);
		source.subscribe(System.out::println);
		*/
		
		//���ٸ� ������� ���� fromPublisher() �Լ�
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
