
public class Juego {

  public static void main(String[] args) {
   int caballo1 = 0 ;
		int caballo2 = 0 ;    
		int caballo3 = 0 ;
		int caballo4 = 0 ;
		System.out.println(".....inica el juego..... ");
		System.out.println("caballo1 " + caballo1);
		System.out.println("caballo2 "+ caballo2);
		System.out.println("caballo3 " +caballo3);
		System.out.println("caballo4 " +caballo4);
		int max = 6 ;
		while(caballo1<=50){
		 int dado = (int)(Math.random()*6+1) ; 
		 caballo1=caballo1+dado;
		 System.out.println("Avanzaste");
		 System.out.println("caballo1  "+caballo1+"  Dado cayo  "+dado);
		 if(caballo2<=50){
		 int dado2 = (int)(Math.random()*6+1) ; 
		 caballo2=caballo2+dado2;
		 System.out.println("caballo2  "+caballo2+"  Dado cayo  "+dado2);
}
if(caballo3<=50){
		 int dado3 = (int)(Math.random()*6+1) ; 
		 caballo3=caballo3+dado3;
		 System.out.println("caballo3  "+caballo3+"  Dado cayo  "+dado3);
}
if(caballo4<=50){
		 int dado4 = (int)(Math.random()*6+1) ; 
		 caballo4=caballo4+dado4;
		 System.out.println("caballo4  "+caballo4+"  Dado cayo  "+dado4);
}
} 
  }
}