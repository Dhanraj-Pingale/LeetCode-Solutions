import java.util.LinkedHashMap;
import java.util.ArrayList;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

      for(int i = 0; i < arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<String> l = new ArrayList<>();
      
        for(String s : hm.keySet()){
            if(hm.get(s) == 1){
                l.add(s);
            }
        }

        
        if(l.size() < k) return "";

        return l.get(k - 1);
    }
}
