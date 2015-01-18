package benchmarks.terminalMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.terminalMethoden.forEach.ForBenchmarkObject;
import benchmarks.terminalMethoden.forEach.ForEachBenchmarkObject;

/**
 * Diese Klasse führt die Benchmarks für die Methode <code>forEach</code> aus.
 * Die getesteten Objekte befinden sich in <code>
 * benchmarks.terminalMethoden.forEach</code>.
 * 
 * @author Steffen Giersch
 */
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
