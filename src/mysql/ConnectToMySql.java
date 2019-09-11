package mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectToMySql {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet table;

    public Connection getConnection(String url, String userName, String password) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ee) {
            System.out.println("Check Driver");
            ee.printStackTrace();
        }
        connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Database Connected");
        return connection;
    }

    public List<String> readMyDatabase(String query, String column1, String column2, String column3) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employees?useSSL=false";
        String userName = "root";
        String password = "root1234";
        List<String> list;
        ConnectToMySql connectToMySql = new ConnectToMySql();
        connectToMySql.getConnection(url, userName, password);
        statement = connection.createStatement();
        table = statement.executeQuery(query);
        list = getResultDataSet(column1, column2, column3);
        return list;
    }

    public static List<String> getResultDataSet(String column1, String column2, String column3) throws SQLException {
        List<String> dataList = new ArrayList<>();
        while (table.next()) {
            String value1 = table.getString(column1);
            String value2 = table.getString(column2);
            String value3 = table.getString(column3);
            dataList.add(value1);
            dataList.add(value2);
            dataList.add(value3);
        }
        return dataList;
    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/employees?useSSL=false";
        String userName = "root";
        String password = "root1234";
        ConnectToMySql connectToMySql = new ConnectToMySql();
        connectToMySql.getConnection(url, userName, password);
        List<String> stringList;

        String query = "select * from employees.empoyee_detail;";
        stringList = connectToMySql.readMyDatabase(query, "name", "id", "salary");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i));
        }
    }
}