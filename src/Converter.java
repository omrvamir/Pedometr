public class Converter {
    public static double stepsToKm(int steps) {
        return (((double) steps * 75) / 100000);
    }

    public static int stepsToCalories(int steps) {
        return ((steps * 50) / 1000);
    }
}
