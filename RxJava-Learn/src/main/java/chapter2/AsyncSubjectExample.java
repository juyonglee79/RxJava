package chapter2;

import io.reactivex.subjects.AsyncSubject;

public class AsyncSubjectExample {

	public static void main(String[] args) {
		
	/*
		// AsyncSubject 클래스 활용 예시
		AsyncSubject<String> subject = AsyncSubject.create();
		subject.subscribe(data -> System.out.println("Subscriber #1 => "+ data));
		subject.onNext("1");
		subject.onNext("2");
		subject.subscribe(data -> System.out.println("Subscriber #2 => "+ data));
		subject.onNext("5");
		subject.onComplete();
		
		// 구독자로 동작하는  AsyncSubject 클래스
		Float[] temperature = {10.1f, 13.4f, 12.5f};
		Observable<Float> source = Observable<T>.fromArray(temperature);
		
		AsycSubject<Float> subject = AsyncSubject.create();
		subject.subscribe(data -> System.out.println("Subscriber #1 => "+ data));
		
		source.subscribe(subject);
	*/
		
		AsyncSubject<Integer> subject = AsyncSubject.create();
		subject.onNext(10);
		subject.onNext(11);
		subject.subscribe(data -> System.out.println());
		subject.onNext(12);
		subject.onComplete();
		subject.onNext(13);
		subject.subscribe(data -> System.out.println("Subscriber #2 => "+ data));
		subject.subscribe(data -> System.out.println("Subscriber #3 => "+ data));
		
		
	}

}
