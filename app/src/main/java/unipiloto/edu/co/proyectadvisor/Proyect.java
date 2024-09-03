package unipiloto.edu.co.proyectadvisor;

import java.util.ArrayList;

public class Proyect {

    private final ArrayList<String> proyects;

    public Proyect() {
        proyects = new ArrayList<>();
    }

    public ArrayList<String> getProyects(int idProyectType){
        switch (idProyectType){
            case 0://infraestructura
                proyects.add("Parque fontal");
                proyects.add("Parque 100");
                proyects.add("Via al llano");
                return proyects;
            case 1://recreativos
                proyects.add("Ciclovia ciudadela");
                proyects.add("Zona ejercicios 32");
                return proyects;
            case 2://comercial
                proyects.add("Centro comercial fontal");
                proyects.add("Mercado de frutas verdes");
                proyects.add("CC suden");
                return proyects;
        }
        return null;
    }
}
