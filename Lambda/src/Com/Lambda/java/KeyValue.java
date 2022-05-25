package Com.Lambda.java;

import java.util.HashMap;

public class KeyValue {

	public static void main(String[] args) 
	{
		StringBuilder mix=new StringBuilder();
		
        HashMap<Integer,String> foo=new HashMap<>();
        
        foo.put(1," nice");
        foo.put(2," Awesome");
        foo.put(3," Beautiful");
        foo.put(4," Super");
        //this mwthod will make the key value pairs a string using string builder
        foo.entrySet().forEach(t-> mix.append(t));
        System.out.println(mix);
    }

	}


