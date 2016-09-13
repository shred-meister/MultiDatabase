/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.md;

import com.leapfrog.md.db.DBFactory;
import com.leapfrog.md.db.Database;
import com.leapfrog.md.db.MongoDB;
import com.leapfrog.md.db.MySQL;
import com.leapfrog.md.db.Oracle;
import com.leapfrog.md.db.SQLServer;

/**
 *
 * @author Bishal Aryal
 */
public class Program {

    
    public static void main(String[] args) {
        Database db = DBFactory.get("dsf");
        if(db!=null){
            db.open();
            db.execute("Select * from Users.");
            db.execute("Update Users set logincount=logincount+1 where id=1");
            db.close();
        }
        else
            System.out.println("Not supported DB.");
            
        
    }

}
