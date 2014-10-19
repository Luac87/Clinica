/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_odonto;
import Users.*;
import java.text.*;
import java.util.Date;
import java.util.logging.*;

/**
 *
 * @author LucasPc
 */
public class Clinica_Odonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clinica od = new Clinica();
        Date d = DateConverter("11/12/2014");
        od.MarcarConsulta("1234",d);
        od.MostrarConsultas();
        
    }
    
    public static Date DateConverter(String data)
    {
        SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new  Date();
        try {
            d = x.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Clinica_Odonto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    
}
