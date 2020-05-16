package chapter2;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import io.reactivex.Observable;

public class ObservableFromFuture {
	
	//fromFuture 함수 사용
	public static void main(String[] args) {
		Future<String> future = Executors.newSingleThreadExecutor().submit(() -> {
			Thread.sleep(1000);
			return "Hello Future";
		});
		
		Observable<String> source = Observable.fromFuture(future);
		source.subscribe(System.out::println);
	}
}
