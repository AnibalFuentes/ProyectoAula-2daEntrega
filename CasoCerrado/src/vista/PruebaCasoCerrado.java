package vista;

import modelo.Oficina;
import modelo.casos.Caso;
import modelo.casos.*;

public class PruebaCasoCerrado {

    public static void main(String[] args) {
        System.out.println("//TEST: [SE CREARÁ UN CASO DE CADA TIPO PARA VERIFICAR QUE ESTOS SE CREAN CORRECTAMENTE]\n"
                + "//EL ID ES ASIGNADO AUTOMATICAMENTE MEDIANTE UN CONTADOR UBICADO EN EL CONSTRUCTOR DE LA CLASE 'Caso'");
        Caso _1 = new CiberCrimen();
        System.out.println(_1.toString());

        Caso _2 = new Narcotico();
        System.out.println(_2.toString());

        Caso _3 = new Homicidio();
        System.out.println(_3.toString());
        System.out.println("\n//MENÚ PRINCIPAL");
        Oficina oficina = new Caso() {
        };
        oficina.casoCerrado();
    }
}
