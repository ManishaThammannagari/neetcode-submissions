class Solution {
    public boolean isPalindrome(String s) {
      String st= s.replaceAll("[^a-zA-Z0-9]", "")
                          .toLowerCase();

      String reversed=new StringBuilder(st).reverse().toString();

       return st.equals(reversed);


        
    }
}
