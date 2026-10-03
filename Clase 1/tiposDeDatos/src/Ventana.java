import javax.swing.JOptionPane;

public class Consola {
    public static void main(String[] args) throws Exception {

        //Declarar variables
        int edad;
        double salario;
        float promedio
        char sexo;
        boolean estado;
        String nombres; 


        //entrada de datos por ventana emergente
        nombres = JOptionPane.showInputDialog("Digite el nombre del estudinate: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del estudiante: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del estudiante: "));
        promedio = Float.parseFloat(JOptionPane.showInputDialog("Digite el promedio del estudiante: "));
        sexo = JOptionPane.showInputDialog("Digite el sexo del estudiante: ")).charAt(0);  
        

        //salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null, " Nombre: " + nombre + "\nEdad: " + edad); //el \n es para que en la ventana salga nombre y abajo edad es decir hace enter.
                
        JOptionPane.showMessageDialog(null, "salario: " + salario);        
        JOptionPane.showMessageDialog(null, "promedio: " + promedio);        
        JOptionPane.showMessageDialog(null, "sexo: " + sexo);        
                
        


        
    }
}
