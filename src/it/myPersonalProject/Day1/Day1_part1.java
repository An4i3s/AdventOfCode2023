package it.myPersonalProject.Day1;

import java.util.ArrayList;

import java.util.List;

public class Day1_part1 {

    private List<String> inputList;

    public Day1_part1(List<String> firstList) {
        this.inputList = firstList;
    }

    // TODO: 14/12/2023  array of int in cui rchar e lchar vengono inserite OR TRY TO USE LIST INSTEAD

    public List<Integer> findNumbers() throws NumberFormatException{
        List<String> list = inputList;
        System.out.println("size of list in findNumbers "+list.size());
        String[] strings = list.toArray(new String[0]);
        System.out.println("length of strings in findNumbers "+strings.length);
        //int[] resultInts = new int[list.size()];
        List<Integer> resultList = new ArrayList<>();
        //String resultString = "";
        //System.out.println("size of ints in findNumbers  "+re.length);
        for(int i= 0; i<strings.length; i++){
            char rChar = ' ';
            char lChar = ' ';
            char[] chars = strings[i].toCharArray();
            for(int y= 0; y<chars.length; y++){

                if (Character.isDigit(chars[y])) {
                    lChar = chars[y];
                    //System.out.println("rChar = "+rChar);
                    break;
                }
            }
            for(int x= chars.length-1; x>0; x--){
                if (Character.isDigit(chars[x])) {
                    rChar=chars[x];
                    // System.out.println("lChar = "+lChar);
                    break;
                }
            }

            if ((rChar==' ')){
                rChar=lChar;
            }
            if ((lChar==' ')){
                lChar=rChar;
            }


            String rString = Character.toString(rChar);
            String lString = Character.toString(lChar);

            String concatChar = lString+rString;

            resultList.add(Integer.parseInt(concatChar));

            //resultList.add(Integer.parseInt(lString));

        }

        return resultList;

    }

    public static int getTotal(List<Integer> list){
       // char[] chars = string.toCharArray();
        System.out.println("*".repeat(20));
        int total = 0;
        for (Integer i:list) {
            System.out.println("Integer i = "+i);
            total+=i;
            System.out.println("total.InGet Total is = "+total);
        }
        //System.out.println("Total is "+total);
        return total;
    }

}
