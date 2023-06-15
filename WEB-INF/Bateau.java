package sambo;

public class Bateau 
{
    int ID_Bateau;
    String categorie;
    int Pavillon;
    int Nom_Bateau;
    double profondeur;
    
    public void setID_Bateau(int iD_Bateau) 
    {
        ID_Bateau = iD_Bateau;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public void setPavillon(int pavillon) {
        Pavillon = pavillon;
    }
    public int getID_Bateau() {
        return ID_Bateau;
    }
    public String getCategorie() {
        return categorie;
    }
    public int getPavillon() {
        return Pavillon;
    }
    public int getNom_Bateau() {
        return Nom_Bateau;
    }
    public void setNom_Bateau(int nom_Bateau) {
        Nom_Bateau = nom_Bateau;
    }
    public double getProfondeur() {
        return profondeur;
    }
    public void setProfondeur(double profondeur) {
        this.profondeur = profondeur;
    }
    

}