package proceduralne.metodyZadania;

public class PierwszeZadanie {
    public static void main(String[] args) {

      /*  System.out.println(area(3, 4));
        System.out.println(area(10, 11));
        System.out.println(area(-1, 5));
        System.out.println(area(0, 2));*/

        /*System.out.println(calculator(5,'+',2));
        System.out.println(calculator(10,'*',2));
        System.out.println(calculator(10,'/',2));*/
    }

    public static int area(int x, int y) {
        if (x > 0 && y > 0) {
            return x * y;
        }
        return -1;
    }

    public static int calculator(int a, char operation, int b){
        if (operation=='+'){
            return a+b;
        }else if (operation=='*'){
            return a*b;
        }else{
            return a/b;
        }
    }
}
//&&

//Zadanie pierwsze
    /*area(3, 4) ➞ 12

        area(10, 11) ➞ 110

        area(-1, 5) ➞ -1

        area(0, 2) ➞ -1*/

//Zadanie drugie
/*
calculator(2, '+', 2) ➞ 4

        calculator(2, '*', 2) ➞ 4

        calculator(4, '/', 2) ➞ 2*/
