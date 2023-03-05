package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /*
        *prior java 8
        */
        //legacy way
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);// returns 0 if both values are equal
                                        // returns 1 if first value is bigger
                                        // returns -1 if first value is smaller
            }
        };
        System.out.println("Result of the comparator is : " + comparator.compare(3,2));
        Comparator<Integer> comparatorLambda = (a,b)->a.compareTo(b);
        System.out.println("Result of the comparator using lambda is : " + comparatorLambda.compare(5,6));

    }
}
