package com.stqa.pft.tests;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.stqa.pft.model.GroupData;
import com.stqa.pft.model.Groups;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

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
            ResultSet rs = st.executeQuery("select group_id,group_name,group_header,group_footer " +
                    "from group_list");
            Groups groups = new Groups();
            while (rs.next()) {
                new GroupData().withId(rs.getInt("group_id")).
                        withName(rs.getString("group_name")).
                        withHeader(rs.getString("group_header")).
                        withFooter(rs.getString("group_footer"));
            }
            rs.close();
            st.close();
            conn.close();
            System.out.println(groups);

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
