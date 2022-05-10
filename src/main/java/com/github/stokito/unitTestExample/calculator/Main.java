package com.github.stokito.unitTestExample.calculator;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
int n, a, b;
Calculator obj = new Calculator();
Scanner in = new Scanner(System.in);

System.out.println("Введите значение операции (1 - сумма; 2 - разность; 3 - умножение; 4 - деление)");
n = in.nextInt();

System.out.println("Введите значение чисел a и b");
a = in.nextInt();
b = in.nextInt();

if (n == 1) {
System.out.println(obj.sum(a, b));
}
if (n == 2) {
System.out.println(obj.minus(a, b));
}
if (n == 3) {
System.out.println(obj.multiply(a, b));
}
if (n == 4) {
System.out.println(obj.divide(a, b));
}

}

}
