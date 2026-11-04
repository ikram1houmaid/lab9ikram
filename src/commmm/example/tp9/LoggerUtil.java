package commmm.example.tp9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {

    public static void logError(String message) {

        // Ouverture du fichier en mode ajout
        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("error.log", true))) {

            writer.write("[" + LocalDateTime.now() + "] " + message);
            writer.newLine();

        } catch (IOException e) {

            System.err.println(
                "Impossible d'écrire dans le fichier de log : "
                + e.getMessage()
            );
        }
    }
}
