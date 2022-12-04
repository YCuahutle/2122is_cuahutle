import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String i1="Gerardo Gutierrez Ramirez",i2="Brayan Samuel Esquivel Garcia";
        int rest, terminar = 0, menu, total=0, sf1=0,sf2=0,sf3=0,sf4=0,sf5=0,gf1=0,gf2=0,gf3=0,gf4=0,gf5=0;
        int floor, cant, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, fb, sftotal,sub=0,subf=0, ff1 = 0, ff2 = 0, ff3 = 0, ff4 = 0, ff5 = 0;
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        System.out.println("hecho por: "+i1+" y "+i2);
        System.out.println("Hotel");

        while (terminar == 0) {
            System.out.println("");
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
                System.out.println("");
                System.out.println("------------subir------------");
                System.out.println(" ");
                System.out.println("para salir escriba 0");
                System.out.println("A que piso desea ir (5 pisos)");
                floor = leer.nextInt();
                if (floor > 0 && floor <= 5){
                    while (floor > 0 && floor <= 5) {
                        System.out.println("Cuantas personas subiran? (subiran maximo 5 a la vez)");
                        cant = leer.nextInt();
                        if (cant > 0) {

                            if (floor == 1) {
                                gf1=gf1+cant;
                                f1=0;
                                ff1=ff1+cant;
                                while (f1 < cant) {
                                    subf=cant-f1;
                                    if(subf>=5) {
                                        sub = 5;
                                    }
                                    else if(subf<5){
                                        sub=subf;
                                    }
                                    f1 = f1 + 5;
                                    if (f1 > cant) {
                                        f1 = cant;

                                    }
                                    rest = cant - f1;
                                    System.out.println("subieron "+sub+" personas");
                                    System.out.println("personas restantes por subir: " + rest);
                                }
                                System.out.println("personas que subieron al piso 1: " + cant);
                            } else if (floor == 2) {
                                gf2=gf2+cant;
                                f2=0;
                                ff2=ff2+cant;
                                while (f2 < cant) {
                                    subf=cant-f2;
                                    if(subf>=5) {
                                        sub = 5;
                                    }
                                    else if(subf<5){
                                        sub=subf;
                                    }
                                    f2 = f2 + 5;
                                    if (f2 > cant) {
                                        f2 = cant;
                                    }
                                    rest = cant - f2;
                                    System.out.println("subieron "+sub+" personas");
                                    System.out.println("personas restantes por subir: " + rest);
                                }
                                System.out.println("personas que subieron al piso 2: " + cant);

                            } else if (floor == 3) {
                                gf3=gf3+cant;
                                f3=0;
                                ff3=ff3+cant;
                                while (f3 < cant) {
                                    subf=cant-f3;
                                    if(subf>=5) {
                                        sub = 5;
                                    }
                                    else if(subf<5){
                                        sub=subf;
                                    }
                                    f3 = f3 + 5;
                                    if (f3 > cant) {
                                        f3 = cant;
                                    }
                                    rest = cant - f3;
                                    System.out.println("subieron "+sub+" personas");
                                    System.out.println("personas restantes por subir: " + rest);
                                }
                                System.out.println("personas que subieron al piso 3: " + cant);

                            } else if (floor == 4) {
                                gf4=gf4+cant;
                                f4=0;
                                ff4=ff4+cant;
                                while (f4 < cant) {
                                    subf=cant-f4;
                                    if(subf>=5) {
                                        sub = 5;
                                    }
                                    else if(subf<5){
                                        sub=subf;
                                    }
                                    f4 = f4 + 5;
                                    if (f4 > cant) {
                                        f4 = cant;
                                    }
                                    rest = cant - f4;
                                    System.out.println("subieron "+sub+" personas");
                                    System.out.println("personas restantes por subir: " + rest);
                                }
                                System.out.println("personas que subieron al piso 4: " + cant);

                            } else if (floor == 5) {
                                gf5=gf5+cant;
                                f5=0;
                                ff5=ff5+cant;
                                while (f5 < cant) {
                                    subf=cant-f5;
                                    if(subf>=5) {
                                        sub = 5;
                                    }
                                    else if(subf<5){
                                        sub=subf;
                                    }
                                    f5 = f5 + 5;
                                    if (f5 >= cant) {
                                        f5 = cant;
                                    }
                                    rest = cant - f5;
                                    System.out.println("subieron "+sub+" personas");
                                    System.out.println("personas restantes por subir: " + rest);
                                }
                                System.out.println("personas que subieron al piso 5: " + cant);

                            } else {
                                System.out.println("algo salio mal");
                            }
                        }
                        else {
                            System.out.println("no se permiten unidades negativas");
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
                        System.out.println("");
                        System.out.println("---------------regresando-------------");
                    }

            }

            else if (menu==2) {
                System.out.println("");
                System.out.println("------------personas por piso------------");
                System.out.println(" ");
                System.out.println("Cuantas personas hay en cada piso: ");
                System.out.println("piso 1 " + ff1);
                System.out.println("piso 2 " + ff2);
                System.out.println("piso 3 " + ff3);
                System.out.println("piso 4 " + ff4);
                System.out.println("piso 5 " + ff5);
            }

            else if (menu==3){
                System.out.println("");
                System.out.println("------------bajar de un piso------------");
                System.out.println(" ");
                System.out.println("¿de que piso desea bajar a todas las personas?");
                fb = leer1.nextInt();

                if (fb == 1) {
                    ff1=0;
                    sf1=sf1+f1;
                    while (0 < f1) {
                        sub=5;
                        if(f1<5){
                            sub=f1;
                        }
                        f1 = f1 - 5;
                        if (f1 < 0) {
                            f1 = 0;
                        }
                        System.out.println("bajaron "+sub+" personas");
                        System.out.println("personas restantes" + f1);
                    }
                }
                else if (fb == 2) {
                    sf2=sf2+f2;
                    ff2=0;
                    while (0 < f2) {
                        sub=5;
                        if(f2<5){
                            sub=f2;
                        }
                        f2 = f2 - 5;
                        if (f2 < 0) {
                            f2 = 0;
                        }
                        System.out.println("bajaron "+sub+" personas");
                        System.out.println("personas restantes" + f2);
                    }
                }
                else if (fb == 3) {
                    sf3=sf3+f3;
                    ff3=0;
                    while (0 < f3) {
                        sub=5;
                        if(f3<5){
                            sub=f3;
                        }
                        f3 = f3 - 5;
                        if (f3 < 0) {
                            f3 = 0;
                        }
                        System.out.println("bajaron "+sub+" personas");
                        System.out.println("personas restantes" + f3);
                    }
                }
                else if (fb == 4) {
                    sf4 = sf4 + f4;
                    ff4 = 0;
                    while(0 < f4) {
                        sub=5;
                        if(f4<5){
                            sub=f4;
                        }
                        f4 = f4 - 5;
                        if (f4 < 0) {
                            f4 = 0;
                        }
                        System.out.println("bajaron "+sub+" personas");
                        System.out.println("personas restantes" + f4);
                    }
                }
                else if (fb == 5) {
                    sf5=sf5+f5;
                    ff5=0;
                    while (0 < f5) {
                        sub=5;
                        if(f5<5){
                            sub=f5;
                        }
                        f5 = f5 - 5;
                        if (f5 < 0) {
                            f5 = 0;
                        }
                        System.out.println("bajaron "+sub+" personas");
                        System.out.println("personas restantes" + f5);
                    }
                }
                else {
                    System.out.println("ingrese un piso valido");
                }
                System.out.println("-------------el piso "+fb+" fue vaciado------------");
            }

            else if(menu==4){
                System.out.println("");
                System.out.println("------------bajando a todos------------");
                sf1=sf1+f1;
                sf2=sf2+f2;
                sf3=sf3+f3;
                sf4=sf4+f4;
                sf5=sf5+f5;
                ff1=0;
                ff2=0;
                ff3=0;
                ff4=0;
                ff5=0;
                System.out.println("piso 1");
                while (0 < f1) {
                    sub=5;
                    if(f1<5){
                        sub=f1;
                    }
                    f1 = f1 - 5;
                    if (f1 < 0) {
                        f1 = 0;

                    }


                    System.out.println("bajaron "+sub+" personas");

                    System.out.println("personas restantes piso 1: " + f1);
                }
                System.out.println("piso 2");
                while (0 < f2) {
                    sub=5;
                    if(f2<5){
                        sub=f2;
                    }
                    f2 = f2 - 5;
                    if (f2 < 0) {
                        f2 = 0;
                    }
                    System.out.println("bajaron "+sub+" personas");
                    System.out.println("personas restantes piso 2: " + f2);
                }
                System.out.println("piso 3");
                while (0 < f3) {
                    sub=5;
                    if(f3<5){
                        sub=f3;
                    }
                    f3 = f3 - 5;
                    if (f3 < 0) {
                        f3 = 0;
                    }
                    System.out.println("bajaron "+sub+" personas");
                    System.out.println("personas restantes piso 3: " + f3);
                }
                System.out.println("piso 4");
                while (0 < f4) {
                    sub=5;
                    if(f4<5){
                        sub=f4;
                    }
                    f4 = f4 - 5;
                    if (f4 < 0) {
                        f4 = 0;
                    }
                    System.out.println("bajaron "+sub+" personas");
                    System.out.println("personas restantes piso 4: " + f4);
                }
                System.out.println("piso 5");
                while(0 < f5) {
                    sub=5;
                    if(f5<5){
                        sub=f5;
                    }
                    f5 = f5 - 5;
                    if (f5 < 0) {
                        f5 = 0;
                    }
                    System.out.println("bajaron "+sub+" personas");
                    System.out.println("personas restantes piso 5: " + f5);
                }
                System.out.println("");
                System.out.println("------------proceso finalizado------------");
            }

            else if(menu==5){
                total=gf1+gf2+gf3+gf4+gf5;

                System.out.println("");
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
            System.out.println("Programa finalizado");
    }
}