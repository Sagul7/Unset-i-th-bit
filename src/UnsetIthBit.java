import java.util.Scanner;
/*
Apporach
1.check set bit (to check ith bit is set or not)
2.xor if same number(A,B) is set
 */
public class UnsetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(unSet(A,B));
    }
    public static int unSet(int A,int B)
    {
        if(checkBit(A,B))
        {
            return A^(1<<B);
        }
        return A;
    }
    public static Boolean checkBit(int A,int B)
    {
        if((A & (1<<B))!=0)
            return true;
        return false;
    }
}
/*
 You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.
A = 4
B = 1
Output
4

Input
A = 5
B = 2

Output
1
 */