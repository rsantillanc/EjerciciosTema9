package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("--------------------------------------");
        Cliente cliente = new Cliente();
        cliente.setNombre("Renzo Cliente");
        cliente.setEdad((byte) 33);
        cliente.setTelefono("999999999");
        cliente.setCredito("S/ 33,000");
        System.out.println("Cliente - nombre: "+cliente.getNombre());
        System.out.println("Cliente - edad: "+cliente.getEdad());
        System.out.println("Cliente - telefono: "+cliente.getTelefono());
        System.out.println("Cliente - credito: "+cliente.getCredito());
        System.out.println("--------------------------------------");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Renzo Trabajador");
        trabajador.setEdad((byte) 33);
        trabajador.setTelefono("666665555");
        trabajador.setSalario("S/ 12,000");
        System.out.println("Trabajador - nombre: "+trabajador.getNombre());
        System.out.println("Trabajador - edad: "+trabajador.getEdad());
        System.out.println("Trabajador - telefono: "+trabajador.getTelefono());
        System.out.println("Trabajador - salario: "+trabajador.getSalario());
        System.out.println("--------------------------------------");
    }
}
