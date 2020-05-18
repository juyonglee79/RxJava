package chapter2;

import io.reactivex.Observable;
import io.reactivex.Single;

public class SingleExample {

	public static void main(String[] args) {
	
		//Single Ŭ������ just() �Լ� Ȱ�� ����
		Single<String> source = Single.just("Hello Single");
		source.subscribe(System.out::println);
		
		// 1.���� Observable���� Single ��ü�� ��ȯ�ϱ�
		Observable<String> source2 = Observable.just("Hello Single");
		Single.fromObservable(source2)
			.subscribe(System.out::println);
		
		// 2.single() �Լ��� ȣ���� Single ��ü �����ϱ�
		Observable.just("Hello Single")
			.single("default item")
			.subscribe(System.out::println);
		
		// 3.first() �Լ��� ȣ���� Single ��ü �����ϱ�
		String[] colors = {"Red", "Blue", "Gold"};
		Observable.fromArray(colors)
			.single("default item")
			.subscribe(System.out::println);
		
		// 4.empty Observable���� Single ��ü �����ϱ�
		Observable.empty()
			.single("default item")
			.subscribe(System.out::println);
		
		// 5.take() �Լ����� Single ��ü �����ϱ�
		Observable.just(new Order("ORD-1"), new Order("ORD-2"))
			.take(1)
			.single(new Order("default order"))
			.subscribe(System.out::println);

	}

}
