package Collection;
import java.util.*;
import java.util.Map.Entry;


public class MapsMethod {
public static void main(String[] args) {
	HashMap<Integer ,String> hm= new HashMap<>();
	hm.put(1,"c#");
	hm.put(2, "sql");
	hm.put(3, "rust");
	hm.put(4,"go lang");
	hm.put(5, "python");
	hm.put(6, "java");
	
	System.out.println(hm);
	System.out.println("hm.remove"+ hm.remove(5)); 
	System.out.println("get()"+hm.get(1));
	System.out.println("containskey()"+hm.containsKey(4));
	System.out.println("containsvalue()" + hm.containsValue("rust"));
	System.out.println("size()"+hm.size());
	System.out.println("getorDefault()"+hm.getOrDefault(4, "GO LANG"));
	System.out.println("isEmpty()"+hm.isEmpty());
	Set<Integer> keys=hm.keySet();
	System.out.println(keys);
	
	Collection<String> values= hm.values();
	System.out.println(values);
	for(Entry<Integer, String> e : hm.entrySet()) {
		System.out.println(e.getKey()+" : "+e.getValue());
	}
	System.out.println(hm.replace(4, "mysql"));
	System.out.println(hm);
	System.out.println(hm.remove(1,"go lang"));
	System.out.println(hm);
	
	Iterator<Entry<Integer,String>> itr=hm.entrySet().iterator();
	
	while(itr.hasNext()) {
		Entry<Integer,String> e=itr.next();
		System.out.println(e.getKey()+": "+e.getValue());
	}
	
	
	
	
	
	
}
}
