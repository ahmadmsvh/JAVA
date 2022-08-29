package learn;
public class J03 {

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args){
        int day = 6;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

        int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }
        System.out.println("---------------------------");

        i = 0;
        do {
        System.out.println(i);
        i++;
        }
        while (i < 5);
        System.out.println("---------------------------");

        for (i = 0; i < 5; i++) {
            System.out.println(i);
          }
        System.out.println("---------------------------");
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String j : cars) {
        System.out.println(j);
        }
        System.out.println("---------------------------");

        for ( i = 0; i < 10; i++) {
            if (i == 5) {
              break;
            }
            if (i == 3) {
                continue;
              }
            System.out.println(i);
        }
        System.out.println("---------------------------");

        String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};
        autos[0] = "Opel";
        System.out.println(autos);
        System.out.println("---------------------------");

        int[] numbs = {1,2,3,4,5,6};
        numbs[0] = 12;
        System.out.println(numbs[0]);
        System.out.println("---------------------------");

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for ( i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        System.out.println("---------------------------");

        myMethod("ahmad", 34);
        System.out.println("---------------------------");


    }
}