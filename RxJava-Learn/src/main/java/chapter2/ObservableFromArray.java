package chapter2;

import java.util.stream.IntStream;

import io.reactivex.Observable;

public class ObservableFromArray {

	public static void main(String[] args) {
		/*
		Integer[] arr = {100, 200, 300};
		Observable<Integer> source = Observable.fromArray(arr);
		source.subscribe(System.out::println);
	
		
		//int[] 사용했을 때
		Integer[] intArray = {100, 200, 300};
		Observable.fromArray(intArray).subscribe(System.out::println);
		*/
		
		int[] intArray = {400,500,600};
		Observable<Integer> source = Observable.fromArray(toIntegerArray(intArray));
		source.subscribe(System.out::println);
	}
	
	private static Integer[] toIntegerArray(int[] intArray) {
		return IntStream.of(intArray).boxed().toArray(Integer[]::new);
	}

}
