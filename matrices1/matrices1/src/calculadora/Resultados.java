package calculadora;

import javax.swing.*;
import java.awt.*;

public class Resultados extends JFrame {
  int n;
  int m;
  JTextField[][] matriz;
  public Resultados(int fil, int col, JTextField[][] textFields){
    super("Resultado");
    this.n = col;
    this.m = fil;
    matriz = textFields;
    setSize(500,500);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    initComponents();
    setVisible(true);
  }
  private void initComponents(){
    JPanel ventanaP = new JPanel();
    this.setContentPane(ventanaP);
    ventanaP.setLayout(new GridLayout(1,2));
    JPanel matriz1 = new JPanel();
    matriz1.setLayout(new GridLayout(this.n,this.m));
    matriz1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    for (int i = 0; i < this.n; i++) {
      for (int j = 0; j < this.m; j++) {
        matriz[i][j].setFont(new Font("ComicSans",Font.BOLD,40));
        matriz[i][j].setForeground(new Color(0x3300cc));
        matriz[i][j].setEnabled(false);
        matriz1.add(matriz[i][j]);
      }
    }
    ventanaP.add(matriz1);
  }
}
