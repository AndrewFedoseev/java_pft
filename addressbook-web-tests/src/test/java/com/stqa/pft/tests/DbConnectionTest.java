package com.stqa.pft.tests;

import com.stqa.pft.model.GroupData;
import com.stqa.pft.model.Groups;
import org.testng.annotations.Test;

import java.sql.*;

/**
 * Created by Andrii.Fiedosieiev on 6/27/2017.
 */
public class DbConnectionTest {
    @Test
    public void testDbConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccollabdb?user=root&password=admin");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * " +
                    "from user");
            Groups groups = new Groups();
            while (rs.next()) {
                groups.add(new GroupData().withId(rs.getInt("user_id")).
                        withName(rs.getString("user_name")));
                    //    withHeader(rs.getString("group_header")).
                    //    withFooter(rs.getString("group_footer")));
            }
            rs.close();
            st.close();
            conn.close();
            System.out.println(groups.size());

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
