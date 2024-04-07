class Solution {
    
    public boolean checkValidString(String s) {
      int cmin = 0, cmax = 0; // open parentheses count in range [cmin, cmax]
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cmax++;
                cmin++;
            } else if (c == ')') {
                cmax--;
                cmin--;
            } else if (c == '*') {
                cmax++; 
                cmin--; 
             
            }
            if (cmax < 0) return false;
                                        
            cmin = Math.max(cmin, 0);   
        }
        return cmin == 0; // Return true if can found `openCount == 0` in range [cmin, cmax]
    }
    }
