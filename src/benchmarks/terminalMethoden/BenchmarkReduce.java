package benchmarks.terminalMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.terminalMethoden.reduce.ForBenchmarkObject;
import benchmarks.terminalMethoden.reduce.ReduceBenchmarkObject;

public class BenchmarkReduce {

	public static void main(String[] args) throws Exception {
		Method[] methods = new Method[]{
				ReduceBenchmarkObject.class.getMethod("reduceBenchmark", new Class[0]),
				ForBenchmarkObject.class.getMethod("forBenchmark", new Class[0]),
				};

		MethodsTimer mt = new MethodsTimer(methods);
		mt.report();
	}

}
