import java.util.*;
public class promedio {
    public static void main(String[] args){
        ArrayList<ArrayList> contenedor = new ArrayList<ArrayList>();
        ArrayList<String> datos = new ArrayList<String>();
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Float> promedios = new ArrayList<Float>();
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);

        String nombre;
        int ca =0;
        int cm =0;
        while (ca>0){
            int suma =0;
            int cal;
            float promedio = 0;
            ca--;
            System.out.println("ingrese su nombre");
            nombre = leer1.nextLine();
            System.out.println("ingrese la cantidad de materias " );
            cm = leer.nextInt();
            nombres.add(nombre);
            for (int i = 0; i<cm; i++){
                System.out.println("insegre la calificacion ");
                cal = leer.nextInt();
                suma +=cal;
            }

            promedio=suma/cm;
            promedios.add(promedio);
        }

    }
}
