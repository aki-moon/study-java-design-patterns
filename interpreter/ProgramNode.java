package interpreter;

public class ProgramNode extends Node {
	private Node commandListNode;

	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("program");
	}

	@Override
	public String toString() {
		return "[program" + commandListNode + "]";
	}

}
