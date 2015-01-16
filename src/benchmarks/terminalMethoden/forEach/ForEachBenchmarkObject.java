package benchmarks.terminalMethoden.forEach;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.forEach </br>
 * Verglichen wird mit der Klasse benchmarks.terminalMethoden.forEach.ForBenchmark </br></br>
 * 
 * Als Benchmark wird ein Stream aus 5-Stelligen Strings aus einer Liste vom Typ <code>ArrayList
 * </code> erzeugt. Auf diesen Stream wird dann die Methode <code>forEach</code> aufgerufen, 
 * welche jeden String mit der Methode <code>toUpperCase</code> bearbeitet.
 * 
 * @author Steffen Giersch
 */
public class ForEachBenchmarkObject {
	
	private List<String> list = new ArrayList<>();
	
	public ForEachBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void forEachBenchmark() {
		list.stream().
			forEach(s -> s.toUpperCase());
	}
}
