/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4.teht5;

/**
 *
 * @author Asse
 */
public class Laktoositon extends AbstractMeijeriFactory{

    public Laktoositon() {
        map.put("MAITO", Maito::new);
        map.put("JUUSTO", Juusto::new);
        map.put("JUGURTTI", Jugurtti::new);
    }
    
}
