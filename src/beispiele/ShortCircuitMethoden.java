package beispiele;

import java.util.stream.Stream;

/**
 * Beispielklasse zur Funktionsweise von Short-Circuit-Methoden</br>
 * Diese Klasse soll die Funktion von Short-Curcuit-Methoden aufzeigen 
 * nicht benötigte Berechnungen zu ueberspringen. Hierfuer wird ein 
 * Stream mit 10 Elementen verarbeitet, der mit der Short-Circuit-Methode 
 * <code>limit()</code> auf 3 Elemente verkleinert wird. Am Output
 * der Methode <code>main</code> ist zu erkennen, dass die Lambda-Methode 
 * in <code>map()</code> nur 3, und nicht 10 mal ausgefuert wird.
 * 
 * @author Steffen Giersch
 */
public class ShortCircuitMethoden {

	/**
	 * Hauptmethode.</br>
	 * Output:</br><code>
	 * Map has been called!</br>
	 * 1</br>
	 * Map has been called!</br>
	 * 2</br>
	 * Map has been called!</br>
	 * 3</br>
	 * </code>
	 * 
	 * @param args <code>String[]</code> Unbenutzt.
	 */
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).
			map(i -> {
				System.out.println("Map has been called!");
				return i;
			}).
			limit(3).
			forEach(System.out::println);
	}
}
