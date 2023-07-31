package Array_Programs;
public class Array_divisible_by_3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,15,30,35,20};

        for(int i = 0; i < a.length; i++){
            if(a[i] % 3 ==0 && a[i] % 5 ==0){
                System.out.println("Divisible by 3 and 5 is :"+a[i]);
            }
        }
    }
}
