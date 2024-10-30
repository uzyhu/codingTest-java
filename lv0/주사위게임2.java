class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int abNum = a == b ? 1 : 0;
        int bcNum = b == c ? 1 : 0;
        int acNum = a == c ? 1 : 0;
        
        int total = abNum + bcNum + acNum;
        
        if(total == 0) {
            answer = a + b + c;
        }
        else if(0 < total && total < 3) {
            answer = (a + b + c) * (a*a + b*b + c*c);
        }
        else {
            answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        return answer;
    }
}