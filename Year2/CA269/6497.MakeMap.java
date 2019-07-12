import java.util.*;
public class MakeMap
{
    public static Map makeMap(Scanner in)
    {
    	Map newmap = new HashMap();
    	while(in.hasNext())
    	{
    		String name = in.next();
    		int mark = in.nextInt();
    		newmap.put(name, mark);
    	}
    	return newmap;
    }
}