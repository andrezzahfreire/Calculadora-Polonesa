import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        JPanel painel = new JPanel();
        String mensagem = new String();
        painel.setLayout(new GridLayout(5, 2, 20, 20)); 

    
        painel.add(new JLabel("Expressão na notação fixada:"));
        painel.add(new JTextField(30));
        painel.add(new JLabel("Expressão na notação pós fixada:"));
        painel.add(new JTextField(30));


        int opcao = JOptionPane.showConfirmDialog(null, painel, "Buscar funcionário", JOptionPane.OK_CANCEL_OPTION);
        if (opcao == JOptionPane.OK_OPTION ) {
            try {
                //mensagem = Listafunc.pesquisarFunc(Integer.parseInt(((JTextField) painel.getComponent(1)).getText())).toString();
                JOptionPane.showMessageDialog(null, mensagem, "Funcionário encontrado", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado", "Funcionário não encontrado", JOptionPane.INFORMATION_MESSAGE);     
            }
            
            
        }
    }
}
