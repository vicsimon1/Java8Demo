package demo._stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator.OfInt;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


// first commit
public class StreamDemo { 
	public static void main(String[] args) { 
		
		IntStream.range(0, 10).forEach(i -> System.out.println(i)); 
		//<  static method   >  
		
		
		List<String> names = Stream.of("Tony", "Tom", "Jonn").
				collect(Collectors.toList());
		List<String> names2 = Arrays.asList("Tony", "Tom", "Jonn");
		System.out.println(names.toString());
		System.out.println(names2.toString());
		
		
		Set<String> names3 = Stream.of("Tony", "Tony", "Tony", "Tom", "Jonn").
				collect(Collectors.toSet());
		System.out.println(names3.toString()); // Set 集合會去除重覆
		
		
		//
		//foreach
		List<String> names4 = new ArrayList<>();
		for (String name : asList("tony", "tom", "john")) {
		    String upperName = name.toUpperCase();
		    names4.add(upperName);
		}
		System.out.println(names4.toString());
		//[TONY, TOM, JOHN]

		//Stream
		List<String> names5 = Stream.of("tony", "tom", "john")
		                            .map(name -> name.toUpperCase())
		                            .collect(toList());
		System.out.println(names5.toString());
		
	}

}
