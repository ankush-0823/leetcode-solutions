class Solution {
    public int countStudents(int[] stud, int[] sand) {
        int n = stud.length;
        int[] arr = new int[2];
        //arr[0] = count of student who like circular
        //arr[1] = count of student who like square
          
        for(int x : stud)
            arr[x]++;
        
        for(int i = 0; i < n; i++) {
            if(arr[sand[i]] == 0) return n - i;
            arr[sand[i]]--;
        }
        
        return 0;
    }
}