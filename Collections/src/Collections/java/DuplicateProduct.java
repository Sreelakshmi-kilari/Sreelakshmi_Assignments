package Collections.java;

import java.util.HashSet;

public class DuplicateProduct {

	public static void main(String[] args) {
		   
		product x1=new product("TVS");
        product x2=new product("hp");
        product x3=new product("Levis");
        product x4=new product("rock");
        
        HashSet<product> no_duplicate=new HashSet<product>();
        
        no_duplicate.add(x1);
        no_duplicate.add(x2);
        no_duplicate.add(x3);
        no_duplicate.add(x4);
        //the duplicate object addition
        no_duplicate.add(x2);
       
        System.out.println(no_duplicate);
    }
}
class product{
    private String p_name;
    public product(String p_name){
        this.p_name=p_name;
    }
    
}


