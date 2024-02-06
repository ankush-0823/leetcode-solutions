class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp;
        vector<vector<string>> ans;
        
        for (const auto& str : strs) {
            string sortedStr = str;
            sort(sortedStr.begin(), sortedStr.end());
            mp[sortedStr].push_back(str);
        }
        
        for (const auto& [sortedStr, anagrams] : mp) {
            ans.push_back(anagrams);
        }
        
        return ans;
    }
};

