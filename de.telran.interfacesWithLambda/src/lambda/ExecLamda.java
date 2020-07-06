package lambda;

import java.time.LocalDate;
import java.util.function.*;


import static java.lang.Math.abs;

public class ExecLamda {
    public ExecLamda() {
    }

    private static void print(Object o) {
        System.out.println(o);
    }

    // Given an integer, return a power of integer: 5 -> 25
    public void NumberInSq(Integer num) {
        Function<Integer, Integer> funk = a -> a * a;
        System.out.println(returnRes(funk, num));
    }

    // Given a string, return modulo 2 of string length: "abcde" -> 1
    public void NumberModWord(String st) {
        Function<String, Integer> funk = a -> a.length() % 2;
        System.out.println(returnRes(funk, st));
    }

    // Given a string, return its in upper case: "ivan" -> "IVAN"
    public void wordUp(String st) {
        Function<String, String> func = String::toUpperCase;
        print(returnRes(func, st));
    }


    //Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
    public void biLengh(String st, String st1) {
        //Using BiFunction
        BiFunction<String, String, Integer> func = (s, s1) -> (s + s1).length();
        System.out.println(strBiExec(func, st, st1));
        //Using Function + 8 symbols
        st = st + st1 + "+9symbols";
        Function<String, Integer> func1 = s -> s.length();
        System.out.println(returnRes(func1, st));

    }

    //Given 2 strings, print a sum of their lengths.
    public void biSummLengh(String st, String st1) {
        BiFunction<String, String, Integer> func = (s, s1) -> s.length() + s1.length();
        System.out.println(strBiExec(func, st, st1));
    }

    //Given a string, return a reversed string: "abc" ->"cba"
    public void wordRevers(String st) {
        Function<String, String> func = s -> new StringBuffer(s).reverse().toString();
        System.out.println(returnRes(func, st));
    }

    //Given a number, return a reversed number: 12345 -> 54321
    public void namberRevers(Integer num) {
        Function<Integer, String> func = s -> new StringBuffer(Integer.toString(s)).reverse().toString();
        System.out.println(Integer.parseInt((String) returnRes(func, num)));
    }

    //Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false
    public void logicalRes(Integer nam) {
        Predicate<Integer> namEven = s -> s % 2 == 0;
        System.out.println(logExec(namEven, nam));
    }

    //Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
    public void logicalRes(String nam) {
        Predicate<String> namEven = s -> s.length() >= 3;
        System.out.println(logExec(namEven, nam));
    }

    //Given a string and a number x. Return true, if length of string is more than x, false otherwise. Hint: BiPredicate.
    public void moreX(String st, Integer nam) {
        BiPredicate<String, Integer> biFanc = (s, n) -> s.length() < n;
        System.out.println(logBiExec(biFanc, st, nam));

    }

    //Return a date of one week prior to today: "2020-05-30"
    public void dateExec() {
        Supplier<LocalDate> dt = () -> LocalDate.now().minusWeeks(1);
        System.out.println(dt.get());
    }

    //Return a random number 0-9
    public void randomExec() {
        Supplier<Double> rt = Math::random;
        System.out.println((int) ((rt.get() * 100 / 10)));
    }

    //Given a string, return a lower case string
    public void stringLo(String st) {
        Function<String, String> func = String::toLowerCase;
        print(returnRes(func, st));
    }

    //Given a number, return a square root from the number
    public void sqrtExec(Integer num) {
        Function<Integer, Double> sq = Math::sqrt;
        System.out.println(sq.apply(num));
    }

    //Implement solution 7 from above as a method referenc, just the opposite. Return a random number 0-9
    public void randomExec1() {
        Supplier<Double> rt = () -> Math.random();
        System.out.println((int) ((rt.get() * 100 / 10)));
    }

    //Given a class Employee with name and salary. Return an employee salary using 1. Supplier, 2. Function.
    public void empAndSal(String str, Integer i) {
        Function<Employee, Integer> em = Employee::getSalary;
        System.out.println(em.apply(new Employee(str, i)));
        Function<Employee, Integer> em1 = e -> e.getSalary();
        System.out.println(em1.apply(new Employee(str, i + 1000)));
        Supplier<Employee> em2 = () -> new Employee(str, i - 1000);
        System.out.println(em2.get().getSalary());
    }

    private static Object returnRes(Function f, Object rt) {
        return f.apply(rt);
    }

    private static Object strBiExec(BiFunction f, String str, Object str1) {
        return f.apply(str, str1);
    }

    private static Boolean logExec(Predicate f, Object rt) {
        return f.test(rt);
    }

    private static Boolean logBiExec(BiPredicate f, String str, Integer rt) {
        return f.test(str, rt);
    }
}
