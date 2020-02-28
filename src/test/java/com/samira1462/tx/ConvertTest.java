package com.samira1462.tx;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class ConvertTest {
    @Test
    public void testConvertMethod() {
        Convert convert = new Convert();

        Map<Double, Map<Integer, String>> expected = new HashMap<>();
        Map<Integer, String> integerStringMapOne = new HashMap<>();
        integerStringMapOne.put(20,"c");
        integerStringMapOne.put(10,"c");
        Map<Integer, String> integerStringMapTwo = new HashMap<>();
        integerStringMapTwo.put(20,"b");
        integerStringMapTwo.put(10,"b");
        Map<Integer, String> integerStringMapThree = new HashMap<>();
        integerStringMapThree.put(20,"a");
        integerStringMapThree.put(10,"a");
        expected.put(30d,integerStringMapThree);
        expected.put(400d,integerStringMapTwo);
        expected.put(90d,integerStringMapOne);

        Map<String, Double> part2Source = new HashMap<>();
        part2Source.put("a", 30d);
        part2Source.put("b", 400d);
        part2Source.put("c", 90d);
        Map<Integer, Map<String, Double>> sourc = new HashMap<>();
        sourc.put(10, part2Source);
        sourc.put(20, part2Source);
        Map<Double, Map<Integer, String>> result = convert.convert(sourc);
        assertEquals(expected, result);

    }
}
