/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author santi
 */
public class EmailSender {
    private IEmail serivicioEmail;

    public EmailSender (IEmail serivicioEmail){
        this.serivicioEmail= serivicioEmail;
    }

    public  void enviarEmail(){
        serivicioEmail.enviarEmail();
    }
}
