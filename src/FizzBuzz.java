import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        // Brute Force Approach
        //List<String> result = new ArrayList<>();
        // for(int i=1; i<=n; i++){
        //     String current = "";
        //     if(i%3 == 0){
        //         current += "Fizz";
        //     }
        //     if(i%5 == 0){
        //         current += "Buzz";
        //     }
        //     if(current.isEmpty()){
        //         current = Integer.toString(i);
        //     }
        //     result.add(current);
        // }
        // return result;

        //Optimal Approach
        List<String> result = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%15 == 0){
                result.add("FizzBuzz");
            }else if(i%3 == 0){
                result.add("Fizz");
            }else if(i%5 == 0){
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
