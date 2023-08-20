package org.example.testing.calculators;

import java.util.HashMap;
import java.util.Map;

        public class NumberToRoman {

        private int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        private String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        public String intToRoman(int num)
        {
            System.out.println("Integer: " + num);
            HashMap<Integer,String> letters = new HashMap<>();
            for (int i = 0; i < values.length; i++) {
                letters.put(values[i],romanLetters[i]);
            }

            String roman = new String();

            for (Map.Entry<Integer,String> element : letters.entrySet()) {

                while(num >= element.getKey()) {
                    roman += element.getValue();
                    num -= element.getKey();
                }
            }
            return roman;
        }
}
