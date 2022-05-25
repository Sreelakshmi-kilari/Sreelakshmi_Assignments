package Com.Lambda.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;


public class Remove {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String> (
			Arrays.asList("Nandu", "Mahi", "Manu", "sai", "sree", "Aishu"));
		 
		Predicate<String> filter = str -> (str.length() == 3);
		
		System.out.println("Original ArrayList: " +arrayList);
		boolean value = arrayList.removeIf(filter);
		System.out.println("Returned value: " +value);
		System.out.println("ArrayList after removeIf(): " +arrayList);
		}

	}


