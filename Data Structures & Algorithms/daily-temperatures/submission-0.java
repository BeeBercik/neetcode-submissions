class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int currTemp = temperatures[i];
            boolean found = false;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > currTemp) {
                    days[i] = j - i;
                    found = true;
                    break;
                }
            }
            if (!found) {
                days[i] = 0;
            }
        }
        return days;
    }
}
