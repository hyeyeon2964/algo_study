package test;


import java.util.Stack;


public class Ntech3 {
    public static int solution(int[] histogram) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 0; i<histogram.length; i++){
            while (!stack.isEmpty() && histogram[stack.peek()]>histogram[i]){
                int height = histogram[stack.pop()];
                int width = i;
                if(!stack.isEmpty()){
                    width = i - stack.peek()-1;
                }
                answer = Math.max(answer, width * height);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int height = histogram[stack.pop()];
            int width = histogram.length;
            if(!stack.isEmpty()){
                width = histogram.length - stack.peek() -1;
            }
            answer = Math.max(answer, width*height);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] histogram = {2,2,2,3};
        System.out.println(solution(histogram));
    }

}