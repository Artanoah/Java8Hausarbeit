package benchmarks.terminalMethoden.reduce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.reduce </br>
 * Verglichen wird mit der Klasse benchmarks.terminalMethoden.reduce.ReduceBenchmarkObject </br>
 * </br>
 * Als Benchmark werden alle Elemente der Liste <code>list</code> mit der Methode <code>join</code>
 * zu einem String vereint. Diese Vereinigung findet in einer <code>for</code>-Schleife mit einem
 * Akkumulator <code>akku</code> statt.
 * 
 * @author Steffen Giersch
 */
public class ForBenchmarkObject {
	
	private List<String> list = new ArrayList<>();
	
	public ForBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void forBenchmark() {
		String akku = "";
		for(String s : list) {
			akku = String.join(" ", akku, s);
		}
	}
}
