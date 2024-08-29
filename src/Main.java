import java.util.Scanner;

public class Main {
    private static Account account1 = new Account("user1", "pass123",500.51);

    public static void main(String[] args) {
        System.out.println("Welkom bij bank Anthony");
        System.out.println("Log hier in met uw naam en wachtwoord");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Naam:");
        String naam = scanner.nextLine();

        System.out.println("Wachtwoord:");
        String wachtwoord = scanner.nextLine();

        if (checkaccount(account1, naam, wachtwoord)) {
            IngelogdMenu(scanner);
        }

        scanner.close();
    }

    public static boolean checkaccount(Account account, String ingevoerdeNaam, String ingevoerdWachtwoord) {
        if (account.isGeldig(ingevoerdeNaam, ingevoerdWachtwoord)) {
            System.out.println("Inloggen succesvol!");
            return true;
        } else {
            System.out.println("Ongeldige naam of wachtwoord, probeer het opnieuw.");
            return false;
        }
    }

    public static void IngelogdMenu(Scanner scanner) {
        boolean ingelogd = true;

        while (ingelogd) {
            System.out.println();
            System.out.println("Bank Anthony: Maak hieronder uw keuze");
            System.out.println("1. Geld storten");
            System.out.println("2. Geld opnemen");
            System.out.println("3. Balans checken");
            System.out.println("4. Afsluiten");
            System.out.println();

            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1:
                    System.out.println("Hoeveelheid storten: ");
                    double bedragStorten = scanner.nextDouble();
                    scanner.nextLine();
                    account1.addBalans(bedragStorten);
                    System.out.println("Er is " + bedragStorten + " gestort. Uw nieuwe balans is: " + account1.getBalans());
                    break;
                case 2:
                    System.out.println("Hoeveelheid opnemen: ");
                    double bedragOpnemen = scanner.nextDouble();
                    scanner.nextLine();
                    account1.withdrawBalans(bedragOpnemen);
                    System.out.println("Er is " + bedragOpnemen + " opgenomen. Uw nieuwe balans is: " + account1.getBalans());
                    break;
                case 3:
                    System.out.println("Uw huidige balans is: " + account1.getBalans());
                    break;
                case 4:
                    System.out.println("Afsluiten...");
                    ingelogd = false;
                    break;
                default:
                    System.out.println("Ongeldige keuze. Probeer het opnieuw.");
                    break;
            }
        }
    }
}
//To do:
//accounts meerdere
//geld transferren naar andere accounts
//wachtwoord veranderen
