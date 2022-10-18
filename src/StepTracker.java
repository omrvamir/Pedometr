import java.util.HashMap;

public class StepTracker {
    private int targetSteps;

    HashMap<Integer, MonthData> monthToData = new HashMap<>();

    public StepTracker() {
        targetSteps = 10000;

        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    public int getTargetSteps() {
        return targetSteps;
    }

    public void setTargetSteps(int targetSteps) {
        System.out.println("Вы поменяли количество целевых шагов с " + this.targetSteps + " на: " + targetSteps);
        this.targetSteps = targetSteps;
    }

    public void addStepsInDay(int monthNumber, int dayNumber, int stepsInDay) {
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Вы ввели неверный номер месяца (1 - 12).");
            return;
        } else if (dayNumber > 30 || dayNumber < 1) {
            System.out.println("Вы ввели неверный номер дня (1 - 30).");
            return;
        }

        monthToData.get(monthNumber - 1).addSteps(dayNumber - 1, stepsInDay);
    }

    public void statisticsForMonth(int monthNumber) {
        monthToData.get(monthNumber - 1).printStatistics(targetSteps);
    }
}
