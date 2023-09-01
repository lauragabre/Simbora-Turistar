/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.repositorio;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import turistar.model.Usuario;

public class PopulateArray {
    
    ArrayList<Usuario> usuarios;
      
    public void populateArray()
    {
        try 
        {
         FileInputStream file = new FileInputStream("Usuario.txt"); 
         ObjectInputStream inputFile = new  ObjectInputStream(file);
         
         boolean endOfFile = false;
         
         while (!endOfFile)
         {
             try {
                 usuarios.add((Usuario)inputFile.readObject());
             } 
             catch (EOFException e) 
             {
                 endOfFile = true;

             }
             catch (Exception f)
             {
                 JOptionPane.showMessageDialog(null, f.getMessage());
  
             }
         }
         
         inputFile.close();
        } 
        catch (IOException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
    
