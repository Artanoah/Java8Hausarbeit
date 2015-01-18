package benchmarks.terminalMethoden.forEach;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.forEach </br>
 * Verglichen wird mit der Klasse benchmarks.terminalMethoden.forEach.ForEachBenchmark </br>
 * </br>
 * Als Benchmark wird eine Liste aus 5-Stelligen Strings vom Typ <code>ArrayList</code> erzeugt. 
 * Die Elemente dieser Liste werden mit einer <code>for</code>-Schleife traversiert, wobei 
 * jedes Element mit der Methode <code>toUpperCase</code> bearbeitet wird.
 * 
 * @author Steffen Giersch
 */
public class ForBenchmarkObject {
	
	private List<String> list = new ArrayList<>();
	
	public ForBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void forBenchmark() {
		for(String s : list) {
			s.toUpperCase();
		}
	}
}
