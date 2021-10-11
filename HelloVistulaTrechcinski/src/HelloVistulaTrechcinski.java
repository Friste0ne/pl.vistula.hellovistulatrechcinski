import java.util.Scanner;

public class HelloVistulaTrechcinski {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz swoją wagę, a powiem Ci, ile ważysz na Marsie: ");
        Float wagaTrechcinski = scanner.nextFloat();
        System.out.println("Na Ziemi ważysz: "+wagaTrechcinski +"kg");

        Float wagaNaMarsieTrechcinski = wagaTrechcinski*0.38F;
        System.out.println("Na Marsie ważysz: "+wagaNaMarsieTrechcinski +"kg");

        Double nowaZmiennaTrechcinski = (double)wagaNaMarsieTrechcinski;
        System.out.println("Nowa zmienna double: "+nowaZmiennaTrechcinski);

        System.out.println("Nowa zmienna double po zaokrągleniu: "+String.format("%.4f", nowaZmiennaTrechcinski));
        int nowaZmiennaIntTrechcinski = (int)Math.round(nowaZmiennaTrechcinski);
        System.out.println("Nowa zmienna int: "+nowaZmiennaIntTrechcinski);

        char nowaZmiennaCharTrechcinski = (char) nowaZmiennaIntTrechcinski;
        System.out.println("Nowa zmienna char: "+nowaZmiennaCharTrechcinski);

        int nowaZmiennaInt2Trechcinski = nowaZmiennaCharTrechcinski+5; //nie trzeba konwersji bo int > char
        System.out.println("Zmieniłem zmienną char na zmienną int oraz dodałem do niej 5: " +nowaZmiennaInt2Trechcinski);
    }
}
