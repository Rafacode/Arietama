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
public class Erro {
    
    public void Erro(String msg){
        JOptionPane.showMessageDialog(null, msg, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
}
