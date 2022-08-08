/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author wiemhjiri
 */
public class Agence {
 
    private String nom;
    private ListVoitures parking;    
    private Map<Client, ListVoitures> clientVoitureLoue; 

public Agence(String nom) {
//à completer
   
}
public void ajoutVoiture(Voiture v) throws VoitureException{
// à completer
  
}
public void suppVoiture(Voiture v)throws VoitureException{
//à completer
}

public void loueClientVoiture(Client cl, Voiture v)throws VoitureException{
// à completer
}


public void retourClientVoiture(Client cl , Voiture v) throws VoitureException{
// à completer
}
public List<Voiture> selectVoitureSelonCritere(Critere c){
//à completer
}

public Set<Client> ensembleClientsLoueurs(){
// à completer
}

public Collection<ListVoitures> collectionVoituresLouees(){
// à completer
}
public void afficheLesClientsEtLeursListesVoitures(){ 
//à compléter
}
public Map<Client, ListVoitures> triCodeCroissant(){
// à completer
}

public Map<Client, ListVoitures> triNomCroissant(){
    
}
    
}
