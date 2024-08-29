public class Account {
    private String naam;
    private String wachtwoord;
    private double balans;


    public Account(String naam, String wachtwoord, double balans) {
        this.naam = naam;
        this.wachtwoord = wachtwoord;
        this.balans = balans;
    }

    public String getNaam() {
        return naam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public String getBalans() {
        return Double.toString(balans);
    }

    public void addBalans(double amount) {
        if (amount > 0) {
            balans += amount;
        }
    }

    public void withdrawBalans(double amount) {
        if (amount > 0 && amount <= balans) {
            balans -= amount;
        }
    }

    public boolean isGeldig(String ingevoerdeNaam, String ingevoerdWachtwoord) {
        return naam.equals(ingevoerdeNaam) && wachtwoord.equals(ingevoerdWachtwoord);
    }

    public static void main(String[] args) {
        // Voorbeeldaccounts
        //Account account1 = new Account("user1", "pass123");
        //Account account2 = new Account("user2", "pass456");

        // Testen van de accounts
        //System.out.println("Test 1: " + account1.isGeldig("user1", "pass123")); // Moet true zijn
        //System.out.println("Test 2: " + account2.isGeldig("user2", "wrongpass")); // Moet false zijn
    }
}
