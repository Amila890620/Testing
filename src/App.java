public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Printer app");
       System.out.println("This app is made by");
       String creator = "Amila Tharangani";
        String Y = "This app is made by:";
       System.out.println( Y + creator);

       int number1 = 70;
       int number2 = 20;
       int number3 = 80;
       int number4=100;

       System.out.println(number1); // Printed number1 , 7th question
       System.out.println(number2);
       System.out.println(number3);
       System.out.println(number4);

       String W = "The value of number1 is :"; 
       System.out.println( W + number1);
       String Z = "The value of number2 is :";
       System.out.println( Z+ number2);

       int multiplication = (number1 * number2);
       System.out.println(number1  + "*" + number2 + "=" + multiplication);

       
       int adding = (number1 + number2);
       System.out.println(number1  + "+" + number2 + "=" + adding);

       int Substraction = (number1 - number2);
       System.out.println(number1  + "-" + number2 + "=" + Substraction);

       double division = (number1 / number2);
       System.out.println(number1  + "/" + number2 + "=" + division);

       int add = (number2 + number3);
       System.out.println(number2  + "+" + number3 + "=" + add);

       int multi = (number2 * number3);
       System.out.println(number2  + "*" + number3 + "=" + multi);

       int subst = (number2 - number3);
       System.out.println(number2  + "-" + number3 + "=" + subst);

       double divi = (number2 / number3);
       System.out.println(number2  + "/" + number3 + "=" + divi);
    }
}