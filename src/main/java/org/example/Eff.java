package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Eff
{

    public static void main( String[] args )
    {
        sumTwoValues(5, 10);
        showMaxValue(10, 30);
    }

    // somme de deux valeurs
    public static void sumTwoValues(int valueOne, int valueTwo){
        int somme = 0;
        somme = valueOne + valueTwo; 
        System.out.println(somme);
    }


        // l'utilisateur , saisie deux valeurs et on affiche la somme
        // nous pouvons varier cela avec une soustraction ou encore multiplication
    public static void userWriteSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la première valeur : ");
        int saisie = sc.nextInt();
        System.out.println("Entrez la deuxième valeur : ");
        int saisieTwo = sc.nextInt();
        sumTwoValues(saisie, saisieTwo);
    }




    public static void showMaxValue(int value_one, int value_two){
        // affichage de la valeur la plus elevée
        if(value_one > value_two){
            System.out.println(value_one);
        } else if (value_two > value_one) {
            System.out.println(value_two);
        } else {
            System.out.println("Valeur identique");
        }
    }


    //l'utilisateur saisi son age, dans un nombre entier et on lui affiche un texte selon son age
    // si son age est à 18 ou plus : "Vous êtes majeur" , sinon, "vous êtes mineur !"
    public static void majorOrNotMajor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre âge : ");
        Float age = sc.nextFloat();
        if(age >= 18){
            System.out.println("Je suis majeur");
        } else if (age < 18) {
            System.out.println("je suis mineur");
        } else {
            System.out.println("Impossible");
        }
    }


        //José va bientot passer son bac, il effectue en ce moment une anti-seche en Java qui lui permet de lui donner
        // la longueur de l'hypothenuse
        // vous devez utiliser le théorème de Pythagore et afficher la longueur de l'hypothenuse
    public static void pythagore(float coteUn, float coteDeux){

    }



// José, désire un programme qui permet de lui donner la mention en fonction de la note
// Vous devrez concevoir un algorithme qui demandera une note à l'utilisateur et affichera un texte selon le bareme
        // en dessous de 8 : refusé
// entre 8 inclus et 10 exclus : rattrapage
// entre 10 inclus et 12 exlus : pas de mention
// entre 12 inclus et 14 exclus : mention assez bien
// entre 14 inclus et 16 exclus : mention bien
// au dela de 16 inclus : très bien
    public static void mentionBac(int note){

    }



//José, après avoir eu son bac, a fait une grosse fete
// il culpabilise car il a trop mangé et souhaite connaitre son IMC.
        // demander les le poid ainsi que la taille à l'utilisateur et affichez son IMC
        // L'imc est le poid (en kg) divisé ar la taille (en m) au carré.
    public static void imc(){

    }


    // l'utilisateur doit saisir un nombre entier: on lui affiche s'il est pair ou impair
    // pair si quand il est divisé par deux, le reste est de 0
    public static void pairOrImpair(){

    }

    // on demande à l'utilisateur un nombre entier, on lui affiche s'il est premier ou non
    // regle : un nombre est premier seulement s'il est divisible par 1 et lui-même , 1 exclu
    public static void premierOrNotPremier(){

    }



    // division, attention au 0
    // Pour rappel, une division par 0 est interdite
    public static void divisionTwoValues(int numerator, int denumerator){

    }



//José est revenu pour nous tester un peu !
        // Il a constaté que vous avez fait pas mal d'exercice en Java.
        // Ainsi, il vous demande de lui donner la clef de controle de sa carte de sécurité sociale
// la clef de controle = 97 - (numero de sécurité sociale modulo 97) (le numero de securité sociale est de 13 chiffres)
        // exemple : pour le code sécurité sociale 1921071123456 la clef est de 15.
    public static void keyControlHealth(int securiteSocialNum){

    }

    public static boolean isPalindrome(String prenom, String nom) {
        prenom = prenom.toLowerCase();
        nom = nom.toLowerCase();
        String prenomReverse = "";
        boolean result = true; 

        /*
         * for (int i = prenom.length() -1; i>=0; i--){
                prenomReverse = prenomReverse + prenom.charAt(i);
            }
            if(nom.equals(prenomReverse)){
                result = false;
            }
         */
        
        //deuxième écriture 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prenom);
        stringBuilder = stringBuilder.reverse();
        if(!stringBuilder.toString().equals(nom)){
            return false;
        }
        
        return result;

    }

    public static int countOccurenceOfLetter(String sentence, char letter) {
        int cpt = 0;
        for( int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == letter) cpt ++;
        }
        return cpt;
    }

    public static double avgArrayNote(double[] notes)
    {
        double somme = 0;
        /*
         * for(int i = 0; i < notes.length; i++){
            somme += notes[i]; 
        }
         */
        for (double i : notes){
            somme += i;
        }
        return somme / notes.length; 
    }

    public static boolean isPair (int nombre) {
        boolean result = false;
        if(nombre % 2 == 0) {
            result = true ;
        }
        return result; 
    }


    public static boolean isPrime(int nombre){
        boolean result = true;
        if(nombre == 1) {
            result = false;
        } else {
            for(int i = 2; i <= Math.sqrt(nombre); i++){
                if(nombre % i == 0){
                    result = false;
                }
            }
        }
        return result; 
    }

    public static double division(int numerator, int denumerator){
        double result = 0.0;
        /*
         * if(denumerator != 0){
            result = (double) numerator/denumerator;
        }
         */
        
         try {
            result = (double) numerator / denumerator;
         } catch (ArithmeticException e){
            System.out.println("Division by 0, impossible :" + e);
         }
        return result;
    }
}