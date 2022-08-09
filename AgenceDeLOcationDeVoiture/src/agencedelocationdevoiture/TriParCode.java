/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

import java.util.Comparator;

/**
 *
 * @author a
 */
public class TriParCode implements Comparator<Client>
{

    @Override
    public int compare(Client o1, Client o2) {
   return o1.getCode()-o2.getCode();
    }
    

}