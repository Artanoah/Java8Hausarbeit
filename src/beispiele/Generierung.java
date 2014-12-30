package beispiele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Beispielklasse zur Generierung von Streams. </br>
 * Diese Klasse soll die wichtigsten Methoden demonstrieren Streams zu erzeugen. 
 * Dabei wird fuer jeden erzeugten Stream die selbe Folge Methoden aufgerufen um 
 * zu zeigen, dass das Verhalten bei allen erzeugten Streams das Selbe ist.
 * 
 * @author Steffen Giersch
 */
public class Generierung {
	static int i = 1;
	
	public static void main(String[] args) {
		ausList().
			filter(i -> i % 2 == 0).
			forEach(i -> System.out.println(i));
		
		ausArray().
			filter(i -> i % 2 == 0).
			forEach(i -> System.out.println(i));
		
		ausElementen().
			filter(i -> i % 2 == 0).
			forEach(i -> System.out.println(i));
		
		ausGenerator().
			filter(i -> i % 2 == 0).
			forEach(i -> System.out.println(i));
	}
	
	/**
	 * Erzeugt einen Stream aus dem Interface <code>List&lt;Integer&gt;</code> vom Typ 
	 * <code>ArrayList&lt;Integer&gt;</code> mit Integern von 1 bis 10.
	 * 
	 * @return <code>Stream&lt;Integer&gt;</code> Stream mit Integern von 1-10.
	 */
	private static Stream<Integer> ausList() {
		List<Integer> foo = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		return foo.stream();
	}
	
	/**
	 * Erzeugt einen Stream aus einem Integer Array <code>Integer[]</code> mit Integern 
	 * von 1 bis 10.
	 * 
	 * @return <code>Stream&lt;Integer&gt;</code> Stream mit Integern von 1-10.
	 */
	private static Stream<Integer> ausArray() {
		Integer[] foo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		return Stream.of(foo);
	}
	
	/**
	 * Erzeugt einen Stream direkt aus den Elementen die in dem Stream enthalten sein sollen.
	 * 
	 * @return <code>Stream&lt;Integer&gt;</code> Stream mit Integern von 1-10.
	 */
	private static Stream<Integer> ausElementen() {
		return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	
	/**
	 * Erzeugt einen Stream mit einer Generator-Methode. Diese Generator-Methode wird auf 
	 * 10 Elemente begrenzt.
	 * 
	 * @return <code>Stream&lt;Integer&gt;</code> Stream mit Integern von 1-10.
	 */
	private static Stream<Integer> ausGenerator() {
		return Stream.generate(Generierung::generator).limit(10);
	}
	
	private static Integer generator() {
		return i++;
	}
}
