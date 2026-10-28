class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      HashMap<String,List<String>> hm=new HashMap<>();
         List<List<String>> res=new ArrayList<>();
       for (int i = 0; i < strs.length; i++) {
            String key = frequencyOfStrings(strs[i]);
            if (!hm.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hm.put(key, list);
            } else {
                hm.get(key).add(strs[i]);
            }
        }

        for(List<String> val: hm.values()){
            res.add(val);
        }
        return res;
        
    }
     public String frequencyOfStrings(String ar){
          int ch[]=new int[26];
         for(int j=0;j<ar.length();j++){
                ch[ar.charAt(j)- 'a']++;
         }

         StringBuilder sb=new StringBuilder();
      
         for(int i=0;i<ch.length;i++){
             if(ch[i]!=0){
             sb.append((char) ('a' + i));
             sb.append(ch[i]);
         }
         }
         return sb.toString();

    }

}
