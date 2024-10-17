package sales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReadSalesDataDAO {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // Change as per your DB driver
    private static final String DB_URL = "jdbc:mysql://localhost:3306/company"; // Change as per your DB URL
    private static final String USER = "root"; // Change as per your DB username
    private static final String PASS = "Nikhil@2004810"; // Change as per your DB password

    public ReadSalesDataDAO() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ReadSalesPojo getSalesData(int salesId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ReadSalesPojo salesData = null;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT salesid, salespersonname, target, numberofunits, numberofunitssold, completionstatus FROM sales WHERE salesid = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, salesId);
            rs = ps.executeQuery();

            if (rs.next()) {
                salesData = new ReadSalesPojo(
                    rs.getInt("salesid"),
                    rs.getString("salespersonname"),
                    rs.getInt("target"),
                    rs.getInt("numberofunits"),
                    rs.getInt("numberofunitssold"),
                    rs.getString("completionstatus")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (ps != null) ps.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
        return salesData;
    }

    public List<ReadSalesPojo> getAllSalesData() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<ReadSalesPojo> allSalesData = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT salesid, salespersonname, target, numberofunits, numberofunitssold, completionstatus FROM sales";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ReadSalesPojo salesData = new ReadSalesPojo(
                    rs.getInt("salesid"),
                    rs.getString("salespersonname"),
                    rs.getInt("target"),
                    rs.getInt("numberofunits"),
                    rs.getInt("numberofunitssold"),
                    rs.getString("completionstatus")
                );
                allSalesData.add(salesData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (ps != null) ps.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
        return allSalesData;
    }
}
