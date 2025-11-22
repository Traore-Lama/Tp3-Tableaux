import java.text.DecimalFormat;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        int choix;
        Scanner scanner = new Scanner(System.in);
        //DecimalFormat decimalFormat = new DecimalFormat("#.##");
        do {
            do {
                System.out.println("1 - Exercice n°1");
                System.out.println("2 - Exercice n°2");
                System.out.println("3 - Exercice n°3");
                System.out.println("4 - Exercice n°4");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix) {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    // Je declare un tableau
                    // Je luis mets 5 values
                    int[] tab = new int[5];

                    // Je rempli le tableau
                    tab[0] = 31;
                    tab[1] = 6;
                    tab[2] = 17;
                    tab[3] = 4;
                    tab[4] = 999;

                    //Parcourir le Tableau
                    for (int i = 0; i < tab.length; i++) {
                        System.out.print(tab[i] + "-");
                    }
                    //Pour sauter une ligne
                    System.out.println();

                    //Affiche la Valeur la PLus Grande
                    int max = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i] > max) {
                            max = tab[i];
                        }
                    }
                    System.out.println("La + Grande values est : " + max);

                    break;
                case 2:
                    int[] tabP = new int[]{32, 632, 10};
                    int[] tabL = new int[]{11, 41};

                    // Ton code n'est pas bon
                    // Il faut 3 tableaux
                    // 1 tableau principal qui est déjà rempli avec des valeurs paires et/ou impaires
                    // 2 autres tableaux vides qu'il faudra remplir avec chaque case du tableau principal
                    // si celle-ci est paire ou impaire
                    // Il faut faire une boucle pour parcourir le tableau principal


                    System.out.print("Valeur Paires : " + tabP[0] + " - " + tabP[1] + " - " + tabP[2]);
                    System.out.println();
                    System.out.print("Valeur Impaires : " + tabL[0] + " - " + tabL[1]);
                    System.out.println();
                    System.out.println("La Somme Paires est : " + (tabP[0] + tabP[1] + tabP[2]));
                    System.out.println("La Somme Impaires est : " + (tabL[0] + tabL[1]));

                    break;

                case 3:
                    int[] tab1Exo3 = new int[]{4, 8, 7, 12};
                    int[] tab2Exo3 = new int[]{3, 6};
                    int Schtroumpf;

                    // Même remarque il faut faire des boucles
                    // Il faut que le programme fonctionne quel que soit le contenu de chaque tableau

                    System.out.print(tab1Exo3[0] + " - " + tab1Exo3[1] + " - " + tab1Exo3[2] + " - " + tab1Exo3[3]);
                    System.out.println();
                    System.out.print(tab2Exo3[0] + " - " + tab2Exo3[1]);
                    System.out.println();
                    Schtroumpf = tab1Exo3[0] * tab2Exo3[0] + tab1Exo3[0] * tab2Exo3[1] + tab1Exo3[1] * tab2Exo3[0] + tab1Exo3[1] * tab2Exo3[1] + tab1Exo3[2] * tab2Exo3[0] + tab1Exo3[2] * tab2Exo3[1] + tab1Exo3[3] * tab2Exo3[0] + tab1Exo3[3] * tab2Exo3[1];
                    System.out.println("Le Schtroumpf est de : " + Schtroumpf);
                    break;

                case 4:
                    int[][] tabExo4 = new int[4][4];

                    // Exemple n°1
                    /*tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 0;tabExo4[1][1] = 3;tabExo4[1][2] = 0;tabExo4[1][3] = 6;
                    tabExo4[2][0] = 0;tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;tabExo4[3][3] = 0;*/

                    // Exemple n°2

                    tabExo4[0][0] = 1;tabExo4[0][1] = 2;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 3;tabExo4[1][1] = 4;tabExo4[1][2] = 0;tabExo4[1][3] = 0;
                    tabExo4[2][0] = 5;tabExo4[2][1] = 6;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 7;tabExo4[3][1] = 8;tabExo4[3][2] = 0;tabExo4[3][3] = 0;

                    int values = 0;
                    int ligne;

                    // Oui pour les 2 boucles
                    for (int i = 0; i < tabExo4.length; i++)
                    {
                        for (int j = 0; j < tabExo4[i].length; j++)
                        {
                            // Il faut tester si la case est nulle ou pas
                            // Pour afficher le numéro de la ligne, donc i
                            // Pour afficher le numéro de la colonne, donc j
                            tabExo4[i][j] = i + j;
                            System.out.print(tabExo4[i][j]);
                            if(j < tabExo4[i].length - 1)
                            {
                                System.out.print(" - ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Valeurs : " + values);
                    System.out.println("Lignes : ");
                    System.out.println("Colones : ");


                    break;
            }
        } while (choix != 0);
    }
}