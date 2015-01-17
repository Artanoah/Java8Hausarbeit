package benchmarks.intermediateMethoden.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.filter </br>
 * Verglichen wird mit der Klasse benchmarks.intermediateMethoden.filter.ForBenchmark </br>
 * </br>
 * Als Benchmark wird jedes Element einer Liste 5-stelliger Strings zunaechst mit der Methode
 * <code>filter</code> darauf geprueft, ob es mit dem Buchstaben 'a' beginnt. Damit der Body 
 * von <code>filter</code> trotz lazy-evaluation aufgerufen wird, wird danach mit <code>forEach
 * </code> auf jedes übrig gebliebene Element die Methode <code>length</code> aufgerufen.
 * 
 * @author Steffen Giersch
 */
public class FilterBenchmarkObject {

	private List<String> list = new ArrayList<>();
	
	public FilterBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void filterBenchmark() {
		list.stream().
			filter(s -> s.startsWith("a")).
			forEach(s -> s.length());
	}
}
