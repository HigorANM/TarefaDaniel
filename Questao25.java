/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões.pk
        gdo.livro.fundamentos.da.programação.de.computador.cap;

import javax.swing.JOptionPane;

public class Questao25
{
    public static void main(final String[] args) {
        double hex, hf, resul, min;
        hex = Double.parseDouble(JOptionPane.showInputDialog("informe "
                + "o numero"));
        hf = Double.parseDouble(JOptionPane.showInputDialog("informe"
                + " o numero"));
        resul = hex - ((2/3)*hf);
        min = resul * 60;
        if (min >= 2400) {
            JOptionPane.showMessageDialog(null, "bonus de 500 reais");
        }
        else if (min >= 1800) {
            JOptionPane.showMessageDialog(null, "bonus de 400 reais");
        }
        else if (min >= 1200) {
            JOptionPane.showMessageDialog(null, "bonus de 300 reais");
        }
        else if (min >= 600) {
            JOptionPane.showMessageDialog(null, "bonus de 200 reais");
        }
        else {
            JOptionPane.showMessageDialog(null, "bonus de 100 reais");
        }
    }
}
