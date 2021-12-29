package cn.map.demo;

import cn.set.demo.FileOperation;

import java.util.ArrayList;

public class TestMap {
    static ArrayList<String> words;
    public static void main(String[] args) {
        words = new ArrayList<>();
        FileOperation.readFile("src/pride-and-prejudice.txt", words);
        LinkedListMap<String, Integer> ls = new LinkedListMap();
        System.out.println("LinkedListMap:");
        countingWords(ls);
        System.out.println(ls.size());
        System.out.println("======");
        TreeMap<String, Integer> ts = new TreeMap<>();
        System.out.println("TreeMap:");
        countingWords(ts);
        System.out.println(ts.size());
    }

    private static void countingWords(Map<String, Integer> map) {
        long startTime = System.currentTimeMillis();
        for(String word : words){
            map.put(word, 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }
}
