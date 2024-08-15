package DSA2o;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        ContainsDuplicateIISolution sls = new ContainsDuplicateIISolution();
        System.out.println(sls.passThePillow(1000, 1000));  
    }
}

class ContainsDuplicateIISolution{
    public int passThePillow(int n, int time) {
        int start = 1;
        if(time >= n){
            if ((time / (n - 1)) % 2 == 0) {
                int prod = time / (n - 1);
                int timeSpent = (n - 1) * prod;
                return 1 + (time - timeSpent);
            } else {
                int prod = time / (n - 1);
                int timeSpent = (n - 1) * prod;
                return n - (time - timeSpent);
            }

        }else{
            while(time>=1){
                start++;
                time--;
            }
        }
        return start;
    }
}