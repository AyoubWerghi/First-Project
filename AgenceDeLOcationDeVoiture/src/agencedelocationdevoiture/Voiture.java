/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

/**
 *
 * @author wiemhjiri
 */
public class Voiture {
    
private int immariculation;
private String marque;
private float prixLocation;

public Voiture(int immariculation, String marque, float prixLocation) {
    this.immariculation=immariculation;
    this.marque=marque;
    this.prixLocation=prixLocation;
}
public int getImmariculation() {
return immariculation;
}
public void setImmariculation(int immariculation) {
this.immariculation = immariculation;
}
public String getMarque() {
return marque;
}
public void setMarque(String marque) {
this.marque = marque;
}
public float getPrixLocation() {
return prixLocation;
}
public void setPrixLocation(float prixLocation) {
this.prixLocation = prixLocation;
}
@Override
public int hashCode() {
return immariculation;
}
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    final Voiture other = (Voiture) obj;
    {
        if (other.immariculation == immariculation) {
            return true;
        }
    }
    return false;
}
@Override
public String toString(){
    return "Voiture{" + "immatriculation=" + cin +" matricule="+matricule+", nom=" + nom + ", prenom=" + prenom + '}';

}
    
}
