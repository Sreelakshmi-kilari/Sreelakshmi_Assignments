package Com.Lambda.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Consumer {

	public static void main(String[] args) {
		List<String> join = new ArrayList<>();
        join.add("Sree");
        join.add("Mahi");
        join.add("Ayusha");
        join.add("Ramya");
        join.add("Nandini");
        join.add("Asiya");
        join.add("Manasa");
        join.replaceAll(new change());
        join.stream().collect(Collectors.toList()).forEach(System.out::println);

    }
}
class change implements UnaryOperator<String>{
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }


	}


