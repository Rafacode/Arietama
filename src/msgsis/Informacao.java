/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msgsis;

import javax.swing.JOptionPane;

/**
 *
 * @author rafaelgs
 */
public class Informacao {
    
    public void Informacao(String msg){
        JOptionPane.showMessageDialog(null, "<html><body><align='center'>"+msg+"</p></body></html>", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
