package org.aiokleo.hql;

import org.aiokleo.appUser.Connection;
import org.hibernate.query.Query;

import java.util.List;

public class HqlObjects {
//    public static void main(String[] args) {
//        Connection c = new Connection();
////         For Storing a Single Row of Object
//        Query q = c.session.createQuery("SELECT name, email FROM AppUser WHERE date_of_birth = \"1999-03-07\"");
//
////         Creating a Object Array to Store the Data.
//        Object[] userData = (Object[]) q.uniqueResult();
//        for(Object user: userData){
//            System.out.println(user);
//        }
//
//        System.out.println("Fetching all name, email Using Object Array List \n");
//
//        // Fetching all name, email Using Object Array List
//        Query qLists = c.session.createQuery("SELECT name, email FROM AppUser ");
//        List<Object[]> usersData = (List<Object[]>) qLists.list();
//
//
//        for(Object[] users: usersData){
//            System.out.println(users[0] + " " + users[1]);
//        }
//    }
}
