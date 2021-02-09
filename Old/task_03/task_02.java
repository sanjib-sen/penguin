import java.util.*;
/**
 * Sanjib Kumar Sen
 */
public class task_02 {
    public static void main(String[] args) {
        Scanner penguin = new Scanner(System.in);
        int n = penguin.nextInt();
        float [] weight = new float[n];
        for (int i = 0; i <n; i++) {
            float w = penguin.nextFloat();
            weight[i] = w;
        }
        System.out.println(efficientJanitor(weight));
    }

    private static int efficientJanitor(float [] weight) {
        int count=0, temp=0;
        for(int i =0;i<weight.length;i++){
            if(weight[i]>=1.991) count++;
            else temp++;
        }
        if(temp%2!=0) count++;
        count+=temp/2;
        return count;
    }
}