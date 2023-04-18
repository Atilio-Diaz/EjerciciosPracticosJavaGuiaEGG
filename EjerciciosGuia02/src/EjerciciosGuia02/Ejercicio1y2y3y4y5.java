package EjerciciosGuia02;
public class Ejercicio1y2y3y4y5{
    public static void main(String[]args){
        String nombre="Aprendiz",nombre_dos="APRENDIZ",saludo="Hola mundo",dia="15";
        byte guia=2;
        short curso=2;
        int año=2023;
        long mes=3;
        float divicion;
        double divicion_dos;
        boolean resultado;
        char signo='@';
        resultado=año!=2022;
        divicion=año/2021;
        divicion_dos=divicion/mes;
        System.out.println("El nombre es: "+nombre);
        System.out.println("El año de cursado es: "+año);
        System.out.println("El mes es: "+mes);
        System.out.println("La fase de cursado es : "+curso);
        System.out.println("La guia en la que va es : "+guia);
        System.out.println("Una dato float es : "+divicion);
        System.out.println("Una dato double es : "+divicion_dos);
        System.out.println("Und dato char es : "+signo);
        System.out.println("¿Esta aprendiendo? : "+resultado);
        System.out.println("");
        System.out.println("");
        //METODOS String
        System.out.println("Metodo de string charAt "+saludo.charAt(guia)); //RETORNA EL CARACTER ESPECIFICADO EN LA POSICION CON EL NUMERO ENTERO
        System.out.println("Metodo de string equals "+nombre.equals("Maestro")); //COMPARA SI DOS CADENAS SON IGUALES.DEVUELVE TRUE SI SON IGUALES Y FALSE SI NO
        System.out.println("Metodo de string equalsIgnoreCase "+nombre.equalsIgnoreCase(nombre_dos));//COMPARA SI DOS CADENAS SON IGUALES,IGNORANDO LAS MAYUSCULAS.DEVUELVE TRUE SI SON IGUALES Y FALSE SI NO.
        System.out.println("Metodo de string compareTo "+nombre.compareTo(nombre_dos)); //COMPARA DOS CADENAS DE CARACTERES ALFABETICAMENTE.RETOMA CERO SI SON IGUALES,ENTERO NEGATICO SI LA PRIMERA ES MENOR O ENTERO POSITIVO SI LA PRIMERA ES MAYOR
        System.out.println("Metodo de string concat "+nombre.concat(saludo)); //CONCATENA LA CADENA DEL PARAMETRO AL FINAL DE LA PRIMERA CADENA
        System.out.println("Metodo de string contains "+nombre.contains("@")); //RETORNA TRUE SI LA CADENA CONTIENE LA SECUENCIA TIPO CHAR DEL PARAMETRO
        System.out.println("Metodo de string endsWith "+saludo.endsWith("ndo")); //Retorna verdadero si la cadena es igual al objeto del parámetro
        System.out.println("Metodo de string indexOf "+saludo.indexOf("mundo")); //RETOMA EL INDICE DE LA PRIMERA OCURRENCIA DEL PARAMETRO DEVUELVE EN ENTERO
        System.out.println("Metodo de string lastIndexOf "+saludo.lastIndexOf("mundo")); //RETOMA EL INDICE DE LA ULTIMA OCURRENCIA DEL PARAMETRO DEVUELVE EN ENTERO
        System.out.println("Metodo de string isEmpty "+saludo.isEmpty()); //RETOMA VERDADERO SI LA LONGITUD DE LA CADENA ES CERO
        System.out.println("Metodo de string length "+saludo.length()); //RETOMA LA LOGITUD DE LA CADENA EN ENTERO
        System.out.println("Metodo de string replace "+saludo.replace("n","")); //RETOMA UNA NUEVA CADENA REMPLAZANDO LOS CARACTERS DEL PRIMER PARAMETRO CON EL DEL SEGUNDO PARAMETRO
        System.out.println("Metodo de string split "+saludo.split(" ")); //RETOMA UN ARREGLO DE CADENAS SEPARADAS POR LA CADENA DEL PARAMETRO
        System.out.println("Metodo de string startsWith "+saludo.startsWith("hol")); //RETORNA VERDADERO SI EL COMIENZO DE LA CADENA ES IGUAL AL PREFIJO DEL PARAMETRO
        System.out.println("Metodo de string substring "+saludo.substring(0,5)); //RETORNA LA SUB CADENA DESDE EL CARACTER DEL PRIMER PARAMETRO HASTA EL CARACTER DEL SEGUNDO PARAMETRO
        System.out.println("Metodo de string toCharArray "+saludo.toCharArray()); //RETORNA EL CONJUNTO DE CARACTERES DE LA CADENA
        System.out.println("Metodo de string toLowerCase "+nombre_dos.toLowerCase()); //RETORNA LA CADENA EN MINUSCULAS
        System.out.println("Metodo de string toUpperCase "+nombre.toUpperCase()); //RETORNA LA CADENA EN MAYUSCULAS
        System.out.println("CONVERSOR "+String.valueOf(año)+" se comvirtio de dato entero a cadena"); //COMBIERTE UN ENTERO EN CADENA
        System.out.println("CONVERSOR "+Integer.parseInt(dia)+" se comvirtio de dato cadena a entero"); //COMBIERTE UNA CADENA EN ENTERO
        System.out.println("");
        System.out.println("");
        // METODOS Math
        System.out.println("Metodo abs absoluto "+Math.abs(divicion_dos)); //DEVUELVE EL VALOR ABSOLUTO DE UN VALOR DOUBLE INTRIDUCIDO COMO PARAMETRO
        System.out.println("Metodo max "+Math.max(10,17)); //DEVUELVE EL MAYOR DE DOS VALORES
        System.out.println("Metodo min "+Math.min(10,17)); //DEVUELVE EL MENOR DE DOS VALORES
        System.out.println("Metodo pow potencia "+Math.pow(2,3)); //DEVUELVE EL VALOR DEL PRIMER ARGUMENTO ELEVADO A LA POTENCIA DEL SEGUNDO ARGUMENTO
        System.out.println("Metodo random "+Math.random()); //DEVUELVE UN DOUBLE CON UN SIGNO POSITIVO ,MAYOR O IGUAL QUE 0.0 Y MENOR QUE 1.0
        System.out.println("Metodo round "+Math.round(divicion_dos)); //DEVUELVE EL LONG REDONDEADO MAS CERCANO AL DOUBLE INTRODUCIDO
        System.out.println("Metodo sqrt "+Math.sqrt(divicion_dos)); //DEVUELVE LA RAIZ CUADRADA POSITIVA CORRECTAMENTE REDONDEADA DE UN DOUBLE
        System.out.println("Metodo floor "+Math.floor(divicion_dos)); //DEVUELVE EL ENTERO MAS CERCANO POR DEBAJO
        System.out.println("Metodo random entero "+(int)(Math.random()*10)); //GENERA UN NUMERO RANDOM ENTERO ENTRE 0 Y 10
    } 
}
