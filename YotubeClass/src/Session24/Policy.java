package Session24;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Policy {
	Map<Integer, String> policy = new TreeMap<Integer, String>();
	
	public void addPolicyDetail(int pid, String pname){
		policy.put(pid, pname);
	}

	public Map<Integer, String> ViewAllPolicy(){
		return policy;
	}
	
	public List<Integer> serchBasedOnPolicyType(String search){
		List<Integer> pids=new ArrayList<Integer>();
		for(Map.Entry<Integer, String> obj: policy.entrySet()) {
			int key = obj.getKey();
			String value= obj.getValue();
			if(value.contains(search)) {
				pids.add(key);
			}
		}
		return pids;
	}
	
}
