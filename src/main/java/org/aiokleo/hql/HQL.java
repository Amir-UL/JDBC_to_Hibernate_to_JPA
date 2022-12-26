package org.aiokleo.hql;
import org.aiokleo.appUser.AppUser;
import org.aiokleo.appUser.Connection;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

public class HQL {
    public static void main(String[] args) {
        Connection c = new Connection();
        Query q = (Query) c.em.createQuery("FROM AppUser WHERE date_of_birth = \"1999-03-07\"");

        List<AppUser> appUserList = q.list();
        for(AppUser user: appUserList){
            System.out.println(" \n Printing The User Details");
            System.out.println(user + "\n");
        }
//    Can be Done with SQL
        Query qNative = (Query) c.em.createNativeQuery("SELECT * FROM appuser;");
//        TODO: How to fetch names they are embedded within a Table Using Native SQL

        List<Object[]> usrData = qNative.list();
        for (Object[] usr: usrData){
            System.out.println( usr[2] + " " + usr[1]);
        }
    }

}
