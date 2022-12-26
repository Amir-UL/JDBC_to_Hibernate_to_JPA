package org.aiokleo.hql;

import org.aiokleo.appUser.Connection;
import org.hibernate.query.Query;

import java.time.LocalDate;

public class HqlWithVariables {
    public static void main(String[] args) {
        Connection c = new Connection();
//        Let's  User birth dya is 1999-03-07
//        Let's Define a Variable for that
        LocalDate birth_day = LocalDate.parse("1999-03-07");


//         For Storing a Single Row of Object
        Query q = c.session.createQuery("SELECT name, email FROM AppUser WHERE date_of_birth = :birth_day");
        // We have to the where the  birth_day locate.
        q.setParameter("birth_day", birth_day);

//         Creating a Object Array to Store the Data.
        Object[] userData = (Object[]) q.uniqueResult();
        for (Object user : userData) {
            System.out.println(user);
        }
    }
}
