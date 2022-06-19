package ch.epai.ict.m404.activity2;

public class App{
    public static void main(String[] args) {
        
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        System.out.println("La valeure minimal est : " + FuncLib.minOfThree(a, b, c));
        System.out.println("La valeure minimal est : " + FuncLib.minOfThree(c, a, b));
        System.out.println("La valeure minimal est : " + FuncLib.minOfThree(b, c, a));

        System.out.println();

        System.out.println("La valeure maximal est : " + FuncLib.maxOfThree(a, b, c));
        System.out.println("La valeure maximal est : " + FuncLib.maxOfThree(c, a, b));
        System.out.println("La valeure maximal est : " + FuncLib.maxOfThree(b, c, a));

        System.out.println();

        System.out.println("la moyenne des trois nombres est :" + FuncLib.meanOfThree(a, b, c));

        System.out.println();

        int [] tab = new int [3];
        tab[0] = 7;
        tab[1] = 12;
        tab[2] = 42;

        System.out.print("La valeure min du tableau est : " + FuncLib.minOfN(tab));

        System.out.println();

        System.out.print("La valeure max du tableau est : " + FuncLib.maxOfN(tab));

        System.out.println();

        System.out.println("La moyenne des valeurs du tablean est : " + FuncLib.meanOfN(tab));
    }
}