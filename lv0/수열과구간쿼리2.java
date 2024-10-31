class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i=0; i<queries.length; i++) {
            int min=1000000; //Integer.MAX_VALUE;
             for(int k=queries[i][0]; k<=queries[i][1]; k++) {                
                 if(arr[k]>queries[i][2] && min>arr[k]) {
                     min = arr[k];
                 }
             }
            if(min==1000000) {
                min=-1;
            }
            answer[i] = min;
        }

        return answer;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {

//         int[] answer = new int[queries.length];
//         Arrays.fill(answer, -1);

//         for (int idx = 0; idx < queries.length; idx++) {
//             int[] query = queries[idx];
//             int s = query[0], e = query[1], k = query[2];

//             for (int i = s; i <= e; i++) {
//                 if (k < arr[i]) {
//                     answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
//                 }
//             }

//         }

//         return answer;
//     }
// }
