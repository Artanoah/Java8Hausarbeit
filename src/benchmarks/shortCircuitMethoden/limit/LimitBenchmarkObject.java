package benchmarks.shortCircuitMethoden.limit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.limit </br>
 * Verglichen wird mit der Klasse benchmarks.shortCircuitMethoden.limit.ForBenchmark </br>
 * </br>
 * Als Benchmark werden die Elemente der Liste <code>list</code> als Stream aufgerufen und mit
 * der Methode <code>limit</code> begrenzt. Die Anzahl liegt sowohl bei diesem, als auch bei dem 
 * Vergleichsbenchmark bei 20 Elementen. Die 20 Elemente werden mit der Methode <code>
 * toUpperCase</code> verarbeitet.
 * 
 * @author Steffen Giersch
 */
public class LimitBenchmarkObject {

	private List<String> list = new ArrayList<>();
	
	public LimitBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void limitBenchmark() {
		list.stream().
			limit(20).
			forEach(s -> s.toUpperCase());
	}
}
