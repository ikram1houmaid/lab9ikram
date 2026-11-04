package commm.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Test utilisateur valide ---");

        try {
            User user1 = new User("Ikram", 22);

            System.out.println("Nom : " + user1.getUsername());
            System.out.println("Age : " + user1.getAge());

        } catch (InvalidUserException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n--- Test utilisateur invalide ---");

        try {
            User user2 = new User("", 150);

            System.out.println("Nom : " + user2.getUsername());
            System.out.println("Age : " + user2.getAge());

        } catch (InvalidUserException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
