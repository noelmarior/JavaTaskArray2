import java.util.*;

public class taskTwo {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter Five elements: ");
        for (int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<arr.length-1; i++){
            int small=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[small]>arr[j]){
                    small=j;
                }
            }
            if (small!=i){
                int temp=arr[i];
                arr[i]=arr[small];
                arr[small]=temp;
            }
        }
        
        System.out.println("Second Lowest: "+arr[1]);
        System.out.println("Second Highest: "+arr[arr.length-2]);
    }
}