package beispiele;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * Beispielklasse zur Funktionsweise von parallelen Streams.</br>
 * Diese Klasse soll die Funktion von parallelen Streams aufzeigen.
 * Hierfuer werden sowohl ein paralleler, als auch ein sequentieller
 * Stream mit jeweils 3 Elementen befuellt und fuer jedes dieser 
 * Elemente eine Methode ausgefuehrt die eine Sekunde Laufzeit
 * benoetigt. Am Output der Methode <code>main</code> ist zu 
 * erkennen, dass der parallele Stream auf einem 4-Kern Prozessor
 * nur gut ein drittel der Laufzeit des sequentiellen Streams
 * benoetigt.
 * 
 * @author Steffen Giersch, Orientiert an: Hall, Marty: “Streams in Java8: Part2”. Folien 29-30
 */
public class ParallelStream {

	/**
	 * Hauptmethode.</br>
	 * Output (getestet auf einem 4-Kern-Computer):</br><code>
	 * Serial time: 3033 milliseconds</br>
	 * Parallel time: 1058 milliseconds</br>
	 * </code>
	 * 
	 * @param args <code>String[]</code> Unbenutzt.
	 */
	public static void main(String[] args) {
		Stream<Integer> serialStream = Stream.of(1, 2, 3);
		Stream<Integer> parallelStream = Stream.of(1, 2, 3).parallel();
		
		long serialStartTime = System.currentTimeMillis();
		serialStream.forEach(ParallelStream::slowOperation);
		long serialEndTime = System.currentTimeMillis();
		
		long parallelStartTime = System.currentTimeMillis();
		parallelStream.forEach(ParallelStream::slowOperation);
		long parallelEndTime = System.currentTimeMillis();
		
		System.out.println("Serial time: " + (serialEndTime - serialStartTime) + " milliseconds");
		System.out.println("Parallel time: " + (parallelEndTime - parallelStartTime) + " milliseconds");
	}

	/**
	 * Wartet eine Sekunde um eine langsame Operation zu simulieren.
	 * 
	 * @param i <code>Integer</code> Unbenutzt. Dient nur zum Aufruf im Stream.
	 */
	private static void slowOperation(Integer i) {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
