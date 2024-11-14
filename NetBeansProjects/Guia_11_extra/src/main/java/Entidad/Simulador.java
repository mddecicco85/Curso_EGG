/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
//import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Simulador {
    
    public ArrayList<String> nombres;
    public ArrayList<String> apellidos;
    
    public ArrayList<String> generaListado() {
        System.out.println("-----------------------------------------------------------");
        nombres = new ArrayList();
        apellidos = new ArrayList();

        nombres.add("Juan");
        nombres.add("José");
        nombres.add("Martín");
        nombres.add("Matías");
        nombres.add("Carlos");
        nombres.add("María");
        nombres.add("Carla");
        nombres.add("Julia");
        nombres.add("Sofía");
        nombres.add("Elena");
        nombres.add("Emilia");
        nombres.add("Victoria");
        nombres.add("Esteban");
        nombres.add("Máximo");
        nombres.add("Alejandro");
        
        System.out.println("Nombres:");
        System.out.println(nombres);
        System.out.println("-----------------------------------------------------------");
        //Collections.shuffle(nombres);  //Mezclo la lista. Con shuffle no puede salir nombre repetido
        //System.out.println(nombres);
        
        apellidos.add("Rodríguez");
        apellidos.add("Suárez");
        apellidos.add("García");
        apellidos.add("Gómez");
        apellidos.add("Fernández");
        apellidos.add("De Cicco");
        apellidos.add("Capul");
        apellidos.add("Ludovico");
        apellidos.add("Álvarez");
        apellidos.add("Rueda");
        apellidos.add("Brunetti");
        apellidos.add("Lanata");
        apellidos.add("Ayuso");
        apellidos.add("Correale");
        apellidos.add("Battista");
        
        System.out.println("Apellidos:");
        System.out.println(apellidos);
        System.out.println("-----------------------------------------------------------");
        //Collections.shuffle(apellidos);  //Mezclo la lista
        //System.out.println(apellidos);
        
        //ArrayList<Alumno> listado = new ArrayList();  //Con esto devolvia lista de Alumnos
        ArrayList<String> listado = new ArrayList();  //Va a devolver esta lista con los nombres completos
        
        //Esto era cuando devolvia lista de Alumnos
//        for (int i = 0; i < 15; i++) {
//            Alumno alum = new Alumno();
//            int n = (int) (Math.random()*15);  //Lo hago asi para que pueda salir repetido
//            String nom = nombres.get(n);
//            int a = (int) (Math.random()*15);  //Asi da entre 0 y 14
//            String ape = apellidos.get(a);
//            alum.setNombreCompleto(nom + " " + ape);
//            listado.add(alum);
//        }

        for (int i = 0; i < 15; i++) {
            int n = (int) (Math.random()*15);  //Lo hago asi para que pueda salir repetido
            String nom = nombres.get(n);
            int a = (int) (Math.random()*15);  //Asi da entre 0 y 14
            String ape = apellidos.get(a);
            String alum = nom + " " + ape;  //Armo el nombre completo
            listado.add(alum);
        }
        
        //System.out.println(listado);
        return listado;  //Devuelve lista con nombres completos
    }
    
    public ArrayList<Integer> generaDnis() {
        System.out.println("-----------------------------------------------------------");
        HashSet<Integer> dnis = new HashSet();  //Conviene usar Set porque no se puede repetir el DNI
        do {
            int doc = (int) (Math.random()*(60000000 - 10000000) + 10000000);  //Se pone Math.random()*(max - min) + min;
            dnis.add(doc);
        } while(dnis.size() < 15);  //Lo hago asi porque si da repetido no lo agrega al conjunto
        
        //System.out.println(dnis);
        ArrayList<Integer> listaDnis = new ArrayList(dnis);  //Lo convierto en lista para que este ordenado
        //System.out.println(listaDnis);
       
        
//        for (int i = 0; i < 15; i++) {
//            listado.get(i).setDNI(listaDnis.get(i));  //Asigno elemento a elemento por orden
//        }
        
        return listaDnis;        
    }
    
    public ArrayList<Alumno> asignaDnis(ArrayList<String> listado, ArrayList<Integer> listaDnis, int cant) {
        System.out.println("-----------------------------------------------------------");
        ArrayList<Alumno> alumnado = new ArrayList();
        for (int i = 0; i < cant; i++) {
            Alumno alum = new Alumno();
            alum.setNombreCompleto(listado.get(i));
            alum.setDNI(listaDnis.get(i));
            alumnado.add(alum);
        }
        return alumnado;  //Devuelve lista de alumnos
    }
    
    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnado) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Votaciones:");
        int n;
        ArrayList<Voto> listaVotos = new ArrayList();  //Aca voy a guardar los votos para luego sobreescribirlos
        
        for (int i = 0; i < alumnado.size(); i++) {  //i va a ser el alumno de la lista
            Voto v = new Voto();
            HashSet<Alumno> aux = new HashSet();  //Set auxiliar para guardar los votados
            //Conviene usar HashSet para que no vote repetido. Crear metodos Equals y HashCode en objeto Alumno
            
            v.setVotante(alumnado.get(i));  //Aca tengo el alumno que esta votando

            do {  //Aca sorteo los 3 votos. No pongo FOR porque, si sale repetido, no vota 3 veces
                do {
                    n = (int) (Math.random() * alumnado.size());
                } while (n == i);  //Esto es para que no pueda votarse a sí mismo
                aux.add(alumnado.get(n));  //Lo agrego al set auxiliar de votados
                //No lo toma como repetido porque la cantidad de votos cambia constantemente. Por ende NO es el mismo objeto. Lo voy a cambiar en los metodos.
                //alumnado.get(n).setCantidadVotos(alumnado.get(n).getCantidadVotos() + 1);  //Le sumo 1 al que votaron. LO SACO PORQUE TRAE PROBLEMAS
            } while(aux.size() < 3);
            System.out.println(aux);
            
            ArrayList<Alumno> listaux = new ArrayList(aux);  //Ahora que sé que no están repetidos, lo convieto en lista
            v.setVotados(listaux);  //Asigno la lista
            
            for (Alumno alumno : listaux) {  //Recorro la lista de los 3 votados
                for (Alumno eleve : alumnado) {  //Recorro la lista de todos los alumnos
                    if (alumno == eleve) {
                        eleve.setCantidadVotos(eleve.getCantidadVotos() + 1);  //Le sumo 1 al que votaron
                        break;
                    }
                }
            }
            
            listaVotos.add(v);  //Agrego el voto a la lista de votos
        }
        return listaVotos;
    }
    
    public void mostrarVotacion(ArrayList<Voto> listaVotos, ArrayList<Alumno> alumnado) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Estos son los alumnos con sus votos recibidos y entregados:");
        for (int i = 0; i < alumnado.size(); i++) {  //Recorro lista de alumnos
            System.out.println(listaVotos.get(i).getVotante());
            //System.out.println("Votos recibidos: " + alumnado.get(i).getCantidadVotos());
            System.out.println("Votos entregados: " + listaVotos.get(i).getVotados());
            System.out.println("---------------------------");
        }
    }
    
    public void recuentoDeVotos(ArrayList<Alumno> alumnado) {
        int total = 0;
        for (Alumno aux : alumnado) {
            total += aux.getCantidadVotos();
        }
        System.out.println("El recuento de votos da " + total + ".");
        System.out.println("---------------------------");
        if (total != alumnado.size()*3) {
            System.out.println("Hay un error en la votación.");
            System.out.println("---------------------------");
        }
    }
    
    public void desginaFacilitadores(ArrayList<Alumno> alumnado) {
        //alumnado.sort(Comparator.comparing(Alumno::getCantidadVotos));
        //alumnado.sort(Alumno.compararVotos);
        //HashSet<Alumno> students = new HashSet(alumnado);
        //Collections.sort(students);
        Collections.sort(alumnado, Comparator.comparing(Alumno::getCantidadVotos).reversed());  //Esto es para ordenar según valor int (primitivo)
        for (Alumno aux : alumnado) {
            System.out.println(aux);
        }
        //System.out.println(alumnado);
        System.out.println("---------------------------");
        
        if (alumnado.size() >= 10) {
            System.out.println("Estos son los 5 facilitadores:");
            for (int i = 0; i < 5; i++) {
                System.out.println(alumnado.get(i));
            }
            System.out.println("---------------------------");
            System.out.println("Estos son los 5 facilitadores suplentes:");
            for (int i = 5; i < 10; i++) {
                System.out.println(alumnado.get(i));
            }
        } else if ((alumnado.size() >= 5) && (alumnado.size() < 10)) {
            System.out.println("Estos son los 5 facilitadores:");
            for (int i = 0; i < 5; i++) {
                System.out.println(alumnado.get(i));
            }
            System.out.println("No hay suficientes alumnos para tener 5 facilitadores suplentes.");
        } else {
            System.out.println("No hay suficientes alumnos para tener 5 facilitadores.");
        }
        System.out.println("---------------------------");
    }
}
