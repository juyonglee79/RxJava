package chapter2;

import io.reactivex.Observable;

public class ObservableFromArray {

	public static void main(String[] args) {
		Integer[] arr = {100, 200, 300};
		Observable<Integer> source = Observable.fromArray(arr);
		source.subscribe(System.out::println);

	}

}
