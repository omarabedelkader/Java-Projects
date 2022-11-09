/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Omar
 */
public class Route {
    
   
    String ville ; double distance ; Route suivante ;
    
    Route (String v)
        { ville =v; distance =0; suivante=null; }
    Route (String v, double d, Route s) 
        {ville = v; distance = d; suivante = s ; }
}

class ListeRoutes{
    
Route premier;
ListeRoutes()
    { premier = null; }
ListeRoutes (Route v)
    { premier=v; }

}
