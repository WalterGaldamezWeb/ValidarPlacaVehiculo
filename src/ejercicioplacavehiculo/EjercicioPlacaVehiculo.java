/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioplacavehiculo;

/**
 *
 * @author Walter Gdmz
 */
public class EjercicioPlacaVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String placa = "abc123";
        int contarCaracteres=placa.length();
        String caracteres= "";
        String caracteresNum="";
        char caracter ;
        String caracterString = "";
        
        //Evalua si son 6 caracteres
        if(contarCaracteres == 6){
            
            //recorre los primeros 3 caracteres y revisa si son letras
            for(int i=0;i<3;i++){
                //almacena el caracter temporalmente                                
                caracter = placa.charAt(i);
                //convierte el caracter a String                
                caracterString= String.valueOf(caracter);
                //si es letra lo almacena a la variable caracteres
                if(isInteger(caracterString)==false){
                    caracteres = caracteres + placa.charAt(i);
                }else{
                    System.out.println("Placa Incorrecta");
                    break;
                }
            }//fin primer for
            
            //recorremos los ultimos 3 caracteres y revisa si son numeros
            for(int i=3;i<6;i++){
                caracteresNum = caracteresNum+placa.charAt(i);
                
                if (isInteger(caracteresNum)==false) {
                    System.out.println("Placa Incorrecta"); 
                    break;
                }
                
            }//fin segundo for        

        }else{
            System.out.println("La Placa es incorecta tiene mas digitos");
        }//fin if principal
            System.out.println("             ==============");
            System.out.println("La Placa es: =   "+placa+"   =");
            System.out.println("             ==============");
        
        }//fin metodo main

        //Metodo que valida si es Int Numero
        public static boolean isInteger(String source) { 
            if (source == null || source.isEmpty()) return false; 
            
            int index = 0; 
            
            while (index < source.length() && Character.isDigit(source.charAt(index))) { 
                index++; 
            }//fin while 
            
        return index == source.length();
        }//fin metodo isInteger       
    
}
