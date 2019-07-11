package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left > right) {
            result = IntStream.rangeClosed(right, left).boxed().collect(Collectors.toList());
            Collections.reverse(result);
            return result;
        } else {
            return result = IntStream.rangeClosed(left, right).boxed().collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left > right) {
            result = IntStream.rangeClosed(right, left).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
            Collections.reverse(result);
            return result;
        } else {
            return result = IntStream.rangeClosed(left, right).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        }
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(i -> i %2 ==0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
