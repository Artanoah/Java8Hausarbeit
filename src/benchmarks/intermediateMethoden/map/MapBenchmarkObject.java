package benchmarks.intermediateMethoden.map;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.map </br>
 * Verglichen wird mit der Klasse benchmarks.intermediateMethoden.map.ForBenchmark </br></br>
 * 
 * Als Benchmark wird jedes Element einer Liste 5-stelliger Strings zunaechst mit der Methode
 * String.toUpperCase bearbeitet. Damit der Body von <code>map</code> trotz lazy-evaluation
 * aufgerufen wird, wird danach mit <code>forEach</code> auf jedes Element die Methode <code>
 * length</code> aufgerufen.
 * 
 * @author Steffen Giersch
 */
public class MapBenchmarkObject {
	
	private List<String> list = new ArrayList<>();
	
	public MapBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void mapBenchmark() {
		list.stream().
			map(s -> s.toUpperCase()).
			forEach(s -> s.length());
	}
}