package staj_proje;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Database_Connect {

    private Connection connection;
    private Statement statement;

    //veritabanına bağlanma metodumuz.
    public void connection_open() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/staj_proje?zeroDateTimeBehavior=convertToNull", "root", "");
                statement = connection.createStatement();
//                System.out.println("Bağlantı Sağlandı");
            } else {
                System.out.println("Bağlantı Zaten Açık");
            }
        } catch (Exception e) {
            System.out.println("Open Connection Error" + e.toString());
        }
    }

    //veritabanı bağlantı kapatma metodumuz.
    public void conneciton_close() {

        try {
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null) {
                connection.close();
                connection = null;
            }

        } catch (Exception e) {
            // System.out.println("Exception closeConnection" + e.toString());
        }
    }

    //veritabanına ürün ekleme metodumuz.
    public void insert_Urun(int site_id, String urun_ad, String urun_cins, String urun_fiyat,
            String urun_ozellik, String urun_marka, String urun_resim, String urun_link, String urun_skor) {
        try {
            connection_open();
            String selectquery = ("insert into ürünler(site_id,ürün_ad,ürün_cins,ürün_fiyat,ürün_özellik,ürün_marka,ürün_resim,ürün_link,ürün_skor) VALUES (?,?,?,?,?,?,?,?,?)");

            //statement.executeUpdate(selectquery);
            PreparedStatement gir = (PreparedStatement) connection.prepareStatement(selectquery);
            gir.setInt(1, site_id);
            gir.setString(2, urun_ad);
            gir.setString(3, urun_cins);
            gir.setString(4, urun_fiyat);
            gir.setString(5, urun_ozellik);
            gir.setString(6, urun_marka);
            gir.setString(7, urun_resim);
            gir.setString(8, urun_link);
            gir.setString(9, urun_skor);

            gir.executeUpdate();
            conneciton_close();
            System.out.println("kayıt eklendi.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("kayıt yapılamadı.");
        }
    }

  

    public static void main(String[] args) {
        Database_Connect con = new Database_Connect();
        con.connection_open();
    }

}
