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
public class DBFactory {
    public static Database get(String key){
        if(key.equalsIgnoreCase("MySQL")){
            return new MySQL();
        }
        else if(key.equalsIgnoreCase("SQLServer")){
            return new SQLServer();
        }
        else if(key.equalsIgnoreCase("Oracle")){
            return new Oracle();
        }
        else if(key.equalsIgnoreCase("MongoDB")){
            return new MongoDB();
        }
        return null;
    }
}
