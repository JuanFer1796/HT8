/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.PriorityQueue;

/**
 *
 * @author Melvin Garcia
 */
public class ColaPacientes {
    PriorityQueue pacientes = new PriorityQueue();
    PriorityQueue<Integer> pacienteUrgente = new PriorityQueue<Integer>();

    //METODO PARA INSERTAR 
    public void insertar(int valor){
        pacientes.add(valor);
    }

    //METODO PARA ELIMINAR 
    public int eliminar (){
        int indice;
        indice = (int) pacientes.peek();
        pacientes.remove();
        return indice;

    }

    //MÉTODO PARA VERIFICAR SI ESTÁ VACÍA
    public boolean esVacia(){
        if (pacientes.size() <= 0){
            System.out.println("La lista de pacientes es: " + pacientes);
            esVaciaUrgencias();
            return true;
        }
        else{
            System.out.println("La lista de pacientes es: " + pacientes);
            esVaciaUrgencias();
            return false;
        }

    }


    /***** LO NUEVO PARA AGREGAR URGENCIAS***/
    //METODO PARA CREAR UNA NUEVA COLA DE URGENCIA
    public void urgenciaPaciente(int nuevo){
        pacienteUrgente.add(nuevo);
        System.out.println(pacienteUrgente);
    }

    //ELIMINAR PACIENTE DE LA URGENCIA
    public int eliminarPacienteUrgente(){
        int indice;
        indice = (int) pacienteUrgente.peek();
        pacienteUrgente.poll();
        return indice;
    }

    //MÉTODO QUE VERIFICA SI ESTÁ VACIA LA URGENCIA
    public boolean esVaciaUrgencias(){
        if (pacienteUrgente.size() <= 0){
            System.out.println("La lista de pacientes urgente es: " + pacienteUrgente);
            return true;
        }
        else{
            System.out.println("La lista de pacientes urgente es: " + pacienteUrgente);
            return false;
        }
    }

}
