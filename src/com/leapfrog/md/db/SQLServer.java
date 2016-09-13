/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.md.db;

/**
 *
 * @author Bishal Aryal
 */
public class SQLServer extends Database{
    @Override
    public void open() {
        System.out.println("SQLServer is open.");
    }

    @Override
    public void execute(String sql) {
        System.out.println("SQLServer is executing: " + sql);
    }

    @Override
    public void close() {
        System.out.println("SQLServer is closed.");
    }
}
