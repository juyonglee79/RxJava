package chapter2;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

public class ObservableFromLterable {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("JERRY");
		names.add("William");
		names.add("Bob");
		
		Observable<String> source = Observable.fromIterable(names);
		source.subscribe(System.out::println);

	}

}