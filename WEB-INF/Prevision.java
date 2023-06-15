package port;

import java.sql.Date;

public class Prevision 
{
    int ID_Prevision;
    int ID_Bateau;
    Date date_debut;
    Date date_fin;
    
    public int getID_Prevision() {
        return ID_Prevision;
    }
    public void setID_Prevision(int iD_Prevision) {
        ID_Prevision = iD_Prevision;
    }
    public int getID_Bateau() {
        return ID_Bateau;
    }
    public void setID_Bateau(int iD_Bateau) {
        ID_Bateau = iD_Bateau;
    }
    public Date getDate_debut() {
        return date_debut;
    }
    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }
    public Date getDate_fin() {
        return date_fin;
    }
    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public void InsertPrevision()
    {
        
    }
    
    
}
