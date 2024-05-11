# Final Test - Anagram
_Analisis y Diseño de Sistemas 2 - Ing. Moises Granados_
## Table of contents
- [Final Test - Anagram](#final-test---anagram)
  - [Description](#description)
  - [How to use](#how-to-use)
  - [How it works](#how-it-works)
  - [Example](#example)
  - [Testing](#testing)
  - [Author](#author)

## Description
This is a simple program that checks if two strings are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word 'listen' is an anagram of 'silent'.
## How to use
To use this program, simply run the TestAnagram file and follow the instructions on the screen. You will be asked to input two strings, and the program will output whether or not they are anagrams of each other.
## How it works
The program works by validate the input strings, removing any non-alphabetic characters, spaces, and punctuation marks from the strings. It then sorts the characters in each string alphabetically, and compares the sorted strings. If the sorted strings are equal, the input strings are anagrams of each other.
## Example
Input:
``` 
"pesada"
"espada"
```
Output:
```
true
```
Input:
```
"listen"
"silents"
```
Output:
```
false
```
## Testing
Unit tests are included in the TestAnagram file to test the program with different inputs.
## Author
Eriksson Hernández
201830459