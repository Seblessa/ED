import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i=0;i<n;i++){
            BTree<Integer> tree = LibBTree.readIntTree(in);
            System.out.println(ED213.maxSum(tree));
        }
    }
}