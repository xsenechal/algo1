package week1;

import stdlib.StdIn;

/**
 * User: xs86768
 * Date: 04/09/13 - 13:21
 */
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(N);
        System.out.println(N);
        System.out.println(uf);
    }
}
