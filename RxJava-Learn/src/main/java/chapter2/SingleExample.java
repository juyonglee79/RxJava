package chapter2;

import io.reactivex.Single;

public class SingleExample {

	public static void main(String[] args) {
	
		//Single Ŭ������ just() �Լ� Ȱ�� ����
		Single<String> source = Single.just("Hello Single");
		source.subscribe(System.out::println);

	}

}
