package main;

import java.io.IOException;
import java.util.ArrayList;

public interface LinkedListInterface {
	public MyListInterface build(int op, ArrayList<Object> val1, ArrayList<Object> val2, boolean tri) throws IOException;
}
