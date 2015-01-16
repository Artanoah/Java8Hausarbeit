package benchmarks.terminalMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.terminalMethoden.forEach.ForBenchmarkObject;
import benchmarks.terminalMethoden.forEach.ForEachBenchmarkObject;

public class BenchmarkForEach {

	public static void main(String[] args) throws Exception {
		Method[] methods = new Method[]{
				ForEachBenchmarkObject.class.getMethod("forEachBenchmark", new Class[0]),
				ForBenchmarkObject.class.getMethod("forBenchmark", new Class[0]),
				};

		MethodsTimer mt = new MethodsTimer(methods);
		mt.report();
	}

}
