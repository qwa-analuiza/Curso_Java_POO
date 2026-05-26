package com.curso.operacoes;

import com.curso.db.DB;
import com.curso.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transacao {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false); // essa linha não deixa executar tudo automaticamente, ela é iniciada com false e só executa automatico se eu setar pra true

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE departmentId = 3");

            // int x = 1;
            //  if(x < 2){
            //     throw new SQLException("Fake error");
            //  }
            int rows2 = st.executeUpdate("UPDATE  seller SET BaseSalary = 3090 WHERE departmentId = 2");

            conn.commit();// só para confirmar que agora a trasação terminou

            System.out.println("Rows1 : " + rows1);
            System.out.println("Rows2 : " + rows2);

        } catch (SQLException e) {
            try {
                conn.rollback(); // esse código é para voltar ao estado inicial do banco, não deixa parar no meio da transação
                throw new DbException("Transação não foi concluida, por conta do erro: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("error ao tentar dar um roll back" + e1.getStackTrace());
            }

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}

