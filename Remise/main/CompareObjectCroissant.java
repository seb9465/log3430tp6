package main;

import java.util.Comparator;

public class CompareObjectCroissant implements Comparator<Object> {
	@Override
	public int compare(Object a, Object b) {
		if (a.hashCode() == b.hashCode())
			return 0;
		return a.hashCode() < b.hashCode() ? -1 : 1;
	}
}
