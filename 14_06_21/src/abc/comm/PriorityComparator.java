package abc.comm;

import java.util.Comparator;


@SuppressWarnings("rawtypes")
public class PriorityComparator implements Compatator {
	
	@Override
	public int compare(Object o1, Object o2) {
		// return ((Todo)o1).getPriority().compareTo(((Todo)o2).getPriority());

		if (((Todo) o1).getPriority() == ((Todo) o2).getPriority()) {
			return 0;
		}
		if (((Todo) o1).getPriority() < ((Todo) o2).getPriority()) {
			return 1;
		}
		else
			return -1;
	}

}
