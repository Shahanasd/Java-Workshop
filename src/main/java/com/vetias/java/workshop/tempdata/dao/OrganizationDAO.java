package com.vetias.java.workshop.tempdata.dao;
import org.h2.jdbcx.JdbcDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OrganizationDAO {
    public void createTable(){
        JdbcDataSource h2dDataSource = new JdbcDataSource();
        h2dDataSource.setURL("jdbc:h2:mem:tempdataDB");
        h2dDataSource.setUser("sa");
        try(Connection conn= h2dDataSource.getConnection()) {
            Statement stmt = conn.createStatement();
            stmt.execute("""
                    create table organization(
                        id int AUTO_INCREMENT PRIMARY KEY,
                        name varchar(100),
                        website varchar(100),
                        email varchar(100),
                        contact_number varchar(15),
                        registration_no INT,
                    """);
        } catch (SQLException e) {
            System.out.println("Error creating table:"+e.getMessage());
        }
    }
}
