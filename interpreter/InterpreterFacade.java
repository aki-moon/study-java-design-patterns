package dessignpattern.interpreter;

public class InterpreterFacade implements Executor{
	private ExecutorFactory factory;
	private Context context;
	private Node programNode;

	public InterpreterFacade(ExecutorFactory factory) {
		super();
		this.factory = factory;
	}

	public boolean parse(String text) {
		boolean ok = true;
		this.context = new Context(text);
		this.context.setExecutorFactory(factory);
		this.programNode = new ProgramNode();
		try {
			programNode.parse(context);
			System.out.println(programNode.toString());
		} catch (ParseException e) {
			e.printStackTrace();
			ok = false;
		}
		return ok;

	}

	public void execute() throws ExecuteException {
		programNode.execute();
	}

}
