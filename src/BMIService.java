public class BMIService {
    public int calculate (float height, float weight){
        float bodyMassIndex;
        bodyMassIndex = weight / (height * height);
        return (int) bodyMassIndex;
    }
}
