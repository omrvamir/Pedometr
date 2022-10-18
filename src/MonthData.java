public class MonthData {
    private int[] stepsInDays = new int[30];

    public void addSteps(int dayNumber, int stepsInDay) {
        if (stepsInDays[dayNumber] != 0) {
            System.out.println("В данном дне количество шагов уже записано (" + stepsInDays[dayNumber]
                    + "). Количество шагов будет перезаписано");
        }

        stepsInDays[dayNumber] = stepsInDay;
    }

    public void printStatistics(int targetSteps) {
        int stepsSum = 0;
        int maxSteps = Integer.MIN_VALUE;
        int averageSteps = 0;
        int tempBestCombo = 0;
        int bestCombo = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println((i + 1) + " день: " + stepsInDays[i]);
            stepsSum += stepsInDays[i];
            if (maxSteps < stepsInDays[i])
                maxSteps = stepsInDays[i];

            if (stepsInDays[i] >= targetSteps) {
                tempBestCombo++;

                if (tempBestCombo > bestCombo)
                    bestCombo = tempBestCombo;
            } else if (stepsInDays[i] <= targetSteps)
                tempBestCombo = 0;
            averageSteps = stepsSum / 30;
        }

        System.out.println("Общее количество шагов за месяц: " + stepsSum);
        System.out.println("Максимальное пройденное количество шагов в месяце: " + maxSteps);
        System.out.println("Среднее количество шагов: " + averageSteps);
        System.out.println("Пройденная дистанция: " + Converter.stepsToKm(stepsSum) + " км");
        System.out.println("Количество сожжённых килокалорий: " + Converter.stepsToCalories(stepsSum));
        System.out.println("Лучшая серия (серия шагов больше целевого значения): " + bestCombo);
    }
}
