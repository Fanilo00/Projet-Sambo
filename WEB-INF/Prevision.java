package port;
import connex.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public void InsertPrevision(Prevision prevision, Connection conn)
    {
        Connect c = new Connect();
        String sql = "INSERT INTO Prevision VALUES (?,?,?,?)";
        try (PreparedStatement stmnt = conn.prepareStatement(sql)){
            
        stmnt.setInt(1, prevision.getID_Prevision());
        stmnt.setInt(2, prevision.getID_Bateau());
        stmnt.setDate(3, prevision.getDate_debut());
        stmnt.setDate(4, prevision.getDate_fin());

        stmnt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void GetIDPrevision(Prevision prevision, Connection conn)
    {
        Connect c = new Connect();
        String query = "SELECT * FROM Prevision WHERE ID_Prevision = ?";
        try (PreparedStatement stmnt = conn.prepareStatement(query)){
            stmnt.setInt(1, ID_Prevision);
        ResultSet rs = stmnt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("ID_Prevision");
            int idBateau = rs.getInt("ID_Bateau");
            Date debut = rs.getDate("date_debut");
            Date fin = rs.getDate("date_fin");

            rs.close();
            stmnt.close();
            conn.close();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void GetPrevision(Prevision prevision, Connection conn)
    {
        Connect c = new Connect();
        String query = "SELECT * FROM Prevision";
        try (PreparedStatement stmnt = conn.prepareStatement(query)){
            stmnt.setInt(1, ID_Prevision);
            stmnt.setInt(2, ID_Bateau);
            stmnt.setDate(3, date_debut);
            stmnt.setDate(4, date_fin);

        ResultSet rs = stmnt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("ID_Prevision");
            int idBateau = rs.getInt("ID_Bateau");
            Date debut = rs.getDate("date_debut");
            Date fin = rs.getDate("date_fin");

            rs.close();
            stmnt.close();
            conn.close();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
