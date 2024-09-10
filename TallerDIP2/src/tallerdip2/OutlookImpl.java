/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author santi
 */
public class OutlookImpl extends Outlook implements IEmail{
    
    public OutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }

    @Override
    public void enviarEmail(){
        System.out.println("Enviando a outlook");
    }
}
