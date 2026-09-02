import java.util.ArrayList;
public class EvenNumbers {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numbers.add(i);
        }
        System.out.println("Even numbers: ");
        for(Integer num: numbers){
            if(num%2 == 0){
                System.out.println(num);
            }
        }

    }
    
}
