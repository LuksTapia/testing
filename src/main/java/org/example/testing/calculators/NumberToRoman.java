package org.example.testing.calculators;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

        public class NumberToRoman {



        public String intToRoman(int num)
        {
            System.out.println("Integer: " + num);

            HashMap<Integer, String> romanMap = new LinkedHashMap<>();
            romanMap.put(1000, "M");
            romanMap.put(900, "CM");
            romanMap.put(500, "D");
            romanMap.put(400, "CD");
            romanMap.put(100, "C");
            romanMap.put(90, "XC");
            romanMap.put(50, "L");
            romanMap.put(40, "XL");
            romanMap.put(10, "X");
            romanMap.put(9, "IX");
            romanMap.put(5, "V");
            romanMap.put(4, "IV");
            romanMap.put(1, "I");

            String roman = new String();

            for (Map.Entry<Integer,String> element : romanMap.entrySet()) {

                while(num >= element.getKey()) {
                    roman += element.getValue();
                    num -= element.getKey();
                }
            }
            return roman;
        }
}
