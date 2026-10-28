class Solution {
    public boolean isAnagram(String s, String t) {
       
        HashMap<Character, Integer> hs=new HashMap<>();
        HashMap<Character,Integer> ht=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){

        if(!hs.containsKey(s.charAt(i))){
            hs.put(s.charAt(i),1);
        }else{
            hs.put(s.charAt(i),hs.get(s.charAt(i))+1);
        }
        if(!ht.containsKey(t.charAt(i))){
            ht.put(t.charAt(i),1);
        }else{
            ht.put(t.charAt(i),ht.get(t.charAt(i))+1);
        }
        }

        if(hs.equals(ht)){
            return true;
        }

     return false;

    }
}
