public class MyClass {
    public static void main(String args[]) {
      System.out.println("ingresa la forma del terreno que quieres (cuadrado, rectangulo, triangulo");
      String figura = "cuadrado";
      System.out.println("ingresa las medidas del terreno (base, altura)");
      int h =25;
      int b =25;
      
      if(figura == "cuadrado"){
          int area = h * b;
          System.out.println(area);
             if(area >=0 && area <=200){
                System.out.println("El precio del terreno es de $2000");
             }else if(area >=201 && area <=300) {
                System.out.println("El precio del terreno es de $1800");
             }else if(area >=301 && area <=500){
                System.out.println("El precio del terreno es de $1600");
             }else {
              System.out.println("El precio del terreno es de $1400");
             }
          
      }else if(figura == "rectangulo"){
          int area = b * h; 
          System.out.println(area);
             if(area >=0 && area <=200){
                System.out.println("El precio del terreno es de $2000");
             }else if(area >=201 && area <=300) {
                System.out.println("El precio del terreno es de $1800");
             }else if(area >=301 && area <=500){
                System.out.println("El precio del terreno es de $1600");
             }else {
              System.out.println("El precio del terreno es de $1400");
             }
             
      }else {
          int area = (b * h)/2;
          System.out.println(area);
             if(area >=0 && area <=200){
                System.out.println("El precio del terreno es de $2000");
             }else if(area >=201 && area <=300) {
                System.out.println("El precio del terreno es de $1800");
             }else if(area >=301 && area <=500){
                System.out.println("El precio del terreno es de $1600");
             }else {
              System.out.println("El precio del terreno es de $1400");
             }
      }
    
    }
}