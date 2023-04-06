public class BmiService{
    double index;
    int calculate(double weight, double height) {
        index = weight / (height * height);
        return (int)index;
    }
}



