import java.util.Arrays;
import java.util.Random;

public class CheckTime {
    public void selectionSort(){
        int[] arr = new int[100000];
        Random random = new Random(10);
        int x;
        for (int i = 0; i < arr.length ; i++) {
            x = random.nextInt(10);
            arr[i] =x;
        }
        int max = arr[0];
        for (int j = 1; j <arr.length ; j++) {
            if(max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("gia tri max"+max);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
       // stopWatch.getStartTime();
        System.out.println(stopWatch.getStartTime());
        CheckTime checkTime =new CheckTime();
        checkTime.selectionSort();
       // stopWatch.getEndTime();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
