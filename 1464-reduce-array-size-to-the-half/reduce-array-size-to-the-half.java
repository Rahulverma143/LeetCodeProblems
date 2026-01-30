class Solution {
    public int minSetSize(int[] arr) {

        Map<Integer, Integer> freqMap = new HashMap<>();
         for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> freqList = new ArrayList<>(freqMap.values());

        Collections.sort(freqList, Collections.reverseOrder());

        int removed = 0;
        int count = 0;
        int half = arr.length/2;

        for( int freq: freqList){
            removed+=freq;
            count++;
            if(removed>=half){
                break;
            }
        }
        return count;
    }
}