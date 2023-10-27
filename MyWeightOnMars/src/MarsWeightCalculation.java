public class MarsWeightCalculation {
    public static void main(String[] args) {

        float earthWeightValentyn;
        float marsWeightValentyn;
        double marsWeightValentynDouble;
        int marsWeightValentynInt;

        earthWeightValentyn = 54;
        marsWeightValentyn = (earthWeightValentyn * 0.38F);
        System.out.println(earthWeightValentyn + " kg on Earth is " + marsWeightValentyn + " kg on Mars");

        marsWeightValentynDouble = marsWeightValentyn;
        System.out.println("Kg on Mars after converting to double is " + marsWeightValentynDouble);

        marsWeightValentynInt = (int) marsWeightValentynDouble;
        System.out.println("Kg on Mars after converting to int is " + marsWeightValentynInt);

        char marsWeightValentynChar;

        marsWeightValentynChar = (char) marsWeightValentynInt;
        marsWeightValentynCharMathOperation = marsWeightValentynChar * 2;
        System.out.println(marsWeightValentynCharMathOperation);

        marsWeightValentynCharMathOperationToInt = (int) marsWeightValentynCharMathOperation;
    }
}
