package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        Integer arr[]={1,2,3,4,5};

        int ans=Arrays.stream(arr).filter(x->x%2==0).mapToInt(x->x).sum();

    }
}
