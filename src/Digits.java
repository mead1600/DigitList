import java.util.ArrayList;
public class Digits {

    private ArrayList<Integer> digitList;

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public Digits(int nums){
        int number = nums;
        while(number > 0){
            int addition = number/10;
            if(addition > 0 && addition < 10){
                this.digitList.add(new Integer(addition));
                number = number/10;
            }
        }
    }


}
