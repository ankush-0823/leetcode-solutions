class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
   HashMap<String,List<String>> h=new HashMap<>();
        int n=strs.length;
    for(int i=0;i<n;i++){
    String s=strs[i];
    char[] c=s.toCharArray();
        Arrays.sort(c);
       String temp = new String(c);
     if(h.containsKey(temp)){
    List<String> list=h.get(temp);
       list.add(s);  
    h.put(temp,list);
     }   
     else{
      List<String> list=new ArrayList<>();
       list.add(s);
         h.put(temp,list);
        }
    }
    List<List<String>> ans=new ArrayList<>();
        ans.addAll(h.values());
        return ans;
      }     
    }