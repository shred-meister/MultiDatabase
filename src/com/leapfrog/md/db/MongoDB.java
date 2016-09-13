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
public class MongoDB extends Database{
    @Override
    public void open() {
        System.out.println("MongoDB is open.");
    }

    @Override
    public void execute(String sql) {
        System.out.println("MOngoDB is executing: " + sql);
    }

    @Override
    public void close() {
        System.out.println("MongoDB is closed.");
    }
}
