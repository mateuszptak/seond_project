public class Main {
    public static void main(String[] args) {
            System.out.println("Hello world");

            int number = 5;
            number = 3;

            number += 10;
            number = number + 10;

            float firstNumber = 10;
            float secondNumber = 7;

            float sum = firstNumber / secondNumber;


            int someVariable = 5;

            boolean boolValue1 = true;
            boolean boolValue2 = false;

//            rzutowanie - casting

        double n = 99.99;
        int m = (int)  Math.round(n);

//        warunek if

        int inputNumber = 7;
        int  testNumber = 7;
        if (inputNumber > testNumber) {
            System.out.println("Liczba " + inputNumber + " jest wieksza od " + testNumber);
        } else if (inputNumber < testNumber) {
            System.out.println("Liczba " + inputNumber + " jest mniejsza od " + testNumber);
        } else {
            System.out.println("Liczby są równe sobie");
                    }


        System.out.println(number);
        System.out.println(sum);
        System.out.println(someVariable++);
        System.out.println(++someVariable);
        System.out.println(boolValue1 || boolValue2);
        System.out.println(m);
    }
}