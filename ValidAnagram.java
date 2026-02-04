//Using one hashmap

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character,Integer> freqMap = new HashMap<>();

        for(char c: s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        };

        for(char c: t.toCharArray()){
            if(!freqMap.containsKey(c)){
                return false;
            }

            freqMap.put(c, freqMap.get(c)-1);
            if(freqMap.get(c) < 0){
                return false;
            }
        }
        return true;
    }
}

//Using 2 hashmap
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c: s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0) + 1);
        }

        for(char c: t.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        int sum1 = 0;
        for(char c: map1.keySet()){
            sum1 = sum1 + map1.get(c);
        }

        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}
