package dessignpattern.state;

public interface Context {

	public abstract void setClock(int hour);

	public abstract void changeState(State state);

	public abstract void recordLog(String message);

	public abstract void callSecurityCenter(String message);

}
