package benchmarks.shortCircuitMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.shortCircuitMethoden.limit.ForBenchmarkObject;
import benchmarks.shortCircuitMethoden.limit.LimitBenchmarkObject;

/**
 * Diese Klasse führt die Benchmarks für die Methode <code>limit</code> aus.
 * Die getesteten Objekte befinden sich in <code>
 * benchmarks.shortCircuitMethoden.limitt</code>.
 * 
 * @author Steffen Giersch
 */
public class BenchmarkLimit {

	public static void main(String[] args) throws Exception {
		Method[] methods = new Method[]{
				LimitBenchmarkObject.class.getMethod("limitBenchmark", new Class[0]),
				ForBenchmarkObject.class.getMethod("forBenchmark", new Class[0]),
				};

		MethodsTimer mt = new MethodsTimer(methods);
		mt.report();
	}

}
