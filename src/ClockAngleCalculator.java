import java.util.HashMap;

/**
 * This problem was asked by Microsoft.
 * Given a clock time in hh:mm format, determine, to the nearest degree, the angle between the hour and the minute hands.
 * Bonus: When, during the course of a day, will the angle be zero?
 */
class AngleCalculator
{
    public  double calculateAngle(String time)
    {
        String[] timeSplit = time.split(":");
        double angle = 0.0;
        int baseHourOnClock = Integer.parseInt(timeSplit[0]);

        int minOnClock = Integer.parseInt(timeSplit[1]) / 5;
        while (minOnClock != baseHourOnClock)
        {
            System.out.println("Current minOnClock in hours:"+minOnClock);
            baseHourOnClock = this.incrementHourCount(baseHourOnClock);
            angle+=30;
        }
        return  angle;
    }
    public HashMap<String, Double> getTestCase()
    {
        HashMap<String,Double> testCaseMap = new HashMap<>();
        testCaseMap.put("05:30",30.0);
        testCaseMap.put("05:15",300.0);
        return testCaseMap;
    }

    /**
     *
     * @param currenthour
     * @return
     */
    int incrementHourCount(int currenthour)
    {
        return  currenthour+1 > 11 ? 0 : currenthour+1;
    }
}
public class ClockAngleCalculator {
    public static void main(String[] args) {
        AngleCalculator calculator = new AngleCalculator();
        System.out.println("Angle on clock when hour is :"+calculator.calculateAngle("05:15"));

    }
}
