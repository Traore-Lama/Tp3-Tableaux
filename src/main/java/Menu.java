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
                System.out.println("5 - Exercice n°5");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 5);

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
                    int[] tabExo2 = new int[]{11,41,32,632,10};
                    int[] tabP = new int[tabExo2.length];
                    int[] tabL = new int[tabExo2.length];
                    int pa = 0;
                    int im = 0;
                    int sommeP = 0;
                    int sommeI = 0;

                    for (int j = 0; j < tabExo2.length; j++)
                    {
                        if (tabExo2[j] % 2 == 0)
                        {
                           tabP[pa] = tabExo2[j];
                           sommeP += tabP[pa];
                            pa++;
                        }else
                        {
                            tabL[im] = tabExo2[j];
                            sommeI += tabL[im];
                            im++;
                        }
                    }

                    System.out.println("Valeurs Paires : ");
                    for (int j = 0; j < pa; j++)
                    {
                        System.out.print(tabP[j] + " - ");
                    }
                    System.out.println();

                    System.out.println("Valeurs Impaires : ");
                    for (int j = 0; j < im; j++)
                    {
                        System.out.print(tabL[j] + " - ");
                    }
                    System.out.println();

                    System.out.println("La Somme Paires est : " + sommeP);
                    System.out.println("La Somme Impaires est : "  + sommeI);
                    break;

                case 3:
                    int[] tab1Exo3 = new int[]{4, 8, 7, 12};
                    int[] tab2Exo3 = new int[]{3, 6};
                    int Schtroumpf = 0;

                    // Même remarque il faut faire des boucles
                    // Il faut que le programme fonctionne quel que soit le contenu de chaque tableau

                    for (int i = 0; i < tab1Exo3.length; i++)
                    {
                        System.out.print(tab1Exo3[i] + " - ");
                    }
                    System.out.println();

                    for (int i = 0; i < tab2Exo3.length; i++)
                    {
                        System.out.print(tab2Exo3[i] + " - ");
                    }
                    System.out.println();

                    for (int i = 0; i < tab1Exo3.length; i++)
                    {
                        for (int j = 0; j < tab2Exo3.length; j++)
                        {
                            Schtroumpf += tab1Exo3[i] * tab2Exo3[j];
                        }
                    }

                    System.out.println("Le Schtroumpf est de : " + Schtroumpf);
                    break;

                case 4:
                    int[][] tabExo4 = new int[4][4];

                    // Exemple n°1
                    tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 0;tabExo4[1][1] = 3;tabExo4[1][2] = 0;tabExo4[1][3] = 6;
                    tabExo4[2][0] = 0;tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;tabExo4[3][3] = 0;

                    // Exemple n°2

//                    tabExo4[0][0] = 1;tabExo4[0][1] = 2;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
//                    tabExo4[1][0] = 3;tabExo4[1][1] = 4;tabExo4[1][2] = 0;tabExo4[1][3] = 0;
//                    tabExo4[2][0] = 5;tabExo4[2][1] = 6;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
//                    tabExo4[3][0] = 7;tabExo4[3][1] = 8;tabExo4[3][2] = 0;tabExo4[3][3] = 0;


                    int values = 0;
                    String lignes ="";
                    String colonnes = "";

                    // Oui pour les 2 boucles
                    for (int j = 0; j < tabExo4.length; j++)
                    {
                        for (int k = 0; k < tabExo4[j].length; k++)
                        {
                            System.out.print(tabExo4[j][k] + " - ");
                            if (tabExo4[j][k]  != 0)
                            {
                                values += tabExo4[j][k];
                                lignes += j + " - ";
                                colonnes += k + " - ";
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Valeurs : " + values);
                    System.out.println("Lignes : " + lignes);
                    System.out.println("Colones : " + colonnes);

                    break;

                case 5:

                break;
            }
        } while (choix != 0);
    }
}