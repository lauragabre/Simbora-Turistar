/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.repositorio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import turistar.model.Local;

public class SaveLocais {
    
    ArrayList<Local> locais;
    
    public void saveLocais()
    {
        try 
        {
            FileOutputStream file = new FileOutputStream("Local.txt");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);    
            
           for (int n = 0; n < locais.size() ; n++)
           {
               outputFile.writeObject(locais.get(n));
           }
            
           outputFile.close();
           
           JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } 
            catch (IOException e) 
            {
                 JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
}
