import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

public class Prevision 
{
    int ID_Prevision;
    int ID_Bateau;
    
    public int getID_Prevision() 
    {
        return ID_Prevision;
    }
    public void setID_Prevision(int iD_Prevision) 
    {
        ID_Prevision = iD_Prevision;
    }
    public int getID_Bateau() 
    {
        return ID_Bateau;
    }
    public void setID_Bateau(int iD_Bateau) 
    {
        ID_Bateau = iD_Bateau;
    }

     public Pointnoir[] getbateaubyid(Connection con,String Idrn)throws Exception
    {

        String request="select * from Pointnoire where Id_rn='"+Idrn+"' and pos_debut between"+ debut+"and + "+fin+ "and pos_fin between"+debut+ "and"+fin;
        Statement st=con.createStatement();
        ResultSet result = st.executeQuery(request);
        Vector vect=new Vector();
            while(result.next())
            {
                vect.add(new Pointnoir(result.getString(1),result.getString(2),result.getDouble(3),
                result.getDouble(4),result.getDouble(5),result.getDouble(6)));
            }
            Pointnoir[] listpn=new Pointnoir[vect.size()];
            vect.copyInto(listpn);
            return listpn;
    }


}
