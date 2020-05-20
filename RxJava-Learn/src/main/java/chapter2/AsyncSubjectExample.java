package chapter2;

import io.reactivex.subjects.AsyncSubject;

public class AsyncSubjectExample {

	public static void main(String[] args) {
		// AsyncSubject Ŭ���� Ȱ�� ����
		AsyncSubject<String> subject = AsyncSubject.create();
		subject.subscribe(data -> System.out.println("Subscriber #1 => "+ data));
		subject.onNext("1");
		subject.onNext("2");
		subject.subscribe(data -> System.out.println("Subscriber #2 => "+ data));
		subject.onNext("5");
		subject.onComplete();
		

	}

}
