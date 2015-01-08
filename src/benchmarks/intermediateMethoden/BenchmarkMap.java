package benchmarks.intermediateMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.intermediateMethoden.map.MapBenchmarkObject;
import benchmarks.intermediateMethoden.map.ForBenchmarkObject;

/**
 * Diese Klasse führt die Benchmarks für die Methode <code>map</code> aus.
 * Die getesteten Objekte befinden sich in <code>
 * benchmarks.intermediateMethoden.map</code>.
 * 
 * @author Steffen Giersch
 */
public class BenchmarkMap {

	public static void main(String[] args) throws Exception {
		Method[] methods = new Method[]{
				MapBenchmarkObject.class.getMethod("mapBenchmark", new Class[0]),
				ForBenchmarkObject.class.getMethod("forBenchmark", new Class[0]),
				};

		MethodsTimer mt = new MethodsTimer(methods);
		mt.report();
	}
}
