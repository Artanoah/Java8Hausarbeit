package benchmarks.intermediateMethoden.sorted;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.sorted </br>
 * Verglichen wird mit der Klasse benchmarks.intermediateMethoden.sorted.ForBenchmark </br>
 * </br>
 * Als Benchmark wird jedes Element einer Liste 5-stelliger Strings zunaechst mit der Methode
 * <code>sorted</code> sortiert. Weil viele andere Tests ebenfalls <code>forEach</code> mit <code>
 * length</code> als terminal Methode verwenden wird zur besseren Vergleichbarkeit auch hier 
 * diese Methode verwendet, obwohl, weil sorted eine stateful Methode ist und nur ein Element 
 * von ihr gefordert werden müsste.
 * 
 * @author Steffen Giersch
 */
public class SortedBenchmarkObject {

	private List<String> list = new ArrayList<>();
	
	public SortedBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void sortedBenchmark() {
		list.stream().
			sorted(String::compareTo).
			forEach(s -> s.length());
	}
}
