package chapter2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.reactivex.Observable;

public class ObservableFromLterable {

	public static void main(String[] args) {
		/*
		List<String> names = new ArrayList<>();
		names.add("JERRY");
		names.add("William");
		names.add("Bob");
		
		Observable<String> source = Observable.fromIterable(names);
		source.subscribe(System.out::println);
		*/
		
		//Set »ç¿ë
		Set<String> cities = new HashSet<>();
		cities.add("Seoul");
		cities.add("London");
		cities.add("Paris");
		
		Observable<String> source = Observable.fromIterable(cities);
		source.subscribe(System.out::println);

	}

}
