package lotificadora;

import java.util.Scanner;

public class Proyecto_Lotificacion {
	Scanner scn = new Scanner(System.in);
	public static Terreno[][] terrenos;
	static int totalTotal = 0, totalOcupadas = 0, totalVacios = 0;
	
	
	public Proyecto_Lotificacion(){
		terrenos = new Terreno[5][5];
	}
	
	public static boolean reservarTerreno(int fila, int columna){
		if(terrenos[fila][columna] != null){
		if(terrenos[fila][columna].isOcupado() == true){
			return false;
		}else{
			terrenos[fila][columna].setOcupado(true);
			return true;
		}
		}else{
			return true;
		}
	}
	
	public static int totalTerrenosOcupados(){
		totalOcupadas = 0;
		for(int i = 0; i < terrenos.length; i++){
			for (int j = 0; j < terrenos.length; j++) {
				if(terrenos[i][j] != null){
					if(terrenos[i][j].isOcupado() == true){
						totalOcupadas++;
					}
				}
			}
		}
		return totalOcupadas;
		
	}
	
	public static int totalTerrenosVacios(){
		totalVacios = 0;
		for(int i = 0; i < terrenos.length; i++){
			for (int j = 0; j < terrenos.length; j++) {
				if(terrenos[i][j]== null){
					
						totalVacios++;
					
				}
			}
		}
		return totalVacios;
		
	}
	
	public static int totalTotal(){
		totalTotal = 0;
		for(int i = 0; i < terrenos.length; i++){
			for (int j = 0; j < terrenos.length; j++) {
				if(terrenos[i][j] != null){
					if(terrenos[i][j].isOcupado() == true){
						totalTotal += terrenos[i][j].getPrecioTotal();
					}
				}
			}
		}
		return totalTotal;
	}
	
}
