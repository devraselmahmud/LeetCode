import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<String>();
        for(int i=1; i<n+1; i++){
            //Devides by 3 & 5, add FizzBuzz
            if(i%3==0 && i%5==0){
                array.add("FizzBuzz");
            }
            //Devides by 3, add Fizz
            else if(i%3==0){
                array.add("Fizz");
            }
            //Devides by 5, add Buzz
            else if(i%5==0){
                array.add("Buzz");
            }
            else{
                array.add(Integer.toString(i));
            }
        }
        return array;
    }

}
