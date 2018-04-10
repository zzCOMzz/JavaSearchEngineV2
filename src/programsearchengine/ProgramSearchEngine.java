/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programsearchengine;
import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Refnaldy
 */
public class ProgramSearchEngine {

    public static void main(String[] args) {
        try{
            int menu=0;
            String pil;
            
            while(menu==0){
                System.out.println("##########################");
                System.out.println("#========== MENU ========#");
                System.out.println("#========================#");
                System.out.println("#==Created by: M. Irvan==#");
                System.out.println("#====== zzCOMzz =========#");
                System.out.println("##########################");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# Web yang Dicari = #");
                System.out.println("# #");
                System.out.println("# #");
                System.out.println("# #");
                
                pil = JOptionPane.showInputDialog("Mau Cari apa? : ");
                System.out.println("#############################");
                
                if (pil == null){
                    JOptionPane.showMessageDialog(null, "WEB Tidak Boleh Kosong");
                } else if (pil.contains("www.")){
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://"+pil));
                } else {
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.com/search?q="+pil+"&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjhytzq667aAhWDrI8KHW2KDAYQAUICigB&biw=1366&bih=594"));
                }
//                java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://google.com/"+pil));  
            }
        }
        catch (Exception ex) { 
            ex.getMessage();
            System.out.println("Error");
            
        }
        System.exit(0);
    }
    
}
