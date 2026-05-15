// PalmerPenguins.java
// Sabrina Gopshtein
// 5/15/2026
// Write a Java program that will introduce the Palmer Penguin Species.

public class PalmerPenguins {
    
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
    
    static final int TOTAL_SPECIES = 3;
    
    public static void main(String[] args) {
    
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a total of " + TOTAL_SPECIES + " penguin species in this dataset.");
    }
}