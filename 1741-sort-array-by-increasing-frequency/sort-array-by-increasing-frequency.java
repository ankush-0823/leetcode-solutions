class Solution {
    public int[] frequencySort(int[] nums) {
        int c=0;
         HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
             List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        Collections.sort(numList, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA == freqB) {
                return b - a; // Sort by value in descending order if frequencies are the same
            }
            return freqA - freqB; // Sort by frequency in ascending order
        });

        // Step 4: Convert the sorted list back to an array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }

        return nums;
    }
    }