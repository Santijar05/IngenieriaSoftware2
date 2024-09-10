/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author santi
 */
public class GmailImpl extends Gmail implements IEmail {

     public GmailImpl(String to, String subject, String body, String image) {
        super(to, subject, body, image);
    }
     
    @Override
    public void enviarEmail() {
        System.out.println("Enviando email a gmail");
    }
    
    
    
}
