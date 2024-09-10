/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author santi
 */
public class Yahoo extends Email{
    private String file;

    public Yahoo(String file, String to, String subject, String body) {
        super(to, subject, body);
        this.file = file;
    }
}
    
