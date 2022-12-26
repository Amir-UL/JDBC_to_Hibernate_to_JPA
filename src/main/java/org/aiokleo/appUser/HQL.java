package org.aiokleo.appUser;
import org.hibernate.query.Query;
import java.util.List;

public class HQL {
    public static void main(String[] args) {
        Connection c = new Connection();
        Query q = c.session.createQuery("FROM AppUser WHERE date_of_birth = \"2000-01-01\"");

        List<AppUser> appUserList = q.list();
        for(AppUser user: appUserList){
            System.out.println(user);
        }
    }
}
