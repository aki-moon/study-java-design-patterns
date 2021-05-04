package dessignpattern.visitor;

import java.util.Iterator;

import dessignpattern.composite.FileTreatmentException;


public abstract class Entry implements Element{
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public Iterator<?> irerator() throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
