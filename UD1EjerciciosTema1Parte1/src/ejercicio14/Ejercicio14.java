package ejercicio14;

import java.util.Scanner;

public class Ejercicio14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term grade: ");
        Integer grade1 = sc.nextInt();
        System.out.print("Enter second term grade: ");
        Integer grade2 = sc.nextInt();
        System.out.print("Enter third term grade: ");
        Integer grade3 = sc.nextInt();
        Double academicAverage = (grade1 + grade2 + grade3) / 3.0;
        Integer reportCardAverage = academicAverage.intValue();
        System.out.println("Report card average (integer): " + reportCardAverage);
        System.out.println("Academic record average (decimal): " + academicAverage);
        sc.close();
    }
}