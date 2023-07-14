import java.util.*;
class Solution
{
    public void calulateSum(int[] array,int n) {
        int p=array[0];
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            array[i]=p+array[i];
            p=array[i];
        }
    }
    public int calulateEqIndex(int[] array,int n) {

        for(int i=1;i<n;i++)
        {
            if(array[i-1]==(array[n-1]-array[i]))
            {
                return i;
            }
        }
        return -1;
    }
}
public class EquilibriumIndex
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        Solution solution= new Solution();
        solution.calulateSum(array,n);
        System.out.println(solution.calulateEqIndex(array,n));


    }
}
