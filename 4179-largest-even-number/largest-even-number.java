class Solution {
    public String largestEven(String s) {
        
        for(int i =s.length()-1;i>=0 ;i--){
            if(s.charAt(i)=='2'){
                return s;
            }
            else{
             s= s.substring(0,i);
            }
        }
        return "";
    }
}