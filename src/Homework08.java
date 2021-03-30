import java.util.*;

public class Homework08 {
	public static void main(String[] args) {
	
		List<String> new_list = new ArrayList<String>();
		String sep = "a";
		new_list.add("b");
		new_list.add("d");
		new_list.add("f");
		
		System.out.println(interpose(sep, new_list));
	}
	
	public static List<String> interpose(String sep, List<String> l){
		
		if(l.size() == 1) 
			return l;
		
		else{
			List<String> interposed = new ArrayList<String>();
			
			for(int i = 0; i < l.size(); i++) {
				interposed.add(l.get(i));
				interposed.add(sep);
			}
			int last_index_interposed = interposed.size()-1;
			if(interposed.get(last_index_interposed).equals(sep)) {
				interposed.remove(last_index_interposed);
			}
			return interposed;
		}
	}
}