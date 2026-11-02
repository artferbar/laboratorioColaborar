public class Main {
    public static void main(String[] args) {
        int opcion = Utiles.introducirNumero("Escribe un numero del 1 al 9 para elegir un ejercicio o 10 para salir: ");
        if(opcion < 1 || opcion > 9)
        {
            while(opcion < 1 || opcion > 10)
            {
                opcion = Utiles.introducirNumero("Error, escribe un numero entre el 1 y el 9: ");
            }
        }
        while(opcion != 10)
        {
            switch (opcion)
            {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
            }
            opcion = Utiles.introducirNumero("Escribe un numero del 1 al 9 para elegir un ejercicio o 10 para salir: ");
        }
    }
    public static void ejercicio1()
    {
        int numero = Utiles.introducirNumero("Introduce un numero: ");
        int multiplos = 0;
        for(int i = 1; i <= numero; i++)
        {
            multiplos += i % 3 == 0 ? 1 : 0;
        }
        Utiles.mostrar("La cantidad de multiplos de 3 es: " + multiplos);
    }
    public static void ejercicio2()
    {
        int numero = Utiles.introducirNumero("Introduce un numero: ");
        boolean primo = true;
        for(int i = numero; i >= 1 && primo; i--)
        {
            if(numero % i == 0 && i != numero && i != 1) primo = false;
        }
        Utiles.mostrar(primo ? (numero + " es primo") : (numero + " no es primo"));
    }
    public static void ejercicio3()
    {
        int numero = Utiles.introducirNumero("Escribe el numero inicial: ");
        int ultimoNumero = numero;
        int numeros = 0;
        int fallados = 0;
        while(numero != 0)
        {
            numero = Utiles.introducirNumero("Escribe un numero: ");
            if(numero < ultimoNumero && numero != 0)
            {
                Utiles.mostrar("Fallo, es menor");
                fallados++;
            }
            numeros++;
            ultimoNumero = numero;
        }
        Utiles.mostrar("Numeros introducidos: " + numeros + "\nNumeros fallados: " + fallados);
    }
    public static void ejercicio4()
    {
        int suma = 0;
        for(int i = 1; i <= 5; i++)
        {
            suma += i * i;
            Utiles.mostrar(i + " * " + i + " = " + i * i);
        }
        Utiles.mostrar("La suma de los cuadrados es: " + suma);
    }
    public static void ejercicio5()
    {
        int numero = Utiles.introducirNumero("Introduce un numero (escribe 0 para terminar): ");
        String asteriscos = "";
        while(numero != 0)
        {
            if(numero < 0) asteriscos = "*";
            else
            {
                for(int i = 1; i <= numero; i++)
                {
                    asteriscos += "*";
                }
            }
            Utiles.mostrar(asteriscos);
            asteriscos = "";
            numero = Utiles.introducirNumero("Introduce un numero (escribe 0 para terminar): ");
        }
    }
    public static void ejercicio6()
    {
        int numero = Utiles.introducirNumero("Introduce un numero entre 0 y 20: ");
        int n = 1;
        if(numero < 0 || numero > 20)
        {
            while(numero < 0 || numero > 20)
            {
                numero = Utiles.introducirNumero("Error, introduce un numero entre 0 y 20: ");
            }
        }
        for(int i = 0; i < numero; i++)
        {
            String numeros = "";
            for(int j = 1; j <= n; j++)
            {
                numeros += n;
            }
            n++;
            Utiles.mostrar(numeros);
        }
    }
    public static void ejercicio7()
    {
        int a = Utiles.introducirNumero("Escribe el primer numero: ");
        int b = Utiles.introducirNumero("Escribe el segundo numero (mayor que el anterior): ");
        int pares = 0;
        if(b <= a)
        {
            while(b <= a)
            {
                b = Utiles.introducirNumero("Error, b tiene que ser mayor que a, escribe otro numero: ");
            }
        }
        for(int i = a; i <= b; i++)
        {

            if(i % 2 == 0) pares++;
            Utiles.mostrar(String.valueOf(i));
        }
        Utiles.mostrar("La cantidad de pares es: " + pares);
    }
}