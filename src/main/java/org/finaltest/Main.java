package org.finaltest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Anagram anagram = new Anagram("espada", "pesada");
        System.out.println(anagram.isAnagram());
    }
}