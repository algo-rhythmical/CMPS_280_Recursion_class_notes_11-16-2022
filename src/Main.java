

public class Main {
    public static void main(String[] args) {
        int nDiscs = 4;

        towersOfHanoi(nDiscs, 'A', 'B', 'C');

    }

    static void  towersOfHanoi (int n, char from, char helper, char target) {
        // base case
        if (n == 1) {
            System.out.println("move from " +from+ " to " +target);
            return;
        }

        // general case(recursive case)


        towersOfHanoi(n-1, from, target, helper);
            System.out.println("move from " +from+ " to " +target);



        towersOfHanoi(n-1, helper, from, target);



    }

}
