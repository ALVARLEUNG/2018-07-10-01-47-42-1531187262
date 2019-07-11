package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int temp;
        int sum =0;
        if (leftBorder > rightBorder) {
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i<=rightBorder; i++) {
            if(i % 2 ==0) sum += i;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int temp;
        int sum =0;
        if (leftBorder > rightBorder) {
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i<=rightBorder; i++) {
            if((i-1) % 2 ==0) sum += i;
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//        int sum = 0;
//        for (Integer num : arrayList) {
//            sum += num*3+2;
//        }
//        return sum;
        return arrayList.stream().mapToInt(item -> item *3+2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        List<Integer> result = new ArrayList<>();
//        for (Integer num : arrayList) {
//            if ((num-1)%2 ==0) {
//                num = num*3+2;
//            }
//            result.add(num);
//        }
//        return result;
        return arrayList.stream().map((item) -> item % 2 == 0 ? item : item *3+2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        int sum =0;
//        for (Integer num : arrayList) {
//            if ((num-1)%2 ==0) {
//                sum += num*3+5;
//            }
//        }
//        return sum;

//        return  arrayList.stream().reduce(0, (subtotal, ele) -> subtotal += ele % 2 == 0 ? 0 : ele * 3 + 5);
        return arrayList.stream().filter((item) -> item % 2 != 0).mapToInt(item -> item*3+5).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {

        return arrayList.stream().filter(item -> item%2 ==0).mapToDouble(item -> item).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
