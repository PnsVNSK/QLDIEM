package Model;
import connection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginModel {

    private String username;
    private String password;
    private int type;

    public LoginModel(String username, String password, int type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }


    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }



    public boolean checklogin(String a, String b){
        String query = "Select 1 from tbluser where username = ? and password =? ";
        try {
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, a);
            ps.setString(2, b);


            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                System.out.println("Dang nhap thanh cong");

            }else {

                return  false;
            }

        } catch (Exception ex){
            ex.printStackTrace();

        }


        return false;
    }














}
