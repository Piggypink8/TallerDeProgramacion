/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parcial7Objetos;

/**
 *
 * @author Sandra
 */
public class Parcial7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema agenda = new Sistema();
        
        Paciente p1 = new Paciente("Juan",true,100.00);
        Paciente p2 = new Paciente("Pedro",true,100.00);
        Paciente p3 = new Paciente("Sara",true,100.00);
        Paciente p4 = new Paciente("Maria",true,100.00);
        Paciente p5 = new Paciente("Lucas",true,100.00);
        Paciente p6 = new Paciente("Florencia",true,100.00);
        Paciente p7 = new Paciente("Morena",true,100.00);
        Paciente p8 = new Paciente("Carlos",true,100.00);
        
        agenda.agregarPaciente(p1, 0, 0);
        agenda.agregarPaciente(p2, 1, 0);
        agenda.agregarPaciente(p3, 2, 0);
        agenda.agregarPaciente(p4, 0, 1);
        agenda.agregarPaciente(p5, 2, 1);
        agenda.agregarPaciente(p6, 0, 3);
        agenda.agregarPaciente(p7, 1, 4);
        agenda.agregarPaciente(p8, 2, 5);
        System.out.println(agenda.tieneTurnoAgendado(p8, 5));
        agenda.liberarPaciente(p8); // eliminar a carlos 
        System.out.println(agenda.toString());
    }
    
}
