package benchmarks.intermediateMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.intermediateMethoden.sorted.ForBenchmarkObject;
import benchmarks.intermediateMethoden.sorted.SortedBenchmarkObject;

/**
 * Diese Klasse f�hrt die Benchmarks f�r die Methode <code>sorted</code> aus.
 * Die getesteten Objekte befinden sich in <code>
 * benchmarks.intermediateMethoden.sorted</code>.
 * 
 * @author Steffen Giersch
 */
public class BenchmarkSorted {
	public static void main(String[] args) throws Exception {
		Method[] methods = new Method[]{
				SortedBenchmarkObject.class.getMethod("sortedBenchmark", new Class[0]),
				ForBenchmarkObject.class.getMethod("forBenchmark", new Class[0]),
				};

		MethodsTimer mt = new MethodsTimer(methods);
		mt.report();
	}
}
