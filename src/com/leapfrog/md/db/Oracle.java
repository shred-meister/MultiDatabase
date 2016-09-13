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
public class Oracle extends Database{
    @Override
    public void open() {
        System.out.println("Oracle is open.");
    }

    @Override
    public void execute(String sql) {
        System.out.println("Oracle is executing: " + sql);
    }

    @Override
    public void close() {
        System.out.println("Oracle is closed.");
    }
}
