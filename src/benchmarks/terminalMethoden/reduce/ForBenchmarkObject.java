package benchmarks.terminalMethoden.reduce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import benchmarkTool.io_manager.InputDataReader;
import benchmarks.Constants;

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
