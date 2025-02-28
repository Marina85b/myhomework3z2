public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        int weight = 98;
        double height = 1.87;

        int bmi = bmiService.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi);
    }
}