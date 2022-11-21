/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.MainFrame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileOperations {
    MainFrame MF = new MainFrame();
   public void savefile(){
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Invoice");
        int userSelection = fileChooser.showSaveDialog(MF);
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            //lets write to file
         
            try {
                  FileWriter fw = new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0 ; i <MF.table1.getRowCount(); i++) {
                    for (int j = 0 ; j < MF.table1.getColumnCount(); j++) {
                        //write
                        bw.write(MF.table1.getValueAt(i, j).toString()+",");
                    }
                    bw.newLine();//record per line 
                }
                JOptionPane.showMessageDialog(MF, "SUCCESSFULLY LOADED","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(MF, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
        }
}
}
