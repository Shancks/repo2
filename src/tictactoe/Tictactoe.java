/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author alumnot
 */

import java.util.Scanner;

/**
 *
 * @author Shancks
 */
public class Tictactoe {
    public static void main(String[] args) {        
        Scanner reader=new Scanner(System.in);        
        char [][] matriz={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        char jugador ='O';        
        int contador=0,posicionX,posicionY;
        boolean ganador=false;
        int turno;
        do{
            turno=0;
            if(jugador=='O')
                jugador='X';
            else{
                jugador='O';
            }
            System.out.println("Ingrese una posicion X_");        
            posicionX=reader.nextInt();
            System.out.println("Y_");        
            posicionY=reader.nextInt();                                 
            turno++;

                //posicion valida
            if((posicionX>0||posicionX<3)||(posicionY>0||posicionY<3)){
                //posicion no ocupada
                if(matriz[posicionX][posicionY]=='O'||matriz[posicionX][posicionY]=='X')               
                    System.out.println("la posicion ingresada es invalida");                       
                
                //mostrar matriz
            else{
                matriz[posicionX][posicionY]=jugador;
                for(int x=0;x<matriz.length;x++){
                    for(int y=0;y<matriz[x].length;y++){
                        System.out.print(matriz[x][y]+"|");
                    }
                    System.out.println("\n------");
                }
                if(jugador=='X'){
                System.out.println("Es el turno "+turno+" del jugador O");
                }
                else{
                System.out.println("Es el turno "+turno+" del jugador X");
                    
                }
                //revisar que gano en --->
                for(int x2=0;x2<matriz.length;x2++){
                   for(int y2=0;y2<matriz[x2].length;y2++){
                        if(matriz[x2][y2]==jugador)
                        contador++;                                
                   }
                   if(contador>3)
                        contador=0;
                }
                if(contador==3)
                    ganador=true;           
                }
            
                 
            }            
        }while(ganador==false||turno>9);
        if (ganador ==true){
            System.out.println("Empate");
        }
        else{
            System.out.println("el ganador es el jugador"+jugador);
        }
    }      
}

