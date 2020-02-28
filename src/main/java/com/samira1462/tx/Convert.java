package com.samira1462.tx;

import java.util.Map;
import java.util.stream.Collectors;

public class Convert {

    Map<Double, Map<Integer, String>> convert(Map<Integer, Map<String, Double>> source) {
        return source.entrySet()
                .stream().flatMap(
                        entry -> entry.getValue()
                                .entrySet().stream()
                                .map(e -> new Object() {
                                    Integer c = entry.getKey();
                                    String p = e.getKey();
                                    Double v = e.getValue();
                                }))
                .collect(Collectors.groupingBy(o -> o.v, Collectors.toMap(o -> o.c, o -> o.p)));
    }
}
