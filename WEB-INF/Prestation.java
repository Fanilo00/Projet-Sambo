public class Prestation {
    int ID_Prestation;
    int ID_Quai;
    int ID_Bateau;
    int Remorquage;
    int Stationnement;
    int prix_reparation;

    public void setID_Prestation(int iD_Prestation) {
        ID_Prestation = iD_Prestation;
    }
package port;

    public int getID_Prestation() {
        return ID_Prestation;
    }

    public int getID_Quai() {
        return ID_Quai;
    }

    public void setID_Quai(int iD_Quai) {
        ID_Quai = iD_Quai;
    }

    public int getID_Bateau() {
        return ID_Bateau;
    }

    public void setID_Bateau(int iD_Bateau) {
        ID_Bateau = iD_Bateau;
    }

    public int getRemorquage() {
        return Remorquage;
    }

    public void setRemorquage(int remorquage) {
        Remorquage = remorquage;
    }

    public int getStationnement() {
        return Stationnement;
    }

    public void setStationnement(int stationnement) {
        Stationnement = stationnement;
    }

    public int getPrix_reparation() {
        return prix_reparation;
    }

    public void setPrix_reparation(int prix_reparation) {
        this.prix_reparation = prix_reparation;
    }

    
    
}
