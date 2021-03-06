/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author javier
 */
public class ClaseString {
    public static void main(String[] args) {
        
        String s = "iesmardealboran.com";
        
        // Tamaño de la cadena
        System.out.println("Tamaño: "+s.length());
        
        // Obtener el char de una posición concreta
        System.out.println("Char de la posición 5: "+s.charAt(5));
        
        // Obtener subcadena desde el carácter i-ésimo hasta el final de
        // la cadena
        String subcadena = s.substring(3);
        System.out.println("Subcadena = "+subcadena);
        
        // Obtener subcadena desde el carácter i-ésimo hasta el caracter
        // j-ésimo de la cadena        
        subcadena = s.substring(8,15);
        System.out.println("Subcadena = "+subcadena);
        
        // Concatenar cadenas. Equivale al operador +
        String s1 = "ies";
        String s2 = "mardealboran.com";
        String nuevo = s1+s2;
        String nuevo2 = s1.concat(s2);
        
        System.out.println("Nuevo: "+nuevo);
        System.out.println("Nuevo2: "+nuevo2);
        
        // Devuelve el indice dentro de la cadena de la primera aparicion 
        // de la cadena a buscar 
        int indice = nuevo.indexOf("alboran");
        System.out.println("Indice: "+indice);
        
        indice = nuevo.indexOf("ran", 10);
        System.out.println("Indice: "+indice);
        
        // Métodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java: "+"Java".equals("java"));
        System.out.println("Igualdad Java y java: "+"Java".equalsIgnoreCase("java"));
        
        // Comparación de cadenas (diccionario) Método compareTo()
        // Devuelve cero si las cadenas son iguales.
        // un negativo si s1 está antes en el diccionario(menor)
        // o un positivo si s1 está después de s2 (mayor)
        int compareTo = s1.compareTo(s1);
        System.out.println("Comparación de s1 y s1: "+compareTo);
        compareTo=s1.compareTo("aes");
        System.out.println("Comparación de s1 y aes: "+ compareTo);
        compareTo = "aes".compareTo(s1);
        System.out.println("Comparación de aes y s1: "+compareTo);
        
        // Conversión mayúsculas y mínusculas
        String mayusculas = s2.toUpperCase();
        System.out.println("s2 en mayus: "+mayusculas);
        System.out.println("String en mayusculas en minusculas: "+mayusculas.toLowerCase());
        
        // Quitar espacios delante y detrás
        String espacios = " palabra palabra ";
        System.out.println("Tamaño de espacios: "+espacios.length());
        String sinEspacios = espacios.trim();
        System.out.println("Tamañon de sinESpacios: "+sinEspacios.length());
        
        // Reemplazo de caracteres
        System.out.println("String original: "+s2);
        String str2 = s2.replace('a', 'x');
        System.out.println("String reemplazado: "+str2);
        
        // Contenido
        String aBuscar = "dealbo";
        System.out.println("¿Contiene "+ s2 +" la subcadena "+aBuscar+"? "+s2.contains(aBuscar));
        
        // Probar métodos endsWith, startsWith, isEmpty
        String end = "com";
        System.out.println("Termina con com?:"+end.endsWith(end));
        System.out.println("Empieza con com?: "+end.startsWith(end));
        System.out.println("Está vacio ?"+end.isEmpty());
        
        
        // Obtener un array de char de la cadena
        // Declaración de una variable array de tipo char
        char[] arrayChar;
        arrayChar = s2.toCharArray();
        // El atributo lenght existe en todos los arrays y nos indica su 
        // tamaño equivalente al método length() de los String
        for (int i = 0; i < arrayChar.length; i++) {
            // Para acceder a cada posición del array uso los corchetes
            System.out.println("Posición i= "+i+" contenido = "+arrayChar[i]);
            
        }
        
        
        
    }
    
}
