package DataStructures.IMP_Questions;
import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		

	}

}
class Solution
{
	public List<List<String>> groupAnagrams(String[] strs)
	{
		Map<String, List<String>> map = new HashMap<>();
		
		for(String s: strs)
		{
			// start sorting array of string
			char charArr[] = s.toCharArray();
			Arrays.sort(charArr);
			String sorted = new String(charArr);
			// sorting done
			
			if(!map.containsKey(sorted))
			{
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(s);
		}
		return new LinkedList<>(map.values());
		
	}
}
