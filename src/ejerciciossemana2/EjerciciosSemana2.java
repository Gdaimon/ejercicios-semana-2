package ejerciciossemana2;

public class EjerciciosSemana2 {
    /*
    public static void main(String[] args) {
        System.out.println(10e8);
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 10e8; i++) {
        }
        long fin = System.currentTimeMillis();
        System.out.println("For i++: " + (fin - inicio));
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 10e8; ++i) {
        }
        fin = System.currentTimeMillis();
        System.out.println("For ++i: " + (fin - inicio));
    }
    */
    
    /*
    // Ejercicio 1
    public static void main(String[] args) {
        // Cree un programa en Java que le solicite al usuario un número entero
        // (NO COLOCAR MENSAJES DESCRIPTIVOS PARA LA SOLICITUD DE ESTE, O SU PROGRAMA
        // NO PASARÁ LOS TEST), luego calcule el factorial del número ingresado, y
        // como resultado muestre en la pantalla el factorial del número ingresado.
        // El programa debe mostrar como resultado exclusivamente el valor solicitado,
        // no debe contener letras ni enunciados que lo acompañen.
        
        Scanner scanner = new Scanner(System.in);
        long factorial = 1;
        int numero = scanner.nextInt();
        
        for(int index = 1; index<= numero; ++index) 
            //factorial = factorial * index;
            factorial *= index;
        
        System.out.println("Factorial de: " + numero + " es: " + factorial);
    } 
    */
    
    /*
    // Segundo
    public static void main(String[] args) {
        // La función sumaPares recibe como parámetro un vector de números enteros,
        // su trabajo será retornar la suma de los números PARES POSITIVOS que hay
        // en el vector dado.
        int[] vectorEntrada = {-8,5,2,7,8,6};
        System.out.println(sumaPares(vectorEntrada));        
    }
    
    public static int sumaPares(int[] vector) {
        int resultado = 0;
        for(int numero : vector){
            if(numero > 0 && numero % 2 == 0){
                resultado += numero;    
            }
        }
        
        // for(int indice = 0; indice < vector.length; indice++){
        //    int numero = vector[indice];
        //    if(numero > 0 && numero % 2 == 0){
        //        resultado += numero;    
        //    }
        // }
              
        return resultado;
    }  
    */
    
    /*
    // Ejercicio 3
    public static void main(String[] args) {
        // La función mean recibe como parámetro un vector de números enteros,
        // su trabajo será retornar la media aritmética (Promedio) de los números
        // que hay en el vector.
        int[] vectorEntrada = {-8, 11, 13, 79, -2, 1};
        System.out.println(mean(vectorEntrada));;
        
    }
    
    public static double mean(int[] vector) {
        int sumaTotal=0;
        for(int numero : vector){
            sumaTotal += numero;
        }
        double totalItems = vector.length;
        double promedio = sumaTotal / totalItems;
        return promedio;
        
        
        //int sumaTotal=0;
        //for(int numero : vector){
        //    sumaTotal += numero;
        //}
        //return sumaTotal / vector.length;
        
    }
    */
    
    /*
    // Ejercicio 4
    public static void main(String[] args) {
        // La función ordenamientoPersonalizado recibe como parámetro un vector
        // de números enteros de longitud PAR, su trabajo será retornar el vector
        // ordenado de la siguiente manera:

        // La primera mitad de los valores deben estar ordenados ascendentemente
        // La segunda mitad de los valores deben estar ordenados descendentemente
        int[] vectorEntrada = { 13, 23, 19, 709, 1003, 5, 7, 100 };
        
        
    }

    public static int[] ordenamientoPersonalizado(int[] vector) {
        
        int mitad = vector.length / 2;
        
        // lado Izquierdo
        for (int i = 0; i < mitad; i++) {
            for (int j = 1; j < mitad; j++) {
                int posicionAtras = vector[j-1];
                int posicionActual = vector[j];
                if(posicionAtras > posicionActual){
                    int posicionTemporal = posicionAtras;
                    vector[j-1] = vector[j];
                    vector[j] = posicionTemporal;
                }
            }
        }
        
        // Derecho
        for (int i = mitad; i < vector.length; i++) {
            for (int j = mitad+1; j < vector.length; j++) {
                int posicionAtras = vector[j-1];
                int posicionActual = vector[j];
                if(posicionAtras > posicionActual){
                    int posicionTemporal = posicionActual;
                    vector[j-1] = vector[j];
                    vector[j] = posicionTemporal;
                }
            }
        }
        return vector;
    }
    */
    
    /*
    // Ejercicio 5
    public static void main(String[] args) {
        // La función sumaVectorial recibe como parámetros dos vectores de números
        // enteros DE IGUAL LONGITUD (L), su trabajo será retornar un vector nuevo
        // de números enteros, que es el resultado de hacer la suma vectorial entre
        // los dos vectores recibidos como parámetro.
        
        int[] v1 = {-8, -11, -13, -79, -2, -1};
        int[] v2 = {-10, -100, -1, -1, -2, 0};
        // System.out.println(Arrays.toString(sumaVectorial(v1, v2)));
        
        int [] resultado = sumaVectorial(v1, v2);
        for (int i = 0; i < v1.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
        
        
    }
    
    public static int[] sumaVectorial(int[] v1, int[] v2) {
        int[] arregloFinal = new int[v1.length];
        
        for (int indice = 0; indice < v1.length; indice++) {
            int numeroUno = v1[indice];
            int numeroDos = v2[indice];
            int suma = numeroUno + numeroDos;
            arregloFinal[indice] = suma;
            
        }
        
        return arregloFinal;
    }
    */
    
    // Ejercicio 6
    public static void main(String[] args) {
    // La función join recibe como parámetro un vector de caracteres, su trabajo
    // será retornar una cadena de caracteres que es el resultado de concatenar
    // todos los caracteres del vector.
        char[] vector = {' ', 'P', 'r', 'o', ' ', 'g', 'r', 'a', ' ', 'm', 'a', 'r'};
        System.out.println(join(vector));
    }
    public static String join(char[] vector) {        
        String resultado ="";
        for(char caracter : vector){
            resultado +=caracter;
        }
        return resultado;
    }

}
