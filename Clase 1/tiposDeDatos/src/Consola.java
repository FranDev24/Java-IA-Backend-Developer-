import java.util.Scanner;

public class Consola {
    public static void main(String[] args) throws Exception {

        //Declarar variables
        int edad;
        double salario;
        char sexo;
        boolean estado;
        String nombres; 


        //entrada de datos por consola 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del estudiante: ");
        nombres = entrada.nextLine();  //nextline va a leear toda la linea, next va a leer hasta que encuentre un espacio
        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();
        System.out.println("Digitel el salario: ");
        salario = entrada.nextDouble();
        System.out.println("Digite el sexo: ");
        sexo = entrada.next().charAt(0); //se pone 0 en index para que el programa tenga en cuenta la primera letra no las demas ej: masculino toma la letra "m"
        System.out.println("Digite el estado del estudiante: ");
        estado = entrada.nextBoolean();


        //salida de datos por consola
        System.out.println("El nombre del estudiante es: " + nombres + "La edad del estudiante es: " + edad + "El salario del estudinate es: " + salario + "El sexo del estudiante es: " + sexo + "El estado del estudiante es: " + estado);





        
    }
}
