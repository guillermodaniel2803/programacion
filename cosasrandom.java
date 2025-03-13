public class cosasrandom {
    public static void main(String[] args) { 
    System.out.println("cosastorandom...."); 
     String nombre = "Pepe"; //Pepe
     String apellidos = "Martínez García"; //Martínez García
     String nombreCompleto = nombre + apellidos; //PepeMartínez García
    int longitud = nombre.length(); //4
    int longitud2 = "245".length(); //3
     char letra = apellidos.charAt(3); //t
     String cadena1 = nombreCompleto.substring(0,4); //Pepe
     String cadena2 = " Hola ".trim(); //Hola
    String cadena3_1 = cadena1.substring(3,4); //e
    String cadena3_2 = cadena1.substring(3,3); //
     String cadena3_3 = cadena1.substring(4,3); //ERROR
    String cadena4 = (cadena2 + "Hola").toLowerCase(); //holahola
     int posicion1 = cadena4.indexOf("o"); //1
    int posicion2 = cadena4.indexOf("hola"); //0
     int posicion3 = cadena4.indexOf("Hola"); //-1
        
    }
}
