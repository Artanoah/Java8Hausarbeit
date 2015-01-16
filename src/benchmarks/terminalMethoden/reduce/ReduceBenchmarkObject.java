package benchmarks.terminalMethoden.reduce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

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
