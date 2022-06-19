package ch.epai.ict.m404.activity2;

public class FuncLib {

    public static double minOfThree(double val1, double val2, double val3){
        
        double min = val1;

        if (val2 < min) {
            min = val2;
        }

        if (val3 < min){
            min = val3;
        }

        return min;
    }

    public static double maxOfThree(double val1, double val2, double val3){

        double max = val1;

        if (val2 > max){
            max = val2;
        }

        if (val3 > max){
            max = val3;
        }

        return max;
    }

    public static double meanOfThree(double val1, double val2, double val3){

        double avg;

        avg = (val1 + val2 + val3) / 3;

        return avg;
    }

    public static int minOfN(int[] tableau){

        int min = 1;
        for (int i = 0; i < tableau.length; i += 1){
            if (tableau[i] < min){
                min = tableau[i];
            }
        }
        return min;
    }

    public static int maxOfN(int[] tableau){
        int max = 0;

        for (int i = 0; i < tableau.length; i += 1){
            if (tableau[i] > max){
                max = tableau[i];
            }
        }
        return max;
    }

    public static int meanOfN(int[] tableau){
        int somme = 0;
        int mean = 0;

        for (int i = 0; i < tableau.length; i = i +1){
            somme += tableau[i];
        }
        mean = somme / tableau.length;
        return mean;
        }

    }