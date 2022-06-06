package modelo.casos;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Bitacora;
import modelo.Oficina;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public abstract class Caso extends Oficina {

    protected int idCaso;
    private static int contCaso = 10000;
    protected String clave;
    protected String descipcion;
    protected String prioridad;
    protected Detective detective;
    protected Bitacora bitacora;

    public Caso() {
        this.idCaso = ++Caso.contCaso;
    }

    public Caso(String clave, String descipcion, String prioridad, Detective detective, Bitacora bitacora, ArrayList sospechosos) {
        this();
        this.clave = clave;
        this.descipcion = descipcion;
        this.prioridad = prioridad;
        this.detective = detective;
        this.bitacora = bitacora;
        this.sospechosos = sospechosos;
    }

    @Override
    public void casoCerrado() {
        int opcion = 0;
        do {
            System.out.println("┌────────────────────┐");
            System.out.println("| [CASO CERRADO]     |");
            System.out.println("├────────────────────┤");
            System.out.println("| 1. ABRIR CASO      |");
            System.out.println("| 2. EDITAR CASO     |");
            System.out.println("| 3. CONSULTAR CASO  |");
            System.out.println("| 4. SALIR           |");
            System.out.println("├────────────────────┘");
            System.out.print("├─»: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    abrirCaso();
                    break;
                case 2:
                    editarCaso();
                    break;
                case 3:
                    consultarCaso();
                    break;
                case 4:
                    System.out.println("└───────[FINALIZADO]─┘");
                    break;
                default:
                    enter();
                    break;
            }
        } while (opcion != 4);
    }

    @Override
    public void consultarCaso() {
        System.out.println("└─[3][REGISTRO DE CASOS]");
        int opcion = 0;
        if (casos == null || casos.size() == 0) {
            do {
                System.out.println("     └─[NO HAY CASOS REGISTRADOS]");
                System.out.println("       ¿DESEA REGISTRAR UN NUEVO CASO?");
                System.out.println("       1. SI");
                System.out.println("       2. NO");
                System.out.print("       »: ");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        abrirCaso();
                        break;
                    case 2:
                        System.out.println("       [PROCESO CANCELADO]");
                        break;
                    default:
                        System.out.println("       [¡ERROR!]");
                        break;
                }
            } while (opcion != 2);
        } else {
            for (int i = 0; i < casos.size(); i++) {
                System.out.println("       ├──[" + i + "] " + casos.get(i));
            }
            System.out.println("       └──┘");
        }
        System.out.println("");
    }

    @Override
    public void crearCasoHomicidio() {
        System.out.println("     └─[2][CASO: HOMICIDIO]");
        System.out.print("          ├─[CLAVE        » ");
        clave = input.next();
        System.out.print("          ├─[DESCRIPCIÓN  » ");
        descipcion = input.next();
        System.out.println("          ├─[PRIORIDAD]");
        System.out.println("          │ 1. POCO RELEVANCIA");
        System.out.println("          │ 2. MODERADA");
        System.out.println("          │ 3. RELEVANTE");
        System.out.print("          ├─»: ");
        int p = input.nextInt();
        switch (p) {
            case 1:
                prioridad = "POCA RELEVANCIA";
                break;
            case 2:
                prioridad = "MODERADA";
                break;
            case 3:
                prioridad = "RELEVANTE";
                break;
            default:
                System.out.println("          [OPCIÓN INVALIDA]");
                break;
        }
        System.out.println("          ├ DETECTIVES DISPONIBLES PARA ESTE CASO: ");
        switch (prioridad) {
            case "POCA RELEVANCIA":
                detectives.add(detective_1);
                detectives.add(detective_2);
                detectives.add(detective_3);
                for (int i = 0; i < detectives.size(); i++) {
                    System.out.println("          ├──[" + i + "] " + detectives.get(i));
                }
                System.out.print("          ├──┴»: ");
                int op = input.nextInt();
                detective = detectives.get(op);
                break;
            case "MODERADA":
                break;
            case "RELEVANTE":
                break;
            default:
                break;
        }
        System.out.println("          ├─: ");
        System.out.println("          ├─[BITACORA     » ");
        System.out.println("          ├─[SOSPECHOSOS  » ");
        System.out.println("          └─[CASO CREADO EXITOSAMENTE]");
        casos.add(new Homicidio(detective, clave, descipcion, prioridad, detective, bitacora, sospechosos));
        System.out.println("");
        casoCerrado();
    }

    @Override
    public void crearCasoCibercrimen() {
        System.out.println("     └─[3][CASO: CIBERCRIMEN]");
        System.out.println("          ├─[CLAVE        » ");
        System.out.println("          ├─[DESCRIPCIÓN  » ");
        System.out.println("          ├─[PRIORIDAD    » ");
        System.out.println("          ├─[DETECTIVE    » ");
        System.out.println("          ├─[BITACORA     » ");
        System.out.println("          ├─[SOSPECHOSOS  » ");
        System.out.println("          └─[CASO CREADO EXITOSAMENTE]");
        casos.add(new CiberCrimen(descipcion, clave, descipcion, prioridad, detective, bitacora, sospechosos));
        casoCerrado();
    }

    @Override
    public void crearCasoNarcotico() {
        System.out.println("     └─[1][CAS0: NARCOTICO]");
        System.out.println("          ├─[CLAVE        » ");
        System.out.println("          ├─[DESCRIPCIÓN  » ");
        System.out.println("          ├─[PRIORIDAD    » ");
        System.out.println("          ├─[DETECTIVE    » ");
        System.out.println("          ├─[BITACORA     » ");
        System.out.println("          ├─[SOSPECHOSOS  » ");
        System.out.println("          └─[CASO CREADO EXITOSAMENTE]");
        casos.add(new Narcotico(descipcion, clave, descipcion, prioridad, detective, bitacora, sospechosos));
    }

    @Override
    public void abrirCaso() {
        int opcion_1 = 0;
        do {
            System.out.println("└─[1][ABRIR CASO]─────────┐");
            System.out.println("     | TIPO DE CASO:      |");
            System.out.println("     | 1. NARCOTICO       |");
            System.out.println("     | 2. HOMICIDIO       |");
            System.out.println("     | 3. CIBERCRIMEN     |");
            System.out.println("     | 4. VOLVER          |");
            System.out.println("     ├────────────────────┘");
            System.out.print("     └─»: ");
            opcion_1 = input.nextInt();
            switch (opcion_1) {
                case 1:
                    crearCasoNarcotico();
                    break;
                case 2:
                    crearCasoHomicidio();
                    break;
                case 3:
                    casoCerrado();
                    break;
                case 4:
                    System.out.println("┌────┴─[CREACIÓN CANCELADA]");
                    casoCerrado();
                    break;
                default:
                    enter();
                    break;
            }
        } while (opcion_1 != 4);
    }

    @Override
    public void editarCaso() {

    }

    public void enter() {
        System.out.print("└──┐¡OPCIÓN INVALIDA!"
                + "\n   └─» PRESIONE ENTER PARA INTENTARLO NUEVAMENTE...");
        //Esperar el ENTER para volver al menú
        String seguir;
        Scanner teclado = new Scanner(System.in);
        try {
            seguir = teclado.nextLine();
            System.out.println("");
        } catch (Exception e) {
        }
    }

}
