import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int[]task11 = new int[3];
        for (int index11 = 0; index11 < task11.length; index11++) {
            task11[index11] = index11 + 1;
        }

        double[]task12 = {1.57, 7.654, 9.986};

        int[]task13 = new int[6];
        task13 [0] = 4;
        task13 [1] = 8;
        task13 [2] = 15;
        task13 [3] = 16;
        task13 [4] = 23;
        task13 [5] = 42;

        System.out.println("\nЗадание 2");

        for (int index11 = 0; index11 < task11.length; index11++) {
            if (index11 < task11.length - 1) {
                System.out.print(task11[index11] + ", ");
            } else {
                System.out.println(task11[index11]);
            }
        }

        for (int index12 = 0; index12 < task12.length; index12++) {
            if (index12 < task12.length - 1) {
                System.out.print(task12[index12] + ", ");
            } else {
                System.out.println(task12[index12]);
            }
        }

        for (int index13 = 0; index13 < task13.length; index13++) {
            if (index13 < task13.length - 1) {
                System.out.print(task13[index13] + ", ");
            } else {
                System.out.println(task13[index13]);
            }
        }

        System.out.println("\nЗадание 3");

        for (int index11 = task11.length - 1; index11 >= 0; index11--) {
            if (index11 != 0) {
                System.out.print(task11[index11] + ", ");
            } else {
                System.out.println(task11[index11]);
            }
        }

        for (int index12 = task12.length - 1; index12 >= 0; index12--) {
            if (index12 != 0) {
                System.out.print(task12[index12] + ", ");
            } else {
                System.out.println(task12[index12]);
            }
        }

        for (int index13 = task13.length - 1; index13 >= 0; index13--) {
            if (index13 != 0) {
                System.out.print(task13[index13] + ", ");
            } else {
                System.out.println(task13[index13]);
            }
        }

        System.out.println("\nЗадание 4");

        for (int index11 = 0; index11 < task11.length; index11++) {
            if (task11[index11] % 2 != 0){
                task11[index11]+=1;
            }
            if (index11 < task11.length - 1) {
                System.out.print(task11[index11] + ", ");
            } else {
                System.out.println(task11[index11]);
            }
        }




    }
}