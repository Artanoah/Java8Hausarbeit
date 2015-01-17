package benchmarks.shortCircuitMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.shortCircuitMethoden.findFirst.FindFirstBenchmarkObject;
import benchmarks.shortCircuitMethoden.findFirst.ForBenchmarkObject;

/**
 * Diese Klasse führt die Benchmarks für die Methode <code>findFirst</code> aus.
 * Die getesteten Objekte befinden sich in <code>
 * benchmarks.shortCircuitMethoden.findFirst</code>.
 * 
 * @author Steffen Giersch
 */
public class BenchmarkFindFirst {

	public static void main(String[] args) throws Exception {
		Method[] methods = new Method[]{
				FindFirstBenchmarkObject.class.getMethod("findFirstBenchmark", new Class[0]),
				ForBenchmarkObject.class.getMethod("forBenchmark", new Class[0]),
				};

		MethodsTimer mt = new MethodsTimer(methods);
		mt.report();
	}
}
