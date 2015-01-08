package benchmarks.intermediateMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.intermediateMethoden.filter.FilterBenchmarkObject;
import benchmarks.intermediateMethoden.filter.ForBenchmarkObject;

/**
 * Diese Klasse führt die Benchmarks für die Methode <code>filter</code> aus.
 * Die getesteten Objekte befinden sich in <code>
 * benchmarks.intermediateMethoden.filter</code>.
 * 
 * @author Steffen Giersch
 */
public class BenchmarkFilter {

	public static void main(String[] args) throws Exception {
		Method[] methods = new Method[]{
				FilterBenchmarkObject.class.getMethod("filterBenchmark", new Class[0]),
				ForBenchmarkObject.class.getMethod("forBenchmark", new Class[0]),
				};

		MethodsTimer mt = new MethodsTimer(methods);
		mt.report();
	}
}
