package com.company.util;

import java.util.List;

/**
 * Created by cooper on 25.09.15.
 */
public class Arrays {

    public static int[] listToArr(List<Integer> list) {
        int[] arr = list.stream().mapToInt(i->i).toArray();
        return arr;
    }
}
