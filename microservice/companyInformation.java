package hello;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompanyInformation {
    public ArrayList<String> getCompanies() throws SQLException {
        ArrayList<String> companies = new ArrayList<>();
        String sql;
        PreparedStatement st;
        ResultSet rs;
        Connection db = Database.open();

        sql = "SELECT * FROM companies;";
        st = db.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            companies.add(rs.getString("name"));
        }

        return companies;
    }
}
