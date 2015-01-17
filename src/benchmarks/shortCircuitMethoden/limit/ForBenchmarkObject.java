package benchmarks.shortCircuitMethoden.limit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.limit </br>
 * Verglichen wird mit der Klasse benchmarks.shortCircuitMethoden.limit.limitBenchmarkObject </br>
 * </br>
 * Als Benchmark werden die Elemente der Liste <code>list</code> mit einem Counter auf eine
 * maximale Menge an Durchlaeufen durch eine <code>for</code>-Schleife begrenzt. Diese Menge
 * liegt sowohl bei diesem, als auch bei dem Vergleichsbenchmark bei 20 Elementen. Die 20 Elemente 
 * werden mit der Methode <code>toUpperCase</code> verarbeitet.
 * 
 * @author Steffen Giersch
 */
public class ForBenchmarkObject {

	private List<String> list = new ArrayList<>();
	
	public ForBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void forBenchmark() {
		long counter = 0;
		for(String s : list) {
			if(counter >= 20) {
				return;
			}
			s.toUpperCase();
			counter++;
		}
	}
}
