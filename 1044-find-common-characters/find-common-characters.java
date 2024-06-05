class Solution {

       public void fillCount(String word, int[] count) {
        for (char ch : word.toCharArray()) {
            count[ch - 'a']++;
        }
    }
    public List<String> commonChars(String[] words) {
        int count[]= new int[26];
        int n= words.length;
        fillCount(words[0],count);
        ArrayList<String> result= new ArrayList<>();
     
        for(int i=1;i<n;i++){
               int temp[]=new int[26];
            fillCount(words[i],temp);

            for(int j=0;j<26;j++){
              count[j]=Math.min(count[j],temp[j]);
            }
        }
               // Collect the common characters based on the count array
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    result.add(String.valueOf((char) (i + 'a')));
                }
            }
        }

        return result;
    }
}