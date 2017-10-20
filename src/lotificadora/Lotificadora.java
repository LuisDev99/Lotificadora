package lotificadora;

import java.util.Scanner;

public class Lotificadora {

	static Proyecto_Lotificacion pr = new Proyecto_Lotificacion();
	
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
     int i = 0, fila = 0, columna= 0, j = 0;
     double largo = 0, ancho = 0, precio = 0;
     boolean seReservo;
    	do{
    		System.out.print("***MENU***\n"
    				+ "1. Vender Terreno\n"
    				+ "2. Consulta/Terrenos\n"
    				+ "3. Salir\n"
    				+ "Ingrese lo que quiere hacer: ");
    		i = scn.nextInt();
    		
    		switch(i){
    		case 1:
    			System.out.println("Esta en el proceso de reservar terreno!\n");
    			System.out.print("Ingrese la fila: ");
    			fila = scn.nextInt();
    			System.out.print("Ingrese la columna: ");
    			fila = scn.nextInt();
    			if(fila <= 5 && fila <= 5){ 
    			seReservo = pr.reservarTerreno(fila, columna);
    			if(seReservo){
    				System.out.println("Terreno Disponible!\n");
    				System.out.print("Ingrese el largo: ");
    				largo = scn.nextDouble();
    				System.out.print("Ingrese el ancho: ");
    				ancho = scn.nextDouble();
    				System.out.print("Ingrese el precio: ");
    				precio = scn.nextDouble();
    				pr.terrenos[fila][columna] =new Terreno(largo, ancho, precio);
    				System.out.println("TErreno Vendido!\n");
    			}else{
    				System.out.println("Terreno ya esta ocupado!");
    			}
    			}else{
    				System.out.println("Coordenadas invalidas");
    			}
    			
    			break;
    		
    		case 2:
    			System.out.print("1. Ver cantidad de terrenos ocupados\n"
    					+ "2. Total de ganancias en terrenos ocupados\n"
    					+ "3. Ver cantidad de terrenos vacios\n"
    					+ "Ingrese lo que quiere hacer: ");
    			j = scn.nextInt();
    			switch(j){
    			case 1:
    				System.out.println("Cantidad de terrenos ocupados: "+pr.totalTerrenosOcupados());
    				break;
    				
    			case 2:
    				System.out.println("Total ganancias: "+pr.totalTotal());
    				break;
    				
    			case 3:
    				System.out.println("Total de terrenos vacios: "+pr.totalTerrenosVacios());
    				break;
    			
    			
    			}
    			
    			break;
    			
    		case 3:
    			System.out.println("Has salido del Menu!");
    			break;
    		
    		
    		
    		
    		
    		}
    		
    		
    		
    	}while(i != 3);
    	
    	

    	
    }
    
}
