import javax.swing.JOptionPane;

public class SomaComprimentoStrings {
    public static void main(String[] args) {
        String string1 = JOptionPane.showInputDialog("Digite a primeira String:");
        String string2 = JOptionPane.showInputDialog("Digite a segunda String:");
        String string3 = JOptionPane.showInputDialog("Digite a terceira String:");

        int comprimento1 = string1.length();
        int comprimento2 = string2.length();
        int comprimento3 = string3.length();

        int somaComprimentos = comprimento1 + comprimento2 + comprimento3;

        JOptionPane.showMessageDialog(null, "A soma dos comprimentos das Strings é: " + somaComprimentos);
    }
}
