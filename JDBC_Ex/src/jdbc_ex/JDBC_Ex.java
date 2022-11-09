package jdbc_ex;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import oracle.jdbc.pool.*;

public class JDBC_Ex {

    final static String DB_URL= "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    final static String DB_USER = "hr";
    final static String DB_PASSWORD = "hr";
    
    public static void main(String args []) throws SQLException{
        OracleDataSource ods = new OracleDataSource();
        ods.setURL(DB_URL);
        ods.setUser(DB_USER); 
        ods.setPassword(DB_PASSWORD);
        Connection connection = ods.getConnection();
        //ArrayList <Jobsal> liste = listeJobs(connection);
        //modifierSalaire(liste, connection);
        //afficherDonne(connection);
        //ex2(connection);
        ex4(connection);
        //connection.close();
    }    
    /*
    public static void afficher(Connection connection)throws SQLException{
        Statement st = connection.createStatement(); //transaction, le statement et utiliser pour executer une requete sql
        String requete = "select distinct job_id from person";
        ResultSet rs = st.executeQuery(requete);//methode pour executer la requete et la mettre dans result set (table 2 dimmension (ligne et colonnes))
        String col;
        while(rs.next()){//si il y a encore des ligne elle continue
            col = rs.getString(1);
            System.out.println(col + "\t");
        }
        rs.close();
        st.close();
    }
    
    public static ArrayList<Jobsal> listeJobs(Connection connection)throws SQLException{
        Statement st = connection.createStatement(); //transaction, le statement et utiliser pour executer une requete sql
        String requete = "select * from person";
        ResultSet rs = st.executeQuery(requete);//methode pour executer la requete et la mettre dans result set (table 2 dimmension (ligne et colonnes))
        ResultSetMetaData meta = rs.getMetaData();
        int nbCol = meta.getColumnCount();
        for (int i=1; i< nbCol; i++){
            System.out.print(meta.getColumnName(i) + "\t");
        }
        System.out.println();
        String col;
        while(rs.next()){
            for (int i=1; i<=nbCol ; i++){
                col = rs.getString(i);
                System.out.print(col + "\t");
            }
            System.out.println();
        }
        rs.close();
        st.close();
        
        Scanner sc = new Scanner (System.in);
        String job;
        double percent;
        
        System.out.println("Saisir job et pourcentage, 'none' pour quitter");
        
        ArrayList <Jobsal> liste = new ArrayList<Jobsal> ();
        while(true){
            System.out.print("Job ID: ");
            job = sc.next();
            if(job.equals("none"))
                break;
            System.out.print("Pourcentage d'augmentation: ");
            percent = sc.nextDouble();
            liste.add(new Jobsal(job, percent));
        }
        
        return liste;
    }
    
    public static void modifierSalaire(ArrayList<Jobsal> liste, Connection connection)throws SQLException{
        String requete = "update person set salary = salary * ? where job_id = ?";
        PreparedStatement ps = connection.prepareStatement(requete);
        int nb;
        Jobsal j;
        double p;
        for(int i=0; i<liste.size(); i++){
            j = liste.get(i);
            p = 1 + j.pourc / 100;
            ps.setDouble(1, p);
            ps.setString(2, j.jobId);
            nb = ps.executeUpdate();
            System.out.println("le salaire est augmente " + j.pourc/100 + "% pour " + nb + " employes de job " + j.jobId);
        }
    }
    
    public static class Jobsal{
        String jobId;
        double pourc;
        
        public Jobsal(String x, double y){
            jobId = x;
            pourc = y;
        }
    }
    */
    
    public static void afficher(Connection connection) throws SQLException{
        Statement statement = connection.createStatement();
        String requete = "select job_id from employees";
        ResultSet rs = statement.executeQuery(requete);
        System.out.println("Job Id: ");
        String a;
        while(rs.next()){
            a = rs.getString(1);
            System.out.println(a);
        }
        rs.close();
        statement.close();
    }
    
    public static void afficherDonne(Connection connection) throws SQLException{
        Statement statement = connection.createStatement();
        String r = ("Select * from person");
        ResultSet rs = statement.executeQuery(r);
        ResultSetMetaData rsmd = rs.getMetaData();
        int nbCol = rsmd.getColumnCount();
        
        for(int i = 1; i <= nbCol ; i++){
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        
        System.out.println();
        while(rs.next()){       
            for (int i =1; i<=nbCol; i++){
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        
        rs.close();
        statement.close();
    }
    
    public static void ex2(Connection connection)throws SQLException{
        Statement st = connection.createStatement();
        String requete = "update person set salary = ? where job_id = ?";
        PreparedStatement pst = connection.prepareStatement(requete);
        Scanner input = new Scanner(System.in);
        System.out.println("donner le job Id: ");
        String jid = input.next();
        System.out.println("donner le salaire: ");
        double salary = input.nextDouble();
        
        pst.setDouble(1,salary);
        pst.setString(2,jid);
        pst.executeUpdate();
    }
    
    public static void ex4(Connection connection) throws SQLException{
        Scanner input = new Scanner(System.in);
        System.out.println("Entre la departement ID: ");
        int dep = input.nextInt();
        String requete = "select * from employees where department_id = ?";
        PreparedStatement pst = connection.prepareStatement(requete);
        pst.setInt(1, 10);
        ResultSet rs = pst.executeQuery(requete);
        ResultSetMetaData rsmd = rs.getMetaData();
        int c = rsmd.getColumnCount();
        while(rs.next()){
            for(int i=1; i<=c ; i++){
                System.out.print(rs.getString(i) + "/t");
                }
            System.out.println();
        }
    }
    
    public static int ajouterEtudiant(Connection connection) throws SQLException{
        Scanner input = new Scanner(System.in);
        System.out.println("Entre l'etudiant id: ");
        int id = input.nextInt();
        System.out.println("Entrer le nom de l'etudiant: ");
        String nom = input.next();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select count(*) from etudiant where etudiant_id = " + id);
        rs.next();
        int i = rs.getInt(1);
        rs.close();
        if(i == 0)
            return -1;
        else{
            st.executeUpdate("insert into etudiant (etudiant_id, nom) values( " + id + ", '" + nom + "')");
            
        }
        st.close();
        return id;
    }
    
    public static void inscrirei(Connection connection, int id) throws SQLException{
        Statement s = connection.createStatement();
        
        ResultSet rs = s.executeQuery("select idcours from cours");
        
        PreparedStatement pst = connection.prepareStatement("insert into inscription (idEtudiant, idcours, note) values ( " +id + " , ?, null)");
         
         
        while(rs.next()){
            pst.setInt(1, rs.getInt(1));
            pst.executeUpdate();
        }
        
        rs.close();
        s.close();
        pst.close();
        
    }
    
    public static void supprimer(Connection connection) throws SQLException{
        Statement st = connection.createStatement();
        String requete = "select courid, count(etudiantid) from inscription group by courid";
        
        ResultSet rs = st.executeQuery(requete);
        
        while (rs.next()){
            
            if(rs.getInt(2) == 1){
                st.executeQuery("delete from cours where cour_id =  " + rs.getInt(1));
            }
        }
        rs.close();
        st.close();
    }
    
    public static void modifier(Connection connection) throws SQLException{
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select idCours, avg(note) from inscription where note is null");
        
        while(rs.next()){
            st.executeUpdate("update inscription set note = " + rs.getInt(2) + " where idcours = " + rs.getInt(1));
        }
        rs.close();
        st.close();
        
    }
    
    public static void afficherMeilleurNote(Connection connection) throws SQLException{
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery("select idCours, nomEtudiant, max(note) from inscription natural join etudian group by idcours");
        ResultSetMetaData rsmd = rs.getMetaData();
        int c = rsmd.getColumnCount();
        while(rs.next()){
            for(int i = 1; i<=c ; i++){
                System.out.print(rs.getString(i) + "/t");
            }
            System.out.println(); 
        }
    }
    
    public static void test1(Connection connection) throws SQLException{
        Scanner input = new Scanner(System.in);
        System.out.println("Saisir un nom d'un pays: ");
        String nomP = input.next();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("Select count(*) from pays where nom_pay = " + nomP);
        rs.next();
        
        if(rs.getInt(1) == 0)
            System.out.println("Pays non trouve");
        else{
            rs = st.executeQuery("Select id-ville, nomVille from ville where id-pays = " + nomP);
            CallableStatement cs = connection.prepareCall("{? = call compter(?)}");
            while(rs.next()){
                cs.setInt(2, rs.getInt(1));
                cs.registerOutParameter(1, Types.INTEGER);
                cs.execute();
                if(cs.getInt(1) != -1)
                    System.out.print("Nom ville" + rs.getString(2) + " population: " + cs.getInt(1));
                else
                    System.out.println("Nom ville: " + rs.getString(2) + " population: Non disponible");
                System.out.println();
            }
        }    
    }
    
    public static void test3(Connection connection) throws SQLException{
        CallableStatement cs = connection.prepareCall("{?=call moyenNote(?)}");
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery("select etudiant_id, nom_etudiant, count(cours_id) from etudiant natural join inscription group by etudiant_id");
        while(rs.next()){
            cs.setInt(2, rs.getInt(1));
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            int res = cs.getInt(1);
        }
    }
    
    public static void question5(Connection connection, int idVille) throws SQLException{
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select id-rue, nom-rue from rue where id-ville = " + idVille);
        PreparedStatement pst = connection.prepareStatement("select id-batiment, nom-batiment from batiment where and nombre-apartement = (select max(nombre-apartement from batiment) id-rue = ?");
        ResultSetMetaData rsmd = rs.getMetaData();
        int c = rsmd.getColumnCount();
        ResultSet rs1;
        while(rs.next()){
            for(int i = 1 ; i <= c ; i++){
                System.out.print(rs.getString(i) + "/t");
            }

            pst.setInt(1, rs.getInt(1));
            rs1 = pst.executeQuery();
            while(rs1.next()){
                for(int i = 1; i <= c; i++){
                    System.out.println(rs1.getString(i) + "/t");
                }
            }
            System.out.println();
        }
        rs.close();
        st.close();
        
    }
    
}
