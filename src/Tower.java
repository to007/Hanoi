
public class Tower {
    private int min = 0;
    private int n;
    public int[] A = new int [n];
    public int[] B = new int [n];
    public int[] C = new int [n];
    for(int i = 0; i > n; i++){
        A[i] = i + 1;
    }
    public Tower(int x){
        n = x;
        min = (int)Math.pow((double)x, (double)2) - 1;
    }
}
