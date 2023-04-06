package important;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Ignore;
import org.junit.Test;
//import java.util.function.Consumer;

public abstract class questione {
	private String name;
	 public void Customer (String name) {
	 this.name = name;
	 }
	 public String getName()
	 { return name; }
	 public abstract void buy();
	}
	