package benchmarks.terminalMethoden;

import java.lang.reflect.Method;

import benchmarkTool.measure.MethodsTimer;
import benchmarks.terminalMethoden.reduce.ForBenchmarkObject;
import benchmarks.terminalMethoden.reduce.ReduceBenchmarkObject;

/**
 * Diese Klasse f�hrt die Benchmarks f�r die Methode <code>reduce</code> aus.
 * Die getesteten Objekte befinden sich in <code>
 * benchmarks.terminalMethoden.reduce</code>.
 * 
 * @author Steffen Giersch
 */
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
