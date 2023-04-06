public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 98; // вес в килограммах
        double heightMan = 1.87; // рост в метрах
        int index = service.calculate(bodyWeight, heightMan); // ИМЧ в целых числах
        System.out.println(index);
    }
}