// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {
    double weightInPounds;
    double heightInInches;
    double weightInKilos;
    double heightInMeters;

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters

    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        this.weightInPounds = 150;
        this.heightInInches = 65;
        this.weightInKilos = 90;
        this.heightInMeters = 1.75;
    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public double calculateBmiImperial(double weight , double height) {
        double bmiImperial = (weight * 703)/ (height * height);
        return bmiImperial;
    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public double calculateBmiMetric(double weight , double height) {
        double bmiMetric = weight / (height * height);
        return bmiMetric;
    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {
        if (bmi >= 0 && bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        }
        else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
}
