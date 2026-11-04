# TP9 – Gestion des exceptions en Java

## Informations générales

- **Langage :** Java
- **IDE :** Eclipse
- **Projet :** lab9
- **Package :** `com.example.tp9`
- **Thème :** Gestion des exceptions et des erreurs en Java

---

## Objectifs du TP

Ce TP a pour objectif de maîtriser la gestion des exceptions en Java à travers quatre exercices pratiques.

Les notions étudiées sont :

- Les exceptions non vérifiées (Unchecked Exceptions).
- Les exceptions vérifiées (Checked Exceptions).
- Les blocs `try`, `catch` et `finally`.
- Les instructions `throw` et `throws`.
- La gestion des ressources avec Try-With-Resources.
- La création d'exceptions personnalisées.
- La journalisation des erreurs dans un fichier.

---

# Exercice 1 – Implémentation d'une calculatrice sécurisée

## Objectif

Créer une classe `Calculator` proposant des opérations arithmétiques de base et capable de signaler les erreurs à l'aide d'exceptions.

## Classe : Calculator.java

La classe contient deux méthodes :

- `add(double a, double b)` : effectue une addition.
- `divide(double a, double b)` : effectue une division.

Une vérification est effectuée avant la division. Si le diviseur est égal à zéro, une exception `IllegalArgumentException` est déclenchée.

## Classe : Main.java

La méthode `main()` permet de tester :

1. Une addition : 5 + 3.
2. Une division valide : 10 / 2.
3. Une division par zéro : 10 / 0.

Les exceptions sont interceptées avec `try-catch`.

## Résultat attendu

```text
--- Test Addition ---
5 + 3 = 8.0

--- Test Division Valide ---
10 / 2 = 5.0

--- Test Division par Zéro ---
Erreur interceptée : Division par zéro interdite.
```

---

# Exercice 2 – Lecture de fichiers et gestion des ressources

## Objectif

Apprendre à lire un fichier texte et à gérer correctement les exceptions d'entrée/sortie (IOException).

### Partie 1 : Utilisation de throws

La classe `FileReaderUtil` contient la méthode :

`readFile(String filePath)`

Cette méthode utilise :

- `FileReader` pour ouvrir le fichier.
- `BufferedReader` pour lire le fichier ligne par ligne.
- `readLine()` pour récupérer chaque ligne.
- `throws IOException` pour propager les erreurs à l'appelant.

### Partie 2 : Gestion avec finally

La méthode `readFileSafely(String filePath)` utilise :

- `try` pour effectuer la lecture.
- `catch` pour intercepter les erreurs.
- `finally` pour garantir la fermeture du fichier.
- `close()` pour libérer la ressource.

### Partie 3 : Modernisation avec Try-With-Resources

La méthode `readFileModern(String filePath)` utilise la syntaxe Try-With-Resources.

Cette technique permet de fermer automatiquement le fichier, même lorsqu'une exception survient.

Elle rend le code plus simple, plus lisible et plus sécurisé.

## Fichier de test

Un fichier `test.txt` est utilisé pour vérifier la lecture.

Exemple de contenu :

```text
Bonjour !
Bienvenue dans le TP9.
Nous apprenons les exceptions Java.
Lecture du fichier réussie.
```

---

# Exercice 3 – Création d'une exception personnalisée

## Objectif

Créer une exception personnalisée pour contrôler les informations d'un utilisateur.

### Classe : InvalidUserException.java

Cette classe hérite de `Exception` et représente une exception vérifiée (Checked Exception).

Elle possède deux constructeurs :

- `InvalidUserException(String message)`
- `InvalidUserException(String message, Throwable cause)`

### Classe : User.java

Cette classe représente un utilisateur avec deux attributs privés :

- `username` : nom de l'utilisateur.
- `age` : âge de l'utilisateur.

Le constructeur vérifie deux conditions :

1. Le nom d'utilisateur ne doit pas être vide ou nul.
2. L'âge doit être compris entre 0 et 120 ans.

Si une condition n'est pas respectée, une exception `InvalidUserException` est déclenchée.

La classe contient également deux getters :

- `getUsername()`
- `getAge()`

## Tests réalisés

- Création d'un utilisateur valide : Ikram, 22 ans.
- Création d'un utilisateur avec un nom vide.
- Vérification de la gestion des erreurs avec `try-catch`.

---

# Exercice 4 – Journalisation des erreurs dans un fichier

## Objectif

Enregistrer les erreurs de l'application dans un fichier `error.log` au lieu de les afficher uniquement dans la console.

### Classe : LoggerUtil.java

Cette classe contient une méthode statique :

`logError(String message)`

Elle utilise :

- `BufferedWriter` pour écrire dans le fichier.
- `FileWriter` pour ouvrir le fichier.
- `LocalDateTime.now()` pour enregistrer la date et l'heure.
- `writer.write()` pour écrire le message.
- `writer.newLine()` pour passer à la ligne suivante.
- `try-with-resources` pour fermer automatiquement le fichier.

### Mode Append

Le paramètre `true` dans :

`new FileWriter("error.log", true)`

permet d'ajouter les nouvelles erreurs à la fin du fichier sans supprimer les anciennes.

## Tests réalisés

Plusieurs messages d'erreur sont enregistrés :

- Erreur de division par zéro.
- Erreur lors de la lecture du fichier.
- Utilisateur invalide.

## Exemple du fichier error.log

```text
[Date et heure] Erreur de division par zéro.
[Date et heure] Erreur lors de la lecture du fichier.
[Date et heure] Utilisateur invalide.
```

---

# Structure du projet

```text
lab9/
│
├── src/
│   └── com/
│       └── example/
│           └── tp9/
│               ├── Calculator.java
│               ├── Main.java
│               ├── FileReaderUtil.java
│               ├── InvalidUserException.java
│               ├── User.java
│               └── LoggerUtil.java
│
├── test.txt
├── error.log
└── README.md
```

*Remarque :* `test.txt` et `error.log` sont des fichiers de test générés ou utilisés pendant l'exécution. `error.log` est créé automatiquement lors de la première journalisation.

---

# Notions Java étudiées

| Notion | Description |
|---|---|
| `try` | Bloc contenant le code susceptible de provoquer une exception. |
| `catch` | Intercepte et traite une exception. |
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/df0b1f5d-8c98-45d5-8edd-e08bb7bdc450" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/bca0c537-144c-4c10-9fe8-32334f564f92" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/ddc24011-0161-4d49-8233-2f50ea80b751" />
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/caa6b211-2cfe-4403-8ba0-26fa7e37d511" />

| `finally` | Permet d'exécuter le code de nettoyage. |
| `throw` | Déclenche une exception. |
| `throws` | Déclare une exception pouvant être propagée. |
| `IOException` | Exception liée aux opérations d'entrée/sortie. |
| `IllegalArgumentException` | Exception liée à un argument invalide. |
| `extends Exception` | Permet de créer une exception personnalisée vérifiée. |
| `try-with-resources` | Ferme automatiquement les ressources. |

---

# Conclusion

Ce TP nous a permis de comprendre et de mettre en pratique la gestion des exceptions en Java.

À travers les quatre exercices, nous avons appris à détecter les erreurs, à les intercepter, à les propager et à créer nos propres exceptions.

Nous avons également découvert différentes méthodes de gestion des ressources et la journalisation des erreurs dans un fichier.

Ces techniques permettent de développer des applications Java plus robustes, plus fiables et plus faciles à maintenir.

---

**Fin du TP9 – Gestion des exceptions en Java.**
