import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Principal
 * @author Juan Ramirez
 * 20666
 * basado en https://www.softwaretestinghelp.com/heap-data-structure-in-java/#:~:text=In%20the%20heap%20data%20structure,will%20generate%20a%20max%20heap.
 */

public class Main {
    public static void main(String[] args){
        VectorHeap<Paciente> v = new VectorHeap<>();
        /**
         * leer el archivo
         */
        try {
            File texto = new File("Pacientes.txt");
            Scanner scanner = new Scanner(texto);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                v.add(new Paciente(values[0],values[1],values[2]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
        /**
         * inicia el programa
         */
        String salir = "no";
        while(salir.equals("no")){
            Scanner teclado = new Scanner(System.in);
            System.out.println("*******Emergencias Roosvelt*******");
            System.out.println("1. Ver pacientes en cola " +
                    "\n2. Atender a paciente mas urgente" +
                    "\n3. salir");
            String s = teclado.nextLine();
            if(s.equals("1")){
                v.printHeap();
            }
            if(s.equals("2")){
                System.out.println("El paciente más urgente es: " + v.peek());
                System.out.println("...."+ v.remove()+ " fue atendido exitosamente y fue retirado de la cola");
            }
            if(s.equals("3")){
                salir="si";
            }

        }

    }
}

