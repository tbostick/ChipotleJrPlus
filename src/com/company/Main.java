
package com.company;

    import java.text.DecimalFormat;
    import java.util.Random;


        public class Main {

            public static void main(String[] args) {
                Random r = new Random();
                DecimalFormat n = new DecimalFormat("$$.00");
                double total = 00.99;

                // Variables to fill in burriito
                String rice_hold = "";
                String meat_hold = "";
                String beans_hold = "";
                String salsa_hold = "";
                String veggies_hold = "";
                String cheese_hold = "";
                String guac_hold = "";
                String queso_hold = "";
                String sour_cream_hold = "";
                Double price_hold = 7.50;
                int desired_bowl = 0;
                int runs = 0;

                // Rice Array
                String[] rice = new String[3];
                rice[0] = "white";
                rice[1] = "brown";
                rice[2] = "none";

                //Meat Array
                String[] meat = new String[6];
                meat[0] = "chicken";
                meat[1] = "steak";
                meat[2] = "carnidas";
                meat[3] = "chorizo";
                meat[4] = "sofritas";
                meat[5] = "veggies";

                //Bean Array
                String[] beans = new String[3];
                beans[0] = "pinto";
                beans[1] = "black";
                beans[2] = "none";

                //Salsa Array
                String[] salsa = new String[5];
                salsa[0] = "mild";
                salsa[1] = "medium";
                salsa[2] = "hot";
                salsa[3] = "none";
                salsa[4] = "all";

                //Veggies Array
                String[] veggies = new String[4];
                veggies[0] = "lettuce";
                veggies[1] = "fajita veggies";
                veggies[2] = "none";
                veggies[3] = "all";

                //Cheese Array
                String[] cheese = new String[2];
                cheese[0] = "yes";
                cheese[1] = "no";

                //Guac Array
                String guac[] = new String[2];
                guac[0] = "yes";
                guac[1] = "no";

                //Queso Array
                String queso[] = new String[2];
                queso[0] = "yes";
                queso[1] = "no";

                //Sour cream Array
                String sour_cream[] = new String[2];
                sour_cream[0] = "yes";
                sour_cream[1] = "no";

                do {
                    runs++;


                    for (int i = 0; i < 3; i++) {
                        int x = r.nextInt(3);

                        rice_hold = rice[x];


                    }
                    {
                        for (int i = 0; i < 3; i++) {
                            int x = r.nextInt(6);

                            meat_hold = meat[x];
                        }
                        {
                            for (int i = 0; i < 3; i++) {
                                int x = r.nextInt(3);

                                beans_hold = beans[x];
                            }
                            {
                                for (int i = 0; i < 5; i++) {
                                    int x = r.nextInt(5);

                                    salsa_hold = salsa[x];
                                }
                                {
                                    for (int i = 0; i < 4; i++) {
                                        int x = r.nextInt(4);

                                        veggies_hold = veggies[x];
                                    }
                                }
                                {
                                    for (int i = 0; i < 2; i++) {
                                        int x = r.nextInt(2);

                                        cheese_hold = cheese[x];
                                    }
                                    {
                                        for (int i = 0; i < 2; i++) {
                                            int x = r.nextInt(2);

                                            guac_hold = guac[x];
                                        }
                                        {
                                            for (int i = 0; i < 2; i++) {
                                                int x = r.nextInt(2);

                                                queso_hold = queso[x];
                                            }
                                        }
                                        {
                                            for (int i = 0; i < 2; i++) {
                                                int x = r.nextInt(2);

                                                sour_cream_hold = sour_cream[x];
                                            }
                                        }
                                    }
                                }
                                // Normal output
                                if (salsa_hold != "all" && veggies_hold != "all") {
                                    System.out.println("Normal Output");
                                    System.out.println("Burrito " + runs + ": " + rice_hold + " rice, " + meat_hold + " meat, "
                                            + beans_hold + " beans, " + salsa_hold + " salsa, "
                                            + veggies_hold + " veggies, " + cheese_hold + " cheese, "
                                            + guac_hold + " guac, " + queso_hold + " queso, "
                                            + sour_cream_hold + " sour_cream" + " $" + n.format(price_hold) + " price");

                                }

                                //Output with all salsa
                                else if (salsa_hold == "all" && veggies_hold != "all") {
                                    System.out.println("All Salsa");
                                    System.out.println("Burrito " + runs + ": " + rice_hold + " rice, " + meat_hold + " meat, "
                                            + beans_hold + " beans, " + " mild salsa, medium salsa, hot salsa, "
                                            + veggies_hold + " veggies, " + cheese_hold + " cheese, "
                                            + guac_hold + " guac, " + queso_hold + " queso, "
                                            + sour_cream_hold + " sour_cream" + " $" + n.format(price_hold) + " price");
                                }
                                //Output with all veggies
                                else if (salsa_hold != "all" && veggies_hold == "all") {
                                    System.out.println("All Veggies");
                                    System.out.println("Burrito " + runs + ": " + rice_hold + " rice, " + meat_hold + " meat, "
                                            + beans_hold + " beans, " + salsa_hold + " salsa, "
                                            + " lettuce, fajita veggies, " + cheese_hold + " cheese, "
                                            + guac_hold + " guac, " + queso_hold + " queso, "
                                            + sour_cream_hold + " sour_cream" + " $" + n.format(price_hold) + " price");
                                }
                                //Output with all salsa and all veggies
                                else if (salsa_hold == "all" && veggies_hold == "all") {
                                    System.out.println("All Salsa and All Veggies");
                                    System.out.println("Burrito " + runs + ": " + rice_hold + " rice, " + meat_hold + " meat, "
                                            + beans_hold + " beans, " + " mild salsa, medium salsa, hot salsa, "
                                            + " lettuce, fajita veggies, " + cheese_hold + " cheese, "
                                            + guac_hold + " guac, " + queso_hold + " queso, "
                                            + sour_cream_hold + " sour_cream" + " $" + n.format(price_hold) + " price");

                                }
                            }
                        }

                    }
                }
                while (runs < 25) ;
                System.exit(0);

            }
        }

