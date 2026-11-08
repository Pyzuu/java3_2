import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź: ");
        String tekst = scanner.nextLine();
        StringBuilder wynik = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (Character.isUpperCase(znak)) {
                wynik.append(Character.toLowerCase(znak));
            } else if (Character.isLowerCase(znak)) {
                wynik.append(Character.toUpperCase(znak));
            } else {
                wynik.append(znak);
            }
        }
        System.out.println("Tekst po zamianie:");
        System.out.println(wynik.toString());
        scanner.close();
    }
}
