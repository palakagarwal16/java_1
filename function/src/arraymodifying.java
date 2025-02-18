import java.util.Arrays;

public class arraymodifying {

    public static void main(String[] args) {
        int[] arry = {2,3,4,8};
        change(arry);
        System.out.println(Arrays.toString(arry)); //arays.to is used for the purpose of extracting it as sequence 

    }
    static void change( int[] nums){
        nums[0] = 99;
    }

}
