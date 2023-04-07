public class BmiService{
    int calculate(double weight, double height) {
        double index = weight / (height * height);
        return (int)index;
    }
}



