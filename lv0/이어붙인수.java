class Solution {
    public int solution(int[] num_list) {
        String isOdd = "";
        String isNotOdd = "";

        for (int i : num_list) {
            if(i%2 == 0) {
                isNotOdd += i;
            }
            else {
                isOdd += i;
            }
        }

        int answer = Integer.parseInt(isNotOdd) + Integer.parseInt(isOdd);
        return answer;
    }
}