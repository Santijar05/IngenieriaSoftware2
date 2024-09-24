/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author santi
 */
public class TallerDIP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEmail serivicioEmail = new GmailImpl("santi@gmail.com","Validacion","holi","no tiene");
        IEmail serivicioEmail2 = new OutlookImpl("santi@gmail.com","Validacion","holi");
        IEmail serivicioEmail3 = new YahooImpl("santi@gmail.com","Validacion","holi","no tiene");

        EmailSender sistema = new EmailSender(serivicioEmail);
        EmailSender sistema2 = new EmailSender(serivicioEmail2);
        EmailSender sistema3 = new EmailSender(serivicioEmail3);

        sistema.enviarEmail();
        sistema2.enviarEmail();
        sistema3.enviarEmail();
    }
    }
    

