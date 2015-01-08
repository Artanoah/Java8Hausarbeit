package benchmarks.intermediateMethoden.sorted;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.sorted </br>
 * Verglichen wird mit der Klasse benchmarks.intermediateMethoden.sorted.SortedBenchmarkObject </br></br>
 * 
 * Als Benchmark wird jedes Element einer Liste 5-stelliger Strings zunaechst mit der Methode
 * <code>Collections.sort</code> sortiert und dann mit der Methode <code>length<code> verarbeitet.
 * 
 * @author Steffen Giersch
 */
public class ForBenchmarkObject {
	
	private List<String> list = new ArrayList<>();
	
	public ForBenchmarkObject(int size) throws IOException {
		list = InputDataReader.readFileLines(Constants.SGBWORDS, size);
	}
	
	public void forBenchmark() {
		Collections.sort(list, String::compareTo);
		for(String s : list) {
			s.toUpperCase().length();
		}
	}
}
