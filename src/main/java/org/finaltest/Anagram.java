package org.finaltest;

import java.util.Locale;

public class Anagram {
    private String first_word;
    private String second_word;

    public Anagram(String first_word, String second_word) {
        this.first_word = first_word;
        this.second_word = second_word;
    }

    public boolean isAnagram() {

        if (first_word == null || second_word == null) {
            // Si alguna de las palabras es nula, no son anagramas
            return false;
        }

        if(!first_word.toLowerCase().equals(first_word) || !second_word.toLowerCase().equals(second_word))
        {
            // Si alguna de las palabras tiene mayúsculas, no son anagramas
            return false;
        }

        if(first_word.equals(second_word))
        {
            // Si las palabras son iguales, no son anagramas
            return false;
        }

        if (first_word.length() != second_word.length()) {
            // Si las palabras no tienen la misma longitud, no son anagramas
            return false;
        }


        // Se crea un arreglo de 27 elementos para contar la cantidad de veces que aparece cada letra en las palabras
        int[] first_word_count = new int[26];
        int[] second_word_count = new int[26];

        // Se recorren las palabras y se cuentan las letras en los arreglos
        for (int i = 0; i < first_word.length(); i++) {
            if(first_word.charAt(i) < 'a' || first_word.charAt(i) > 'z' || second_word.charAt(i) < 'a' || second_word.charAt(i) > 'z')
            {
                // Si alguna de las palabras tiene caracteres que no son letras, no son anagramas
                return false;
            }
            // Se resta el valor de 'a' para obtener un índice entre 0 y 26
            // El valor de 'a' es 97, por lo que al restarlo se obtiene un índice entre 0 y 26
            first_word_count[first_word.charAt(i) - 'a']++;
            second_word_count[second_word.charAt(i) - 'a']++;
        }

        // Se comparan los arreglos de conteo
        for (int i = 0; i < 26; i++) {
            // Si alguna letra tiene una cantidad distinta en cada palabra, no son anagramas
            if (first_word_count[i] != second_word_count[i]) {
                return false;
            }
        }

        // Si no se encontró ninguna diferencia, las palabras son anagramas
        return true;
    }



}
