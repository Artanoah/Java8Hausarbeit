package benchmarks.shortCircuitMethoden.findFirst;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.findFirst </br>
 * Verglichen wird mit der Klasse benchmarks.shortCircuitMethoden.findFirst.ForBenchmark </br>
 * </br>
 * Als Benchmark wird in den Elementen der Liste nach einem Element mit dem Inhalt "sound" mittels der
 * Methode <code>startsWith</code> in einem Stream mit <code>filter</code>. Das Element ist an 20ter 
 * Stelle der Liste zu finden. Wenn das Element gefunden wurde, wird die Methode <code>toUpperCase</code> 
 * darauf ausgeführt und die Benchmark Methode terminiert.
 * 
 * @author Steffen Giersch
 */
public class FindFirstBenchmarkObject {
	
	private List<String> list = new ArrayList<>();
	
	public FindFirstBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void findFirstBenchmark() {
		Optional<String> o = list.stream().
			filter(s -> s.startsWith("sound")).
			findFirst();
		
		if(o.isPresent()) {
			o.get().toUpperCase();
		}
	}
}
