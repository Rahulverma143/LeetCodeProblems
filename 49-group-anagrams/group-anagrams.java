class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s1=strs[i];
            char[] arr=s1.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            
            if(map.containsKey(str)){
                map.get(str).add(s1); 
            }else{
                map.put(str,new ArrayList<>());
                map.get(str).add(s1);
            }
        }
        return new ArrayList<>(map.values());
    }
}



    
//          int n = strs.length;
//         boolean[] vis = new boolean[n];   
//     List<List<String>> ans = new ArrayList<>();
//     for(int i = 0; i<n; i++){
//         String word = strs[i];
//         List<String> curr = new ArrayList<>();
//         curr.add(word);
//         if(vis[i]==true)
//         continue;
//     for(int j=j+1; j<n; j++){
//         if(vis[j] == false && check(word,strs[j]))
//         cur.add(strs[j]);
//     }
//       if(curr.size()>0)
//       ans.add(curr);
//   }