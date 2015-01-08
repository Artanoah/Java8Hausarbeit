package benchmarks.intermediateMethoden.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

/**
 * Dies ist eine Klasse zum Benchmarken der Methode java.util.stream.Stream&lt;T&gt;.filter </br>
 * Verglichen wird mit der Klasse benchmarks.intermediateMethoden.filter.FilterBenchmarkObject </br>
 * </br>
 * Als Benchmark wird jedes Element darauf geprüft, ob es mit dem Buchstaben 'a' beginnt. Wenn
 * es das tut, dann wirt die Methode <code>length</code> darauf aufgerufen
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
			if(s.startsWith("a")) {
				s.length();
			}
		}
	}
}
