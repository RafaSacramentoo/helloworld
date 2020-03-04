
import java.awt.FlowLayout; // especifica como os componentes são organizados 
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing 
import javax.swing.Icon; // interface utilizada para manipular imagens 
import javax.swing.ImageIcon; // carrega imagens

public class LabelFrame extends JFrame {

    private JLabel label1; // JLabel apenas com texto
    private JLabel label2; // JLabel construído com texto e ícone 
    private JLabel label3; // JLabel com texto e ícone adicionados

    // construtor LabelFrame adiciona )Labels a JFrame 
    public LabelFrame() {
        super("Testing JLabel");
        setLayout(new FlowLayout()); // configura o layout de frameSt ri ng especificada
        // Construtor JLabel com um argumento de string            Cia1 
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is labell");
        add(label1); // adiciona o labell ao )Frame

        // construtor JLabel com string, Icon e argumentos de alinhamento 
        Icon bug = new ImageIcon(getClass().getResource("bugl.png"));
        label2 = new JLabel("Label with text and icon", bug,
                SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); // adiciona labell ao lFrame

        label3 = new JLabel(); // Construtor JLabel sem argumentos
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug); // adiciona o ícone ao JLabel       utiliz; 
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3); // adiciona label3 ao JFrame 
    } // fim do construtor LabelFrame
}
 
