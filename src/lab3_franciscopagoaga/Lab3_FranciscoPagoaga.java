package lab3_franciscopagoaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_FranciscoPagoaga 
{
    public static void main(String[] args) 
    {
        int eliminar;
        ArrayList jugadores=new ArrayList();
        ArrayList<Equipo> equipos=new ArrayList();
        Scanner l=new Scanner(System.in);
        System.out.println("1. Agregar jugador");
        System.out.println("2. Editar jugador");
        System.out.println("3. Eliminar jugador");
        System.out.println("4. Agregar equipo");
        System.out.println("5. Eliminar equipo");
        System.out.println("6. Compras");
        System.out.println("7. Organizar equipos");
        System.out.println("8. Listar equipos");
        System.out.println("9. Listar jugadores");
        System.out.println("10. Salir");
        System.out.print("Que desea hacer? [1-10]: ");
        int opc=l.nextInt();
        while (opc<0|| opc>10)
        {
            System.out.print("Ingrese una opcion valida: ");
            opc=l.nextInt();
        }
        while(opc>0&& opc<10)
        {
            switch (opc)
            {
                case 1: 
                    System.out.print("Ingrese el nombre: ");
                    String nombre=l.next();
                    System.out.print("Ingrese apellido: ");
                    String apellido=l.next();
                    System.out.print("Ingrese edad: ");
                    int edad=l.nextInt();
                    System.out.print("Ingrese estado: ");
                    String estado=l.next();
                    System.out.print("Ingrese pais: ");
                    String pais=l.next();
                    System.out.print("Ingrese pie: ");
                    String pie=l.next();
                    System.out.print("Ingrese precio: ");
                    double precio=l.nextDouble();
                    System.out.println("1. Portero");
                    System.out.println("2. Defensa");
                    System.out.println("3. Medio");
                    System.out.println("4. Delantero");
                    System.out.print("Que posicion es el jugador? [1-4]: ");
                    int posicion=l.nextInt();
                    while (posicion<0|| posicion>10)
                    {
                        System.out.print("Ingrese una opcion valida: ");
                        opc=l.nextInt();
                    }
                    switch(posicion)
                    {
                        case 1: 
                            System.out.print("Ingrese nivel aereo: ");
                            int nivel_aereo=l.nextInt();
                            System.out.print("Ingrese nivel de pies: ");
                            int nivel_pies=l.nextInt();
                            jugadores.add(new Portero(nivel_aereo, nivel_pies, nombre, apellido, edad, estado, pais, pie, 0, precio, ""));
                            break;
                        case 2:
                            System.out.print("Ingrese nivel de agresividad: ");
                            int nivel_agresividad=l.nextInt();
                            System.out.print("Ingrese altura: ");
                            double altur=l.nextDouble();
                            System.out.print("Ingrese peso: ");
                            double peso=l.nextDouble();
                            System.out.print("Ingrese velocidad: ");
                            String velocida=l.next();
                            jugadores.add(new Defensa(nivel_agresividad, altur, peso, velocida, nombre, apellido, edad, estado, pais, pie, 0, precio, ""));
                            break;
                        case 3: 
                            System.out.println("Ingrese nivel de creatividad: ");
                            int nivel_creat=l.nextInt();
                            System.out.println("Ingrese nivel de dominio: ");
                            int nivel_dom=l.nextInt();
                            System.out.println("Ingrese promedio de asistencias");
                            double prom_asis=l.nextDouble();
                            jugadores.add(new Medio(nivel_creat, nivel_dom, prom_asis, nombre, apellido, edad, estado, pais, pie, 0, precio, ""));
                            break;
                        case 4: 
                            System.out.print("Ingrese nivel: ");
                            int nivel=l.nextInt();
                            System.out.print("Ingrese altura: ");
                            double altura=l.nextDouble();
                            System.out.print("Ingrese velocidad: ");
                            String velocidad=l.next();
                            System.out.print("Ingrese promedio de goles: ");
                            double prom_goles=l.nextDouble();
                            jugadores.add(new Delantero(nivel, altura, velocidad, prom_goles, nombre, apellido, edad, estado, pais, pie, 0, precio, ""));
                            break;
                    }
                    break;
                case 2: 
                    break;
                case 3: 
                    System.out.println("1. Portero");
                    System.out.println("2. Defensa");
                    System.out.println("3. Medio");
                    System.out.println("4. Delantero");
                    System.out.print("Que desea eliminar?[1-4]: ");
                    int opeliminar=l.nextInt();
                    while(opeliminar<1|| opeliminar>4)
                    {
                        System.out.print("Ingrese una opcion valida: ");
                        opeliminar=l.nextInt();
                    }
                    switch (opeliminar)
                    {
                        case 1: 
                            for(Object e: jugadores)
                            {
                                if(e instanceof Portero)
                                {
                                    System.out.println(jugadores.indexOf(e) + ". " + ((Portero) e).getNombre());
                                }
                            }
                            System.out.print("Que equipo desea eliminar?: ");
                            eliminar=l.nextInt();
                            jugadores.remove(eliminar);
                            break;
                        case 2:
                            for(Object e: jugadores)
                            {
                                if(e instanceof Defensa)
                                {
                                    System.out.println("" + jugadores.indexOf(e) + ". " + ((Defensa) e).getNombre());
                                }
                            }
                            System.out.print("Que equipo desea eliminar?: ");
                            eliminar=l.nextInt();
                            jugadores.remove(eliminar);
                            break;
                        case 3: 
                            for(Object e: jugadores)
                            {
                                if(e instanceof Medio)
                                {
                                    System.out.println(jugadores.indexOf(e) + ". " + ((Medio) e).getNombre());
                                }
                            }
                            System.out.print("Que equipo desea eliminar?: ");
                            eliminar=l.nextInt();
                            jugadores.remove(eliminar);
                            break;
                        case 4: 
                            for(Object e: jugadores)
                            {
                                if(e instanceof Delantero)
                                {
                                    System.out.println(jugadores.indexOf(e) + ". " + ((Delantero) e).getNombre());
                                }
                            }
                            System.out.print("Que equipo desea eliminar?: ");
                            eliminar=l.nextInt();
                            jugadores.remove(eliminar);
                            break;
                    }
                    break;
                case 4: 
                    System.out.println("Ingrese el nombre de su equipo: ");
                    String nombre_equip=l.nextLine();
                    System.out.println("Ingrese los palmar de el equipo: ");
                    String palmares=l.nextLine();
                    System.out.println("Ingrese el nombre de la ciudad: ");
                    String ciudad=l.nextLine();
                    System.out.println("Ingrese el presupuesto de su equipo: ");
                    double presup=l.nextInt();
                    equipos.add(new Equipo(nombre_equip,palmares,ciudad,presup));
                case 5: 
                    for(Equipo e: equipos)
                    {
                        System.out.println(equipos.indexOf(e) + ". " + e.getNombre());
                    }
                    System.out.print("Que equipo desea eliminar?: ");
                    eliminar=l.nextInt();
                    equipos.remove(eliminar);
                case 6: 
            }
            System.out.println("1. Agregar jugador");
            System.out.println("2. Editar jugador");
            System.out.println("3. Eliminar jugador");
            System.out.println("4. Agregar equipo");
            System.out.println("5. Eliminar equipo");
            System.out.println("6. Compras");
            System.out.println("7. Organizar equipos");
            System.out.println("8. Listar equipos");
            System.out.println("9. Listar jugadores");
            System.out.println("10. Salir");
            System.out.print("Que desea hacer? [1-10]: ");
            opc=l.nextInt();
            while (opc<0|| opc>10)
            {
                System.out.print("Ingrese una opcion valida: ");
                opc=l.nextInt();
            }
        }
    }
}
