
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        int operacao;
        double resultado;

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2: "));
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer: 1 - Adição /n 2 - Subtração /n 3 - Divisão /n 4 - Multiplicação"));

        switch (operacao) {
            case 1:
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
                break;
            case 2:
                 resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);

                break;
            case 3:
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "O resultado é:" + resultado);
                break;
            default:
            JOptionPane.showMessageDialog(null, "seu calculo é:" + operacao);

        }
    }
}
