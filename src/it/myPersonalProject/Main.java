package it.myPersonalProject;

import it.myPersonalProject.Day1.Day1_part1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        //List<String> list = Files.readAllLines(Path.of("src/it/myPersonalProject/Day1/debugInput.txt"));
        List<String> list = Files.readAllLines(Path.of("src/it/myPersonalProject/input.txt"));
        System.out.println("list size is "+list.size());

        //DAY 1 PART 1

        Day1_part1 day1Part1 = new Day1_part1(list);
        int total = Day1_part1.getTotal(day1Part1.findNumbers());
        System.out.println("Total is "+total);

    }
}
