package Vectores;

public class vectores {

    public static void main(String[] args) {
       p1a();
       p1b();
       p1c();
       p2();
       p3();
       p4();
       p5();
       p6();
       p7();
       p8();
       p9();
       p10();
       p11();
       p12();
       p13();
       p14();
       p15();
       p16();
       p17();
       p18();
       p19();
       p20();
       p21();
       p22();
       p23();
       p24();
       p25();
       p26();
    }

    public static void p1a() {
        System.out.println("Problema 1 Indicar que escribirán los 3 programas que se dan acontinuación:");
        int t[];
        int i, suma;
        t = new int[7];
        i = 0;
        while (i < 7) {
            t[i] = 1 % 2;
            i = i + 1;
        }
        suma = 0;
        for (i = 0; i < 7; i = i + 2) {
            suma = suma + t[i];
        }
        System.out.println(suma);
    }
    public static void p1b() {
        System.out.println("Problema 1 Indicar que escribirán los 3 programas que se dan acontinuación:");
        int t[] = new int[5];
        int i, suma;
        for (i = 0; i <= 4; i++) {
            if (i % 2 == 0) {
                t[i] = i;
            } else {
                t[i] = 2 * i;
            }
        }
        i = 0;
        suma = 0;
        while (!(i == 4)) {
            suma = suma + t[i];
            i++;
        }
        System.out.println(suma);
    }
    public static void p1c() {
        System.out.println("Problema 1 Indicar que escribirán los 3 programas que se dan acontinuación:");
        int t1[], t2[];
        int i;
        t1 = new int[4];
        t2 = new int[10]:
        for (i = 0; i <= 9; i++) {
            t2[i] = 0;
        }
        t1[0] = 1;
        for (i = 1; i <= 3; i++) {
            t1[i] = i + t1[i - 1];
        }
        for (i = 0; i <= 3; i++) {
            t2[t1[i]] = 2 * 1;
        }
        for (i = 0; i <= 9; i++) {
            System.out.println(t2[i] + " ");
        }
    }
    public static void p2() {
        System.out.println("Problema 2 a) Cuando el programa llegue al punto marcado con el comentario //Punto 1: ");
        int tEnteros[];
        double tReales[];
        int indx;
        tReales = new double[8];
        tEnteros = new int[4];
        indx = 0;
        while (indx < tReales.length) {
            tReales[indx] = 10.0 * indx;
            indx = indx + 1;
        }
        for (indx = 0; indx <= tEnteros.length - 1; indx++) {
            tEnteros[indx] = 2 * indx + 1;
        }
        indx = 1;
        while (indx < tEnteros.length - 1) {
            tEnteros[indx] = tEnteros[indx] - 1;
            indx++;
        }
        //PUNTO 1 //
        for (indx = 0; indx < tEnteros.length; indx = indx + 2) {
            tReales[tEnteros[indx]]++;
        }
        for (indx = 1; indx < tEnteros.length; indx = indx + 2) {
            tReales[tEnteros[indx]]--;
        }
        //PUNTO2//
    }
    public static void p3() {
        System.out.println("Problema 3 Dado el siguiente programa:  ");
        int tInt[], tSelec[];
        int i, j;
        tInt = new int[10];
        tSelec = new int[5];
        for (i = 0; i < tInt.length; i++) {
            tInt[i] = 2 * i;
            if (i % 2 == 1)
                tInt[i]++;
        }
        i = 1;
        j = 0;
        while (i <= tInt.length) {
            tSelec[j] = tInt[i];
            i = i + 2;
            j = j + 1;
        }
        //PUNTO1
        tSelec[tInt[2]]++;
        tSelec[tSelec[0]]++;
        //PUNTO2
    }
    public static void p4() {
        System.out.println("Problema 4 Escribe un programa que dados dos vectores de componentes reales y longitud N, calcule el producto  escalar.  Recordad  que  el  producto  escalar de  (x1,  x2, xn)  y  (y1,  y2,..., yn) es  x1y1+ x2y2+...+ xnyn (suma de los productos de las componentes). ");
        System.out.println("Notas:  primero  pedir  los valores  de  las  componentes  del  primer  vector  y  después  las  del segundo vector. Las componentes serán dadas ordenadamente.");
        System.out.println("Reflexionad  sobre  la  necesidad  de  utilizar  vectores  para  resolver  este  problema.  Si  no  se  nos pidiera  que  primero  se  obtuvieran  las  componentes  del  primer  vector  y después  las  del segundo, y lo pudiésemos hacer de otra manera, ¿sería necesario utilizar tablas?  ");
    }
    public static void p5() {
        System.out.println("Problema 5 Escribe  un  programa  que  dados  dos  vectores  de  componentes  reales,  de  la  misma longitud, calcule su producto escalar. Asumid que ambos vectores están completamente llenos y que, por lo tanto, se puede consultar su atributo length para conocer la longitud.");
    }
    public static void p6() {
        System.out.println("Problema 6 Escribe  un  programa  que  dado  un  vector  de  números  reales  (se  puede  consultar  su  atributo length) y un valor real v, determine si este valor aparece o no en el vector.");
    }
    public static void p7() {
        System.out.println("Problema 7 Escribe  un  programa  que  dado  un  vector  de  enteros  totalmente  lleno  (se  puede  consultar  su atributo  length)  calcule  la  suma  de  las  componentes  que  son  estrictamente superiores  a  la última (que ocupa la posición length-1)");
    }
    public static void p8() {
        System.out.println("Problema 8 Escribe un programa que dados dos vectores de enteros de la misma longitud y totalmente llenos determine si son o no idénticos. ");
    }
    public static void p9() {
        System.out.println("Problema 8 Escribe un programa que dados dos vectores de enteros de la misma longitud y totalmente llenos determine si son o no idénticos. ");
    }
    public static void p10() {
        System.out.println("Problema 10 Escribe una función que dada una matriz cuadrada y de componentes enteros, un número entero N  que  indica  la  dimensión  de  la  tabla  (será  NxN)  y un  valor  entero  f,  calcula  la  suma  de  los valores que componen la f-esima fila de la matriz. ");
    }
    public static void p11() {
        System.out.println("Problema 11 Igual que el problema anterior pero cambiando f por c y calculando los valores que componen la c-esima columna de la matriz. ");
    }
    public static void p12() {
        System.out.println("Problema 12 Escribe  una  función  que  dada  una  matriz  cuadrada  de  componentes  enteros,  y un  número entero N que indica la dimensión de la tabla (será NxN) calcule la suma de los valores de la diagonal  principal  de  esta  (la  diagonal  principal  es  la  que  va  del  rincón  superior  izquierdo  al rincón inferior derecho)  ");
    }
    public static void p13() {
        System.out.println("Problema 13 Igual que en el problema anterior pero para la otra diagonal (la que va del rincón superior derecho al rincón inferior izquierdo). ");
    }
    public static void p14() {
        System.out.println("Problema 14 Se dice que una matriz cuadrada es mágica cuando todas las filas, todas las columnas y las  dos  diagonales  suman  lo  mismo.  Diseñad  una  función  para determinar  si  una  matriz cuadrada  es  mágica  o  no.  Utilizad  las  funciones  de los  ejercicios  anteriores.  La  función recibirá  como  parámetros  la  matriz  y  un  entero  que indique  la  dimensión.  El  siguiente  es  un ejemplo de matriz mágica de 5x5. ");
    }

    public static void p15(){
        System.out.println("Problema 15 Escribe  el  código  de  una  función  que  dada  una  tabla  de enteros llena (con  todas  las  posiciones inicializadas)  indique  si  el  primer  elemento  (aquel  que  hay  en  la  componente  de  índice  0)  se encuentra repetido o no.");
        System.out.println("private static boolean serepiteElPrimero(int [] taula){");
    }
    public static void p16(){
        System.out.println("Problema 16 Haz un programa que lea una línea de texto, y nos diga el número de vocales que contiene.");
    }
    public static void p17(){
        System.out.println("Problema 17 Haz un programa que lea una línea de texto, y nos diga la primera posición en que aparece la letra “s” o “no aparece” en caso de que no haya ninguna ");
    }
    public static void p18(){
        System.out.println("Problema 18 Haz un programa que lea una línea de texto, y la devuelva sustituyendo todas las “a” por “e”, las “e” por “i”, las “i” por “o” y las “o” por “u”.");
    }
    public static void p19(){
        System.out.println("Problema 19 Haz  un  programa  que  lea  una  serie  de  nombres  separados  por  comas,  de  la  siguiente  manera: Pedro, marta, javier, sonia.... Y que nos genere un array de Strings con todos los nombres, uno en cada posición del array. ");
    }
    public static void p20(){
        System.out.println("Problema 20 Lee una línea de texto, y muestra solo el trozo que haya entre el carácter 5 y el 10. Si no es tan grande, avisa al usuario de que no puede realizarse. ");
    }
    public static void p21(){
        System.out.println("Problema 21 Lee  10  frases  del  teclado,  que  guardarás  en  una  sola  variable  de  tipo  StringBuilder.  Después, reemplaza todas las vocales por el símbolo $ y dale la vuelta al resultado final. ");
    }
    public static void p22(){
        System.out.println("Problema 22 Lee 10 números dentro de un array tipo int, y muestra el número mayor de la serie.  ");
    }
    public static void p23(){
        System.out.println("Problema 23 Amplía el ejercicio anterior, y calcula también la suma total. ");
    }
    public static void p24(){
        System.out.println("Problema 24 Lee 9 números por teclado y guárdalos en una matriz de 2 dimensiones de 3x3. Usa para ello 2 bucles for anidados. ");
    }
    public static void p25(){
        System.out.println("Problema 25 Haz un programa que lea una fecha por teclado, y nos indique los días que faltan (o que han pasado) hasta la fecha actual. Utiliza para ello la clase Calendar.");
    }
    public static void p26(){
        System.out.println("Problema 26 Tendrás que hacer un programa que te pida dos fechas, y te muestre el intervalo en días entre ambas. Comprueba que la primera fecha sea anterior a la segunda. Para realizar este programa utiliza  las  clases  Date  y  Calendar.  También  crea  un  paquete  llamado  fecha  que  contenga  una clase  llamada  ControlDeFecha,  esta  clase  debe  albergar  un  método  llamado  getDias()  que devolverá el número de días entre dos fechas, usa este método en el programa. ");
    }
}