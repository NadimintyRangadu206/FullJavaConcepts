package com.java.basic.programs;


import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result1 {
    public static List<Integer> roundGrades(List<Integer> grades) {
        return grades.stream()
                .map(grade -> {
                    if (grade < 38) {
                        return grade;
                    } else {
                        int nextMultipleOf5 = (int) (Math.ceil(grade / 5.0) * 5);
                        return (nextMultipleOf5 - grade < 3) ? nextMultipleOf5 : grade;
                    }
                })
                .collect(Collectors.toList());
    }
}

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = Result1.roundGrades(grades);

        bufferedWriter.write(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n")));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}