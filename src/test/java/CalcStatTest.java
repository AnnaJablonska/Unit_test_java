import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class CalcStatTest {

    private CalcStat calcStats = new CalcStat();

    @Test
    public void get_Minimum_Value_From_List() {
        assertThat(calcStats.minimumValue(new Integer[]{6, 9, 15, -2, 92, 11})).isEqualTo(-2);
        assertThat(calcStats.minimumValue(new Integer[]{3, 20, 1, 0, 7, 19})).isEqualTo(0);
    }

    @Test
    public void get_Maximum_Value_From_List() {
        assertThat(calcStats.maximumValue(new Integer[]{6, 9, 15, -2, 92, 11})).isEqualTo(92);
        assertThat(calcStats.maximumValue(new Integer[]{3, 20, 12, -20, 7, 19})).isEqualTo(20);
    }

    @Test
    public void get_Number_Of_Elements_In_List() {
        assertThat(calcStats.numberOfElements(new Integer[]{6, 9, 15, -2, 92, 11})).isEqualTo(6);
        assertThat(calcStats.numberOfElements(new Integer[]{1, -5, 15, 14})).isEqualTo(4);
    }

    @Test
    public void get_Average_Value_Of_Integers_List() {
        assertThat(calcStats.averageValue(new Integer[]{6, 9, 15, -2, 92, 11})).isEqualTo(21);
        assertThat(calcStats.averageValue(new Integer[]{6, 15, 1, 0, 0})).isEqualTo(4);
    }
}
