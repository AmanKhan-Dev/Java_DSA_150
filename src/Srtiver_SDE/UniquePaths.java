package Srtiver_SDE;

public class UniquePaths {
    public static void main(String[] args) {

        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(3,7));
        
    }
    
public  static int uniquePaths(int m, int n) {



    int mn = n-m;
    int totalPaths =0;

     if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        long resultm = 1;
        long resultn = 1;
        long resultmn = 1;

        
        for (int i = 2; i <= n; i++) {
            resultn *= i;
        }
        for (int i = 2; i <= m; i++) {
            resultm *= i;
        }
                for (int i = 2; i <= mn; i++) {
            resultmn *= i;
        }


        int multi = (int) (resultn/resultmn);
        totalPaths = multi;
        return totalPaths;

    }

    



        
    }

