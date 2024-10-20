public class PrinterApp {
    public static void main(String[] args) {
      
        String creator = "Durga Bahadur Basnet"; 
        int number1 = 5; 
        int number2 = 3; 
        int multiplication; 
        int addition;
        int subtraction; 
        double division; 
        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);
        // System.out.println(number1); 
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);
        multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        addition = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + addition);
        subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        division = (double) number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + division);
    }
}
