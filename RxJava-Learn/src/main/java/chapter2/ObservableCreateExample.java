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
		
		
		//subscribe �Լ��� ȣ������ �ʾ����Ƿ� �ƹ��͵� ��µ��� �ʴ´�.
		Observable<Integer> source = Observable.create(
				(ObservableEmitter<Integer> emitter)-> {
					emitter.onNext(100);
					emitter.onNext(200);
					emitter.onNext(300);
					emitter.onComplete();
				});
		
		
		//���ٸ� ����� �Լ�
		Observable<Integer> source = Observable.create(
				(ObservableEmitter<Integer> emitter)-> {
					emitter.onNext(100);
					emitter.onNext(200);
					emitter.onNext(300);
					emitter.onComplete();
				});
		source.subscribe(data -> System.out.println("Result : "+ data));
		*/
		
		//�͸� ��ü Ȱ�� ��
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
