package com.demo;

import java.io.*;
import java.net.*;
import java.sql.*;

public class OWASPDemo {

    // A03 - Injection (SQL Injection)
    public void getUser(Connection conn, String userId) throws Exception {
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM users WHERE id = " + userId;
        stmt.executeQuery(sql);
    }
}
