package Array_Programs;
public class Max_Element {
    public static void main(String[] args) {
        int []a = {30,20,10,70,40,70,80,45,26,90};
        int temp = a[0];
        for(int i = 1; i < a.length; i++){
            if (temp < a[i]){
                temp = a[i];
            }
        }
        System.out.println("Maximum Element of this Array is : "+temp);
    }
}
