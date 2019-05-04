package lab3_franciscopagoaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_FranciscoPagoaga 
{
    public static void main(String[] args) 
    {
        int eliminar, editar, opceditar;
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
                    String pie=null;
                    String estado=null;
                    System.out.print("Ingrese el nombre: ");
                    String nombre=l.next();
                    System.out.print("Ingrese apellido: ");
                    String apellido=l.next();
                    System.out.print("Ingrese edad: ");
                    int edad=l.nextInt();
                    System.out.print("1) comprado\n2) libre ");
                    int op=l.nextInt();
                    switch (op) {
                        case 1:
                            estado="Comprado";
                            break;
                        case 2:
                            estado="Libre";
                            break;
                    }
                    System.out.print("Ingrese pais: ");
                    String pais=l.next();
                    System.out.print("1) pie derecho\n pie izquierdo");
                    op=l.nextInt();
                    switch (op) {
                        case 1:
                            pie="Derecho";
                            break;
                        case 2: 
                            pie="Izquierdo";
                            break;
                    }
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
                    System.out.println("1. Portero");
                    System.out.println("2. Defensa");
                    System.out.println("3. Medio");
                    System.out.println("4. Delantero");
                    System.out.print("Que desea eliminar?[1-4]: ");
                    int opeditar=l.nextInt();
                    while(opeditar<1|| opeditar>4)
                    {
                        System.out.print("Ingrese una opcion valida: ");
                        opeditar=l.nextInt();
                    }
                    switch (opeditar)
                    {
                        case 1: 
                            for(Object e: jugadores)
                            {
                                if(e instanceof Portero)
                                {
                                    System.out.println(jugadores.indexOf(e) + ". " + ((Portero) e).getNombre());
                                }
                            }
                            System.out.print("Que jugador desea editar?: ");
                            editar=l.nextInt();
                            System.out.println("1. Cambiar nombre\n" + "2. Cambiar apellido\n" + "3. Cambiar edad\n" + "4. Cambiar estado\n" + 
                                               "5. Cambiar pais\n" + "6. Cambiar pie\n" + "7. Cambiar precio\n" + "8. Cambiar nivel aereo" + 
                                               "9. Cambiar nivel de pies" + "10. Salir" + "Que desea hacer?[1-10]: ");
                            opceditar=l.nextInt();
                            while(opceditar<1| opceditar>10)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                opceditar=l.nextInt();
                            }
                            while (opc>0&& opc<10)
                            {
                                switch(opceditar)
                                {
                                    case 1: 
                                        System.out.print("Ingrese el nuevo nombre: ");
                                        nombre=l.next();
                                        ((Portero)jugadores.get(editar)).setNombre(nombre);
                                        break;
                                    case 2: 
                                        System.out.print("Ingrese el nuevo apellido: ");
                                        apellido=l.next();
                                        ((Portero)jugadores.get(editar)).setApellido(apellido);
                                        break;
                                    case 3: 
                                        System.out.print("Ingrese nueva edad: ");
                                        edad=l.nextInt();
                                        ((Portero)jugadores.get(editar)).setEdad(edad);
                                        break;
                                    case 4: 
                                        System.out.print("Ingrese nuevo estado: ");
                                        estado=l.next();
                                        ((Portero)jugadores.get(editar)).setEstado(estado);
                                        break;
                                    case 5: 
                                        System.out.print("Ingrese nuevo pais: ");
                                        pais=l.next();
                                        ((Portero)jugadores.get(editar)).setPais(pais);
                                        break;
                                    case 6: 
                                        System.out.print("Ingrese nuevo pie: ");
                                        pie=l.next();
                                        ((Portero)jugadores.get(editar)).setPie(pie);
                                        break;
                                    case 7: 
                                        System.out.print("Ingrese nuevo precio: ");
                                        precio=l.nextDouble();
                                        ((Portero)jugadores.get(editar)).setPrecio(precio);
                                        break;
                                    case 8: 
                                        System.out.print("Ingrese nuevo nivel aereo: ");
                                        int nivel_aereo=l.nextInt();
                                        ((Portero)jugadores.get(editar)).setNivel_aereo(nivel_aereo);
                                        break;
                                    case 9: 
                                        System.out.print("Ingrese nuevo nivel de pie: ");
                                        int nivel_pie=l.nextInt();
                                        ((Portero)jugadores.get(editar)).setNivel_pies(nivel_pie);
                                }
                            }
                            break;
                        case 2: 
                            for(Object e: jugadores)
                            {
                                if(e instanceof Defensa)
                                {
                                    System.out.println(jugadores.indexOf(e) + ". " + ((Defensa) e).getNombre());
                                }
                            }
                            System.out.print("Que jugador desea editar?: ");
                            editar=l.nextInt();
                            System.out.println("1. Cambiar nombre\n" + "2. Cambiar apellido\n" + "3. Cambiar edad\n" + "4. Cambiar estado\n" + 
                                               "5. Cambiar pais\n" + "6. Cambiar pie\n" + "7. Cambiar precio\n" + "8. Cambiar nivel agresividad\n" +
                                               "9. Cambiar altura\n" + "10. Cambiar peso\n" + "11. Cambiar\n" + "12. Salir\n" + "Que desea hacer?[1-12]: ");
                            opceditar=l.nextInt();
                            while(opceditar<1| opceditar>12)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                opceditar=l.nextInt();
                            }
                            while (opc>0&& opc<12)
                            {
                                switch(opceditar)
                                {
                                    case 1: 
                                        System.out.print("Ingrese el nuevo nombre: ");
                                        nombre=l.next();
                                        ((Defensa)jugadores.get(editar)).setNombre(nombre);
                                        break;
                                    case 2: 
                                        System.out.print("Ingrese el nuevo apellido: ");
                                        apellido=l.next();
                                        ((Defensa)jugadores.get(editar)).setApellido(apellido);
                                        break;
                                    case 3: 
                                        System.out.print("Ingrese nueva edad: ");
                                        edad=l.nextInt();
                                        ((Defensa)jugadores.get(editar)).setEdad(edad);
                                        break;
                                    case 4: 
                                        System.out.print("Ingrese nuevo estado: ");
                                        estado=l.next();
                                        ((Defensa)jugadores.get(editar)).setEstado(estado);
                                        break;
                                    case 5: 
                                        System.out.print("Ingrese nuevo pais: ");
                                        pais=l.next();
                                        ((Defensa)jugadores.get(editar)).setPais(pais);
                                        break;
                                    case 6: 
                                        System.out.print("Ingrese nuevo pie: ");
                                        pie=l.next();
                                        ((Defensa)jugadores.get(editar)).setPie(pie);
                                        break;
                                    case 7: 
                                        System.out.print("Ingrese nuevo precio: ");
                                        precio=l.nextDouble();
                                        ((Defensa)jugadores.get(editar)).setPrecio(precio);
                                        break;
                                    case 8: 
                                        System.out.print("Ingrese nueva nivel agresividad: ");
                                        int nivel_agresividad=l.nextInt();
                                        ((Defensa)jugadores.get(editar)).setNivel_agresividad(nivel_agresividad);
                                        break;
                                    case 9:
                                        System.out.print("Ingrese nueva altura: ");
                                        double altura=l.nextDouble();
                                        ((Defensa)jugadores.get(editar)).setAltura(altura);
                                        break;
                                    case 10: 
                                        System.out.print("Ingrese nuevo peso: ");
                                        double peso=l.nextDouble();
                                        ((Defensa)jugadores.get(editar)).setPeso(peso);
                                        break;
                                    case 11: 
                                        System.out.print("Ingrese nueva velocidad");
                                        String velocidad=l.next();
                                        ((Defensa)jugadores.get(editar)).setVelocidad(velocidad);
                                        break;
                                }
                            }
                            break;
                        case 3: 
                            for(Object e: jugadores)
                            {
                                if(e instanceof Medio)
                                {
                                    System.out.println(jugadores.indexOf(e) + ". " + ((Medio) e).getNombre());
                                }
                            }
                            System.out.print("Que jugador desea editar?: ");
                            editar=l.nextInt();
                            System.out.println("1. Cambiar nombre\n" + "2. Cambiar apellido\n" + "3. Cambiar edad\n" + "4. Cambiar estado\n" + 
                                               "5. Cambiar pais\n" + "6. Cambiar pie\n" + "7. Cambiar precio\n" + "8. Cambiar nivel de creatividad\n" + 
                                               "9. Cambiar nivel de dominio\n" + "10. Cambiar promedio de asistencias\n" + "11. Salir\n" + "Que desea hacer?[1-8]: ");
                            opceditar=l.nextInt();
                            while(opceditar<1| opceditar>11)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                opceditar=l.nextInt();
                            }
                            while (opc>0&& opc<11)
                            {
                                switch(opceditar)
                                {
                                    case 1: 
                                        System.out.print("Ingrese el nuevo nombre: ");
                                        nombre=l.next();
                                        ((Medio)jugadores.get(editar)).setNombre(nombre);
                                        break;
                                    case 2: 
                                        System.out.print("Ingrese el nuevo apellido: ");
                                        apellido=l.next();
                                        ((Medio)jugadores.get(editar)).setApellido(apellido);
                                        break;
                                    case 3: 
                                        System.out.print("Ingrese nueva edad: ");
                                        edad=l.nextInt();
                                        ((Medio)jugadores.get(editar)).setEdad(edad);
                                        break;
                                    case 4: 
                                        System.out.print("Ingrese nuevo estado: ");
                                        estado=l.next();
                                        ((Medio)jugadores.get(editar)).setEstado(estado);
                                        break;
                                    case 5: 
                                        System.out.print("Ingrese nuevo pais: ");
                                        pais=l.next();
                                        ((Medio)jugadores.get(editar)).setPais(pais);
                                        break;
                                    case 6: 
                                        System.out.print("Ingrese nuevo pie: ");
                                        pie=l.next();
                                        ((Medio)jugadores.get(editar)).setPie(pie);
                                        break;
                                    case 7: 
                                        System.out.print("Ingrese nuevo precio: ");
                                        precio=l.nextDouble();
                                        ((Medio)jugadores.get(editar)).setPrecio(precio);
                                        break;
                                    case 8: 
                                        System.out.print("Ingrese nuevo nivel de creatividad: ");
                                        int niv_creat=l.nextInt();
                                        ((Medio)jugadores.get(editar)).setNivel_creat(niv_creat);
                                        break;
                                    case 9: 
                                        System.out.print("Ingrese nuevo nivel de dominio: ");
                                        int nivel_dom=l.nextInt();
                                        ((Medio)jugadores.get(editar)).setNivel_dom(nivel_dom);
                                    case 10: 
                                        System.out.print("Ingrese nuevo promedio de asistencias: ");
                                        double prom_asis=l.nextDouble();
                                        ((Medio)jugadores.get(editar)).setProm_asis(prom_asis);
                                }
                            }
                            break;
                        case 4:
                            for(Object e: jugadores)
                            {
                                if(e instanceof Delantero)
                                {
                                    System.out.println(jugadores.indexOf(e) + ". " + ((Delantero) e).getNombre());
                                }
                            }
                            System.out.print("Que jugador desea editar?: ");
                            editar=l.nextInt();
                            System.out.println("1. Cambiar nombre\n" + "2. Cambiar apellido\n" + "3. Cambiar edad\n" + "4. Cambiar estado\n" + 
                                               "5. Cambiar pais\n" + "6. Cambiar pie\n" + "7. Cambiar precio\n" + "8. Cambiar nivel" + "9. Cambiar altura" +
                                               "10. Cambiar velocidad" + "11. Cambiar promedio de goles" + "12. Salir" + "Que desea hacer?[1-8]: ");
                            opceditar=l.nextInt();
                            while(opceditar<1| opceditar>12)
                            {
                                System.out.print("Ingrese una opcion valida: ");
                                opceditar=l.nextInt();
                            }
                            while (opc>0&& opc<12)
                            {
                                switch(opceditar)
                                {
                                    case 1: 
                                        System.out.print("Ingrese el nuevo nombre: ");
                                        nombre=l.next();
                                        ((Delantero)jugadores.get(editar)).setNombre(nombre);
                                        break;
                                    case 2: 
                                        System.out.print("Ingrese el nuevo apellido: ");
                                        apellido=l.next();
                                        ((Delantero)jugadores.get(editar)).setApellido(apellido);
                                        break;
                                    case 3: 
                                        System.out.print("Ingrese nueva edad: ");
                                        edad=l.nextInt();
                                        ((Delantero)jugadores.get(editar)).setEdad(edad);
                                        break;
                                    case 4: 
                                        System.out.print("Ingrese nuevo estado: ");
                                        estado=l.next();
                                        ((Delantero)jugadores.get(editar)).setEstado(estado);
                                        break;
                                    case 5: 
                                        System.out.print("Ingrese nuevo pais: ");
                                        pais=l.next();
                                        ((Delantero)jugadores.get(editar)).setPais(pais);
                                        break;
                                    case 6: 
                                        System.out.print("Ingrese nuevo pie: ");
                                        pie=l.next();
                                        ((Delantero)jugadores.get(editar)).setPie(pie);
                                        break;
                                    case 7: 
                                        System.out.print("Ingrese nuevo precio: ");
                                        precio=l.nextDouble();
                                        ((Delantero)jugadores.get(editar)).setPrecio(precio);
                                        break;
                                    case 8: 
                                        System.out.print("Ingrese nuevo nivel: ");
                                        int nivel=l.nextInt();
                                        ((Delantero)jugadores.get(editar)).setNivel(nivel);
                                        break;
                                    case 9: 
                                        System.out.print("Ingrese nueva altura: ");
                                        double altura=l.nextDouble();
                                        ((Delantero)jugadores.get(editar)).setAltura(altura);
                                        break;
                                    case 10: 
                                        System.out.print("Ingrese nueva velocidad: ");
                                        String velocidad=l.next();
                                        ((Delantero)jugadores.get(editar)).setVelocidad(velocidad);
                                        break;
                                    case 11: 
                                        System.out.print("Ingrese nuevo promedio de goles: ");
                                        double prom_goles=l.nextDouble();
                                        ((Delantero)jugadores.get(editar)).setProm_goles(prom_goles);
                                }
                            }
                            break;
                    }
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
                            System.out.print("Que jugador desea eliminar?: ");
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
                            System.out.print("Que jugador desea eliminar?: ");
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
                            System.out.print("Que jugador desea eliminar?: ");
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
                            System.out.print("Que jugador desea eliminar?: ");
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
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i + ") " + ((Equipo) equipos.get(i)).getNombre());
                    }
                    int opcion2 = l.nextInt();
                    System.out.println("eliga un jugador");
                    for (int i = 0; i < jugadores.size(); i++) {
                        System.out.println(i + ") " + ((Jugador) jugadores.get(i)).getNombre());
                    }
                    int opcion3 = l.nextInt();
                    if (jugadores.get(opcion3) instanceof Delantero) {
                        if (((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Delantero) jugadores.get(opcion3)).getPrecio() > 0) {
                            double x=((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Delantero) jugadores.get(opcion3)).getPrecio();
                            equipos.get(opcion2).setPresupuesto(x);
                            System.out.println("Ingrese el numero de que quiere en su jugador");
                            int num = l.nextInt();
                            int cont = 0;
                            for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                    cont++;
                                }
                            }
                            while (cont > 0) {
                                System.out.println("El numero ya esta ocupado, ingrese otro numero:");
                                num = l.nextInt();
                                cont = 0;
                                for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                    if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                        cont++;
                                    }
                                }
                            }
                            ((Delantero) jugadores.get(opcion3)).setNumero(num);
                            ((Equipo) equipos.get(opcion2)).getJugador().add(jugadores.get(opcion3));
                            jugadores.remove(opcion3);
                        } else {
                            System.out.println("Su equipo no tiene suficiente dinero para realizar la compra");
                        }
                    }
                    if (jugadores.get(opcion3) instanceof Defensa) {
                        if (((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Defensa) jugadores.get(opcion3)).getPrecio() > 0) {
                            double x=((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Defensa) jugadores.get(opcion3)).getPrecio();
                            equipos.get(opcion2).setPresupuesto(x);
                            System.out.println("Ingrese el numero de que quiere en su jugador");
                            int num = l.nextInt();
                            int cont = 0;
                            for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                    cont++;
                                }
                            }
                            while (cont > 0) {
                                System.out.println("El numero ya esta ocupado, ingrese otro numero:");
                                num = l.nextInt();
                                cont = 0;
                                for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                    if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                        cont++;
                                    }
                                }
                            }
                            ((Defensa) jugadores.get(opcion3)).setNumero(num);
                            ((Equipo) equipos.get(opcion2)).getJugador().add(jugadores.get(opcion3));
                            jugadores.remove(opcion3);
                        } else {
                            System.out.println("Su equipo no tiene suficiente dinero para realizar la compra");
                        }
                    }
                    if (jugadores.get(opcion3) instanceof Portero) {
                        if (((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Portero) jugadores.get(opcion3)).getPrecio() > 0) {
                            double x=((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Portero) jugadores.get(opcion3)).getPrecio();
                            equipos.get(opcion2).setPresupuesto(x);
                            System.out.println("Ingrese el numero de que quiere en su jugador");
                            int num = l.nextInt();
                            int cont = 0;
                            for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                    cont++;
                                }
                            }
                            while (cont > 0) {
                                System.out.println("El numero ya esta ocupado, ingrese otro numero:");
                                num = l.nextInt();
                                cont = 0;
                                for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                    if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                        cont++;
                                    }
                                }
                            }
                            ((Portero) jugadores.get(opcion3)).setNumero(num);
                            ((Equipo) equipos.get(opcion2)).getJugador().add(jugadores.get(opcion3));
                            jugadores.remove(opcion3);
                        } else {
                            System.out.println("Su equipo no tiene suficiente dinero para realizar la compra");
                        }
                    }
                    if (jugadores.get(opcion3) instanceof Medio) {
                        if (((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Medio) jugadores.get(opcion3)).getPrecio() > 0) {
                            double x=((Equipo) equipos.get(opcion2)).getPresupuesto() - ((Medio) jugadores.get(opcion3)).getPrecio();
                            equipos.get(opcion2).setPresupuesto(x);
                            System.out.println("Ingrese el numero de que quiere en su jugador");
                            int num = l.nextInt();
                            int cont = 0;
                            for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                    cont++;
                                }
                            }
                            while (cont > 0) {
                                System.out.println("El numero ya esta ocupado, ingrese otro numero:");
                                num = l.nextInt();
                                cont = 0;
                                for (int i = 0; i < ((Equipo) equipos.get(opcion2)).getJugador().size(); i++) {
                                    if (((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).getNumero() == num) {
                                        cont++;
                                    }
                                }
                            }
                            ((Medio) jugadores.get(opcion3)).setNumero(num);
                            ((Equipo) equipos.get(opcion2)).getJugador().add(jugadores.get(opcion3));
                            jugadores.remove(opcion3);
                        } else {
                            System.out.println("Su equipo no tiene suficiente dinero para realizar la compra");
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i+") "+((Equipo)equipos.get(i)).getNombre());
                    }
                    opcion2=l.nextInt();
                    int cont=0;
                    for (int i = 0; i < ((Equipo)equipos.get(opcion2)).getJugador().size(); i++) {
                        if (((Equipo)equipos.get(opcion2)).getJugador().get(i) instanceof Portero){
                            cont++;
                        }
 
                    }
                    if (((Equipo)equipos.get(opcion2)).getJugador().size()<11 || cont==0) {
                        System.out.println("No tiene suficientes jugadores para su equipo");
                    } else{
                        for (int i = 0; i < 11; i++) {
                            for (int j = 0; j <((Equipo)equipos.get(opcion2)).getJugador().size() ; j++) {
                                System.out.println(j+") "+((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(j))).getNombre());
                            }
                            int opcion4=l.nextInt();
                            String x="Titular";
                            ((Jugador)(((Equipo) equipos.get(opcion2)).getJugador().get(i))).setPuesto(x);
                        }
                    }
                    break;
                case 8:
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println(i+") "+((Equipo) equipos.get(i)).toString());
                        System.out.println("Titulares:");
                        cont=1;
                        for (int j = 0; j < ((Equipo) equipos.get(i)).getJugador().size(); j++) {
                            if ( ((Jugador)(((Equipo) equipos.get(i)).getJugador().get(j))).getPuesto()=="Titular") {
                                System.out.println(cont+") "+((Jugador)(((Equipo) equipos.get(i)).getJugador().get(j))).getNombre()+" "+((Jugador)(((Equipo) equipos.get(i)).getJugador().get(j))).getNombre());
                            }
                        }
                        System.out.println("Suplentes: ");
                        for (int j = 0; j < ((Equipo) equipos.get(i)).getJugador().size(); j++) {
                            if ( ((Jugador)(((Equipo) equipos.get(i)).getJugador().get(j))).getPuesto()==null) {
                                System.out.println(cont+") "+((Jugador)(((Equipo) equipos.get(i)).getJugador().get(j))).getNombre()+" "+((Jugador)(((Equipo) equipos.get(i)).getJugador().get(j))).getNombre());
                            }
                        }
                    }
                    break;
                case 9:
                    cont=1;
                    for (int i = 0; i < jugadores.size(); i++) {
                        System.out.println(cont+") "+((Jugador)jugadores.get(i)).toString()+"  ");
                        cont++;
                    }
                    for (int i = 0; i < equipos.size(); i++) {
                        for (int j = 0; j <  ((Equipo) equipos.get(i)).getJugador().size(); j++) {
                            System.out.println(cont+") "+((Jugador)(((Equipo) equipos.get(i)).getJugador().get(j))).toString());
                            cont++;
                        }
                    }
                    break;
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
