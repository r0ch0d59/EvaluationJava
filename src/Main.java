import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashSet<String> nom = new HashSet<>();








        System.out.println("choisissez une option dans le menu s"); //Affichage du messsage pour choisir une option





        while (true) { //création du menu dans une boucle pour l'afficher
            System.out.println("Voici le menu:");
            System.out.println("1.Entrer Votre Nom: ");
            System.out.println("2.Suprimer un nom: ");
            System.out.println("3.Afficher tout les Noms: ");
            System.out.println("4.Integrer une liste de  nom dans un fichier");
            System.out.println("5.Charger la liste depuis un fichiers");
            System.out.println("6.Quitter");
            int choix = scan.nextInt();

            //Methode Switch pour l'affichage des différents menu grace a une case allant de 1 à 6
            switch (choix) {
                case 1:
                    if (nom.add(scan.next())) {
                        System.out.println("Votre Nom: " + nom);


                        break;
                    }

                case 2:
                    if (nom.remove(scan.next())) {
                        System.out.println("La suppression du nom à bien été prise en compte: ");
                        break;
                    }

                case 3:

                    System.out.println("Les Noms renseignées sont : " + nom);
                    break;

                case 4: ////importation de mon texte directement dans le fichiers test.txt

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/test.txt"))) {
                        String line;
                        System.out.println("Entrer les lignes de texte que vous souhaitez importer dans le fichier test (taper 'exit' pour quitter):");

                        while (true) {
                            line = scan.nextLine();
                            if (line.equalsIgnoreCase("exit")) {
                                break;
                            }
                            writer.write(line);
                            writer.newLine();
                        }
                        System.out.println("Votre message à bien été prise en compte");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;

                case 5: ////importation du texte qui est dans le fichiers test.txt
                    try {
                        FileReader fileReader = new FileReader("src/test.txt");
                        BufferedReader reader = new BufferedReader(fileReader);
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println("La liste de Nom à bien été importer sur votre fichiers "+nom.add(line));
                        }
                        reader.close();

                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                    break;

                case 6:
                    System.out.println("6.Quitter");
                    break;





            }


        }


    }

}






