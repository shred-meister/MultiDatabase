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
public abstract class Database {
    public abstract void open();
    public abstract void execute(String sql);
    public abstract void close();
    
}
