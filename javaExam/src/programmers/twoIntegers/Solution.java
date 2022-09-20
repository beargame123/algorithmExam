package programmers.twoIntegers;

public class Solution {
    public long solution(long a, long b) {
        // 프로그래머스 문자열을 정수로 바꾸기 문제입니다. 번호 : 12925
        if(a==b) return a;
        long c = Math.max(a, b);
        long d = Math.min(a, b);
        int e = 0;

        for(long i = c; i>=d; i--){
            e += i;
        }
        return e;
    }
}
