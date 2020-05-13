package chapter2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order;

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
		
		
		//Set 사용
		Set<String> cities = new HashSet<>();
		cities.add("Seoul");
		cities.add("London");
		cities.add("Paris");
		
		Observable<String> source = Observable.fromIterable(cities);
		source.subscribe(System.out::println);
		*/

		//fromIterable()에 BlockingQueue 사용
		BlockingQueue<Order> orderQueue = new ArrayBlockingQueue<>(100);
		orderQueue.add(new Order("ORD-1"));
		orderQueue.add(new Order("ORD-2"));
		orderQueue.add(new Order("ORD-3"));
		
		Observable<Order> source = Observable.fromIterable(orderQueue);
		source.subscribe(order -> System.out.println(order.getId()));
		
	}

}
