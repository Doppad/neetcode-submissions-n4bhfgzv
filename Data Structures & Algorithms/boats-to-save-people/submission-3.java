class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int res = 0, l = 0, r = people.length - 1;
        Arrays.sort(people);
        while (l <= r) {
            int remain = limit - people[r--];
            res++;
            if (l <= r && remain >= people[l]) {
                l++;
            }
        }
        return res;
    }
}