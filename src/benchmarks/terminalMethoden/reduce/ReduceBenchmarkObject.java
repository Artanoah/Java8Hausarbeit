package benchmarks.terminalMethoden.reduce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.reduce </br>
 * Verglichen wird mit der Klasse benchmarks.terminalMethoden.reduce.ForBenchmark </br>
 * </br>
 * Als Benchmark werden alle Elemente der Liste <code>list</code> mit der Methode <code>join</code>
 * zu einem String vereint. Dies geschieht in einem aus der Liste erzeugten stream mit der 
 * Methode <code>reduce</code>.
 * 
 * @author Steffen Giersch
 */
public class ReduceBenchmarkObject {
	
	private List<String> list = new ArrayList<>();
	
	public ReduceBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void reduceBenchmark() {
		list.stream().
			reduce("", (s1, s2) -> String.join(" ", s1, s2));
	}
}
