package DSA2o;

public class sqroot {
    public static void main(String[] args) {
        sqrootSolution sqs = new sqrootSolution();
        System.out.println(sqs.judgeSquareSum(2147483600));
    }
}

class sqrootSolution{
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end =(long) Math.sqrt(c);
        while(start<=end){
            long square = start*start + end*end;
            if(c == square) return true;
            else if(square>c){
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
}