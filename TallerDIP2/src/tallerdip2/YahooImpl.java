/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author santi
 */
public class YahooImpl extends Yahoo implements IEmail{
    
    public YahooImpl(String to, String subject, String body, String file) {
        super(to, subject, body, file);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviando email con yahoo");
    }
}
