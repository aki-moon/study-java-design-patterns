package dessignpattern.interpreter;

public interface ExecutorFactory {
	public abstract Executor createExecutor(String name);
}
