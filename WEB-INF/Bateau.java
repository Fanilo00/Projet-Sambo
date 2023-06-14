public class Bateau {
    int ID_Bateau;
    String categorie;
    int Pavillon;
    
    public void setID_Bateau(int iD_Bateau) {
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
}