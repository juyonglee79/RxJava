package chapter2;

import java.util.concurrent.Callable;

import io.reactivex.Observable;

public class ObservableFormCallable {

	/*
	//fromCallable() 함수 이용
	public static void main(String[] args) {
		Callable<String> callable = () -> {
			Thread.sleep(1000);
			return "Hello Callable!";
		};
		
		Observable<String> source = Observable.fromCallable(callable);
		source.subscribe(System.out::println);

	}
	*/
	
	Callable<String> callable = new Callable<String>() {
		@Override
		public String call() throws Exception {
			Thread.sleep(1000);
			return "Hello Callable!";
		}
	};
	Observable<String> source = Observable.fromCallable(callable);
	source.subscribe(System.out::println);
	
}
