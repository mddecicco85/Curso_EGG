/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahor = new Ahorcado();
    String[] estado;
    
    //AL PARECER, PRIMERO SE PONEN LOS METODOS QUE NO TIENEN PARAMETROS
    public void juego() {
        crearJuego();
        longitud(ahor);
        do {
            encontradas(ahor);
            for (int i = 0; i < ahor.getPalabra().length ; i++) {
                System.out.print(estado[i]);
            }
            System.out.println("");
            intentos(ahor);
        } while ((ahor.getJugadasMaximas() > 0) && (ahor.getCantidadEncontradas() != ahor.getPalabra().length));
        if (ahor.getCantidadEncontradas() == ahor.getPalabra().length) {
            System.out.println("Adivino la palabra");
        } else {
            System.out.println("Se acabaron los intentos");
        }
    }
    
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String p = leer.next().toLowerCase();  //La paso a minuscula
        int tam = p.length();
        //Ahorcado ahor = new Ahorcado(tam);  //Le paso el tamaño a la clase
        String[] v = new String[tam];  //Creo un vector auxiliar
        for (int i = 0; i < tam; i++) {
            v[i] = p.substring(i, i+1);
        }
        ahor.setPalabra(v);  //Igualo el vector v al vector palabra
        System.out.println("Ingrese la cantidad maxima de intentos");
        ahor.setJugadasMaximas(leer.nextInt());
        //leer.nextLine();
        return ahor;
    }
    
    public void longitud(Ahorcado ahor) {
        System.out.println("La palabra tiene " + ahor.getPalabra().length + " letras");
        //for (int i = 0; i < ahor.getPalabra().length; i++) {
        //    System.out.print("_ ");
        //}
        estado = new String[ahor.getPalabra().length];
        for (int i = 0; i < ahor.getPalabra().length; i++) {
            estado[i] = "_ ";
            System.out.print(estado[i]);
        }
        System.out.println("");
    }
    
    public boolean buscar(Ahorcado ah) {
        boolean bandera = false;
        System.out.println("Ingrese una letra para buscar");
        String letra = leer.next();
        boolean yaEsta = false;
        int j = 0;
        do {
            //System.out.println(j);
            //System.out.println(yaEsta);
            if (estado[j].equalsIgnoreCase(letra + " ")) {
                yaEsta = true;
                System.out.println(yaEsta);
            }
            j = j+1;
        } while ((j < ah.getPalabra().length) && (yaEsta == false));
        //System.out.println(yaEsta);
        if (yaEsta == false) { //Si la letra no fue adivinada, prosigue
            int cant = 0;  //Trae problemas que se ponga en 0 con cada intento
            for (int i = 0; i < ah.getPalabra().length; i++) {
                if (ah.getPalabra()[i].equals(letra)) {  //Tomo la componente i del vector palabra
                    cant++;
                    estado[i] = letra.toUpperCase() + " ";
                    //ah.setCantidadEncontradas(ah.getCantidadEncontradas() + 1);
                    //Aumento la cantidad de encontradas. SUMO cant en vez de asignarlo porque cant vuelve a 0 con cada intento
                }
            }
            ah.setCantidadEncontradas(ah.getCantidadEncontradas() + cant);
            //Esto se pone si no sumo de a 1 en cada paso
            if (cant != 0) {
                System.out.println("La letra fue encontrada");
                bandera = true;
            } else {
                System.out.println("La letra no fue encontrada");
                bandera = false;
            }
        } else {
            System.out.println("Ya ha acertado esa letra");
            bandera = true;
        }
        return bandera;
    }
   
    public boolean encontradas(Ahorcado ah) {
        boolean estaba;
        int quedan;
        int intentos = ah.getJugadasMaximas();
        if (buscar(ah)) {  //Si es true es que la letra estaba
            System.out.println("La cantidad de letras encontradas es " + ah.getCantidadEncontradas());
            //Toma el valor de las encontradas del metodo buscar
            quedan = ah.getPalabra().length - ah.getCantidadEncontradas();
            System.out.println("Le faltan " + quedan + " letras");
            estaba = true;
        } else {
            intentos = ah.getJugadasMaximas() - 1;
            ah.setJugadasMaximas(intentos);  //Lo asigno en la misma variable (NO SE SI LO PEDIA ASI)
            estaba = false;
        }
        return estaba;
    }
    
    public void intentos(Ahorcado ah) {
        System.out.println("Le quedan " + ah.getJugadasMaximas() + " intentos");
    }
    
}
