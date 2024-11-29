package br.com.curso;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class optionPane {

    public static void main(String[] args) {
        String titulo = "Soma Dois";
        
        JTextField xField = new JTextField(5);
        JTextField yField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("x:"));
        myPanel.add(xField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("y:"));
        myPanel.add(yField);

        int result = JOptionPane.showConfirmDialog(null, myPanel, titulo,
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            
            float x = Float.parseFloat(xField.getText());
            float y = Float.parseFloat(yField.getText());
            float soma = x + y;
            
            String mensagem = "A soma é: " + soma;
            int tipoMensagem = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, mensagem, titulo, tipoMensagem);
        }else {
            String mensagem = "Operação Cancelada";
            int tipoMensagem = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(null, mensagem, titulo, tipoMensagem);
        }
    }
}