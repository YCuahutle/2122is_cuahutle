import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int rest = 0, terminar = 0, menu=0, total=0, sf1=0,sf2=0,sf3=0,sf4=0,sf5=0;
        int floor = 10, cant, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, fb, sftotal=0;
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);

        while (terminar == 0) {
            System.out.println("------------menu------------");
            System.out.println("1- subir gente");
            System.out.println("2- ver gente en cada piso");
            System.out.println("3- vaciar un piso");
            System.out.println("4- vaciar todos los pisos");
            System.out.println("5-registro");
            System.out.println("6- cerrar programa");
            System.out.println("¿que desea hacer?");
            menu = leer.nextInt();

            if(menu==1){
                System.out.println("------------subir------------");
                System.out.println(" ");
                System.out.println("para salir escriba 0 o numero mayor a 5");
                System.out.println("A que piso desea ir (5 pisos)");
                floor = leer.nextInt();
                if (floor > 0 && floor <= 5){
                    while (floor > 0 && floor <= 5) {
                        System.out.println("Cuantas personas entraran ");
                        cant = leer.nextInt();
                        if (cant > 0) {

                            if (floor == 1) {
                                while (f1 < cant) {

                                    f1 = f1 + 5;
                                    if (f1 > cant) {
                                        f1 = cant;
                                    }
                                    rest=cant-f1;
                                    System.out.println("personas restantes por subir: "+rest);
                                }
                                System.out.println("personas que subieron al piso 1: " + f1);
                            }

                            else if (floor == 2) {
                                while ( f2 < cant) {
                                    f2 = f2 + 5;
                                    if (f2 > cant) {
                                        f2 = cant;
                                    }
                                    rest=cant-f2;
                                    System.out.println("personas restantes por subir: "+rest);
                                }
                                System.out.println("personas que subieron al piso 2: " + f2);

                            } else if (floor == 3) {
                                while ( f3 < cant) {
                                    f3 = f3 + 5;
                                    if (f3 > cant) {
                                        f3 = cant;
                                    }
                                    rest=cant-f3;
                                    System.out.println("personas restantes por subir: "+rest);
                                }
                                System.out.println("personas que subieron al piso 3: " + f3);

                            } else if (floor == 4) {
                                while ( f4 < cant) {
                                    f4 = f4 + 5;
                                    if (f4 > cant) {
                                        f4 = cant;
                                    }
                                    rest=cant-f4;
                                    System.out.println("personas restantes por subir: "+rest);
                                }
                                System.out.println("personas que subieron al piso 4: " + f4);

                            } else if (floor == 5) {
                                while ( f5 < cant) {
                                    f5 = f5 + 5;
                                    if (f5 > cant) {
                                        f5 = cant;
                                    }
                                    rest=cant-f5;
                                    System.out.println("personas restantes por subir: "+rest);
                                }
                                System.out.println("personas que subieron al piso 5: " + f5);

                            } else {
                                System.out.println("algo salio mal");
                            }


                        } else {
                            System.out.println("solo pueden subir 5 personas");

                        }
                        System.out.println("para salir escriba 0");
                        System.out.println("A que piso desea ir (5 pisos)");
                        floor = leer.nextInt();
                    }
                }
                else {
                    System.out.println("opcion no valida");
                }
                if (floor==0){
                    System.out.println("---------------regresando-------------");
                }

                total=total+f1+f2+f3+f4+f5;
            }


            else if (menu==2) {
                System.out.println("------------personas por piso------------");
                System.out.println(" ");
                System.out.println("Cuantas personas hay en cada piso: ");
                System.out.println("piso 1 " + f1);
                System.out.println("piso 2 " + f2);
                System.out.println("piso 3 " + f3);
                System.out.println("piso 4 " + f4);
                System.out.println("piso 5 " + f5);
            }

            else if (menu==3){
                System.out.println("------------bajar de un piso------------");
                System.out.println(" ");
                System.out.println("¿de que piso desea bajar a todas las personas?");
                fb = leer1.nextInt();
                if (fb == 1) {
                    sf1=sf1+f1;
                    while (0 < f1) {
                        f1 = f1 - 5;
                        if (f1 < 0) {
                            f1 = 0;
                        }
                        System.out.println("personas restantes" + f1);
                    }
                }
                else if (fb == 2) {
                    sf2=sf2+f2;
                    while (0 < f2) {
                        f2 = f2 - 5;
                        if (f2 < 0) {
                            f2 = 0;
                        }
                        System.out.println("personas restantes" + f2);
                    }
                }
                else if (fb == 3) {
                    sf3=sf3+f3;
                    while (0 < f3) {
                        f3 = f3 - 5;
                        if (f3 < 0) {
                            f3 = 0;
                        }
                        System.out.println("personas restantes" + f3);
                    }
                }
                else if (fb == 4) {
                    sf4=sf4+f4;
                    while(0 < f4) {
                        f4 = f4 - 5;
                        if (f4 < 0) {
                            f4 = 0;
                        }
                        System.out.println("personas restantes" + f4);
                    }
                }
                else if (fb == 5) {
                    sf5=sf5+f5;
                    while (0 < f5) {
                        f5 = f5 - 5;
                        if (f5 < 0) {
                            f5 = 0;
                        }
                        System.out.println("personas restantes" + f5);
                    }
                }
                else {
                    System.out.println("ingrese un piso valido");
                }
            }
            else if(menu==4){
                System.out.println("------------bajando a todos------------");
                sf1=sf1+f1;
                sf2=sf2+f2;
                sf3=sf3+f3;
                sf4=sf4+f4;
                sf5=sf5+f5;
                while (0 < f1) {
                    f1 = f1 - 5;
                    if (f1 < 0) {
                        f1 = 0;
                    }
                    System.out.println("personas restantes piso 1: " + f1);
                }
                while (0 < f2) {
                    f2 = f2 - 5;
                    if (f2 < 0) {
                        f2 = 0;
                    }
                    System.out.println("personas restantes piso 2: " + f2);
                }
                while (0 < f3) {
                    f3 = f3 - 5;
                    if (f3 < 0) {
                        f3 = 0;
                    }
                    System.out.println("personas restantes piso 3: " + f3);
                }
                while (0 < f4) {
                    f4 = f4 - 5;
                    if (f4 < 0) {
                        f4 = 0;
                    }
                    System.out.println("personas restantes piso 4: " + f4);
                }
                while(0 < f5) {
                    f5 = f5 - 5;
                    if (f5 < 0) {
                        f5 = 0;
                    }
                    System.out.println("personas restantes piso 5: " + f5);
                }
                System.out.println("------------proceso finalizado------------");

            }
            else if(menu==5){
                System.out.println("------------Registro------------");
                System.out.println(" ");
                System.out.println("entraron "+total+" personas");
                sftotal=total-(sf1+sf2+sf3+sf4+sf5);
                System.out.println("personas en el hotel:"+sftotal);
                System.out.println("las personas que bajaron por piso son: ");
                System.out.println("piso 1: "+ sf1);
                System.out.println("piso 2: "+ sf2);
                System.out.println("piso 3: "+ sf3);
                System.out.println("piso 4: "+ sf4);
                System.out.println("piso 5: "+ sf5);
            }

            else if (menu == 6) {
                terminar = 1;
            }
            else {
                System.out.println("opcion invalida");
            }
        }
    }
}