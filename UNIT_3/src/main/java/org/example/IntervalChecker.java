package org.example;
public class IntervalChecker {

    public static void main(String[] args) {
        IntervalChecker checker = new IntervalChecker();

        // Тестирование метода
        System.out.println(checker.numberInInterval(24));  // false
        System.out.println(checker.numberInInterval(50));  // true
        System.out.println(checker.numberInInterval(101)); // false
    }

    public boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}
