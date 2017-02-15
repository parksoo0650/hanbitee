package util;
import java.lang.reflect.*;
import java.util.*;
public class Reflect {
    public static void main(String[] args) {
	try {
	    Class klass = Class.forName("domain.DatabaseBean"); //Class.forName의 값이 Reflect의 값이 된다. setter의 의미로 쓸수 있다.
	    Method[] arr = klass.getDeclaredMethods();
	    Set<String> set = new HashSet<String>();
	    for(Method s : arr){
		   set.add(s.getName());
		}
		System.out.println(set.toString());
	} catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }
}
