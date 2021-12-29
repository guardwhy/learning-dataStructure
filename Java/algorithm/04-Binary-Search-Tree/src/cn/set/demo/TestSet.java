package cn.set.demo;

import java.util.ArrayList;

public class TestSet {
    static ArrayList<String> words;
    public static void main(String[] args) {
        words = new ArrayList<>();
        FileOperation.readFile("src/pride-and-prejudice.txt", words);
        LinkedSet<String> ls = new LinkedSet<>();
        System.out.println("LinkedSet:");
        countingWords(ls);
        System.out.println(ls.size());
        System.out.println("======");
        TreeSet<String> ts = new TreeSet<>();
        System.out.println("TreeSet:");
        countingWords(ts);
        System.out.println(ts.size());
    }

    private static void countingWords(Set<String> set) {
        long startTime = System.currentTimeMillis();
        for(String word : words){
            set.add(word);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }
}
