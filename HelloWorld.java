public class HelloWorld{


    public static void main(String[] args){
        // int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        // System.out.println(max(numbers));
        // System.out.println(forMax(numbers));
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }


    public static void drawTriangle(int n){
        int row = 1;
        while(row <= n){
            int col = 1;
            while(col <= row){
                System.out.print('*');
                col = col + 1;
            }
            row = row + 1;
            System.out.println();
        }
    }


    public static int max(int[] m){
        int len = m.length;
        int ind = 1;
        int maxnum = m[0];
        while(ind < len){
            if(maxnum < m[ind]){
                maxnum = m[ind];
            }
            ind = ind + 1;
        }
        return maxnum;
    }


    public static int forMax(int[] m){
        int maxnum = m[0];
        for(int ind = 0; ind < m.length; ind += 1){
            if(maxnum < m[ind]){
                maxnum = m[ind];
            }
        }
        return maxnum;
    }


    public static void windowPosSum(int[] a, int n) {
        for(int i = 0; i < a.length; i += 1){
            if(a[i] < 0){
                continue;
            }
            for(int j = i; j < i + n; j += 1){
                if(j == a.length - 1){
                    break;
                }
                a[i] = a[i] + a[j+1];
            }
        }
    }

}
