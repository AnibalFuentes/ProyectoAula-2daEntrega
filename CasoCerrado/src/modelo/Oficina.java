package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.casos.Caso;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public abstract class Oficina {

    protected ArrayList<Caso> casos = new ArrayList<>();
    protected ArrayList<Detective> detectives = new ArrayList<>();
    protected ArrayList<Sospechoso> sospechosos = new ArrayList<>();

    public Oficina() {
    }

    public Scanner input = new Scanner(System.in);

    //--------------------------[MENÚ PRINCIPAL]
    public abstract void casoCerrado();

    public abstract void abrirCaso();

    public abstract void editarCaso();

    public abstract void consultarCaso();

    //--------------------------[CRECAR CASOS]
    public abstract void crearCasoHomicidio();

    public abstract void crearCasoCibercrimen();

    public abstract void crearCasoNarcotico();

    //--------------------------[DETECTIVES]
    //CASOS POCA RELEVANCIA
    protected Detective detective_1 = new Detective(1, "CIBERCRIMEN", "10000001", "CARLOS", "ROLF");
    protected Detective detective_2 = new Detective(1, "NARCOTICOS", "10000002", "BRUCE", "WILLIS");
    protected Detective detective_3 = new Detective(1, "HOMICIDIOS", "10000003", "JHONNY", "DEPP");
    //CASOS DE RELEVANCIA MODERADA
    protected Detective detective_4 = new Detective();
    protected Detective detective_5 = new Detective();
    protected Detective detective_6 = new Detective();
    //CASOS RELEVANTES
    protected Detective detective_7 = new Detective();
    protected Detective detective_8 = new Detective();
    protected Detective detective_9 = new Detective();
    
}
