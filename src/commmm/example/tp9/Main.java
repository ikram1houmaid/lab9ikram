package commmm.example.tp9;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Test de journalisation ---");

        LoggerUtil.logError("Erreur de division par zéro.");

        LoggerUtil.logError("Erreur lors de la lecture du fichier.");

        LoggerUtil.logError("Utilisateur invalide.");

        System.out.println("Les erreurs ont été enregistrées.");
    }
}