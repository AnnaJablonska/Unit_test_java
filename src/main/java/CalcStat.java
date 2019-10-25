import java.util.Arrays;
import java.util.Collections;

public class CalcStat {


    public Integer minimumValue(Integer[] number) {

        return Collections.min(Arrays.asList(number));
    }

    public Integer maximumValue(Integer[] number) {
        return Collections.max(Arrays.asList(number));
    }

    public Integer numberOfElements(Integer[] number) {

        return number.length;
    }

    public double averageValue(Integer[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        return sum / number.length;
    }
}