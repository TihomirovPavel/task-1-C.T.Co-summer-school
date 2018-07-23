package main.java.lv.ctco.interview;

public class Main {
    //Will return the first higest sequence occurrence.
    public static void main(String[] args) {
        int[] list = {1, 1, 1, 3, 3, 3, 3, 5, 7, 7, 7, 5, 5, 5, 5};
        int[] list1 = {};
        System.out.println(getHigestSecuentialInt(list));
        System.out.println(getHigestSecuentialInt(list1));
    }

    //Will return Zero if list is empty
    public static int getHigestSecuentialInt(int[] list) {
        int higestSequence = 0;
        int hsInt = 0;
        int currentSq = 0;
        int currentElem = 0;
        for (int elem : list) {
            if (elem == currentElem) {
                currentSq++;
            } else {
                currentElem = elem;
                currentSq = 1;
            }
            if (currentSq > higestSequence) {
                hsInt = currentElem;
                higestSequence = currentSq;
            }
        }
        return hsInt;
    }
}
