/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turistar.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import turistar.model.Local;
import turistar.model.Usuario;
import turistar.model.Gratuito;
import turistar.model.Pago;

/**
 *
 * @author Serviços
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Conectando ao banco...");
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/lp2multimarcas","root","root1234");
            ResultSet rs = con.createStatement().executeQuery("select * from Fabricante_Veiculo");
            
            while (rs.next()){
                System.out.println(rs.getString("id") + "\t" + rs.getString("nome"));
                
            }
            System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
          System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
        } catch(SQLException e) {
          System.out.println(e);
          throw new RuntimeException(e);
        } finally {
            if (con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}   