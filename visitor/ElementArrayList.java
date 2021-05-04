package dessignpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList<Object> implements Element{

	@Override
	public void accept(Visitor visitor) {
		Iterator<?> iterator = iterator();
		while (iterator.hasNext()) {
			Element element = (Element) iterator.next();
			element.accept(visitor);
		}
	}

}
