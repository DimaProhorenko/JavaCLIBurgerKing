package com.burgerking.utils;

import com.burgerking.constants.Extras;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Helpers {

    public static String enumToString(Enum[] values) {
        System.out.println(values.getClass().isArray());
        return Arrays.stream(values).map(el -> el.toString()).collect(Collectors.joining(", "));
//        return Arrays.stream(passedEnum.values()).map(el -> el.getName()).collect(Collectors.joining(", "))
    }
}
