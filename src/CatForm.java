import java.time.LocalDate;
import java.util.Scanner;

public class CatForm {
    Scanner scanner;

    public CatForm() {
        this.scanner = new Scanner(System.in);
    }

    public void showTitle() {
        System.out.println("Formulaire d'encodage d'un chat");
    }

    public Cat showForm() {
        System.out.print("race: ");
        String breed = scanner.nextLine();
        System.out.print("date de naissance (yyyy-mm-dd): ");
        LocalDate birth = LocalDate.parse(scanner.nextLine());
        System.out.print("poids: ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("taille: ");
        double size = Double.parseDouble(scanner.nextLine());
        System.out.print("couleurs: ");
        String[] colors = scanner.nextLine().split(" ");
        return new Cat(breed, birth, weight, size, colors);
    }

    public boolean showContinue() {
        System.out.print("\nTaper 'O' pour encoder un autre chat: ");
        return scanner.nextLine().equalsIgnoreCase("O");
    }

    public void close() {
        scanner.close();
    }
}