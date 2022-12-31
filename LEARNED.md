>#### The main Idea behind **Hibernate** is that, say someone said "You don't have to do JDBC 7 Steps Every time. Just pass the Object into ```save()``` Method and Everything will be taken care **Automatically**"
> >### Hibernate Introduce an Automatic Process of Communicating with Database called **ORM**.

>> **Fact:** is In reality we can't avoid the JDBC [Some Steps might be Shortened]
>> > Like ```hibernate.cfg.xml``` in resources directory equivalent to the 2nd and 3rd Step the Loading, registering and Creating Connection.
### The Main Advantage: We don't have to  Write the SQL Query Ourselves.

#### **Note:** Difference between ```@Entity(name="")``` and ```@Table(name="")``` is Briefly Discussed in ```AppUser.java```  file.
>### Public vs Static Class
>> **Public** Class : It is an **access specifier**, which defines who can access this method. ***public access means this method can be accessed by any class*** (if other classes are able to access this class, in which the public method is defined).
> 
>> **Static** Class : A static class is a class that is **created inside a class**, is called a static nested class in Java. It **cannot access non-static data members and methods.** It ***can be accessed by outer class name. It can access static data members of the outer class, including private.***
```java
static class Config {

    // Configuration
    // The application must supply JDBC connections.
    Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AppUser.class); // locating the connection configuration file
    SessionFactory sf = configuration.buildSessionFactory();
    Session session = sf.openSession();

    Transaction t = session.beginTransaction();
    // save is depended on Session interface. Which also can't be used to instantiate an Object. Which belongs to SessionFactory, also an Interface.
    // At the End we got Configuration in out Hand.

    // It's a Static Method
    void configConnection(AppUser appUser) {
        this.session.save(appUser); // The magic word. Which belongs to session class. So, call session
            this.t.commit();
        }
    }
```
>### ```@Embeddable```
> #### Embedded Data into Existing Database. Like ```AllNames.java``` dose.
> - It also **Creates New Columns** in the Existing Database.

- ###  ```FetchType.EAGER``` will fetch all at Once.

>>  ### There are 2 Types of ```OneToMany``` joints available.
>> >- **Unidirectional** (Cons: Creates Extra Table)
>> 
>> >- **Bidirectional**

>> ### And There are 2 Types of Fetching Technic.
>> >- Eager (Need more Resource)
>>
>> >- Lazy

 >>>Caching 
 > 
### Object Array vs List Array & List of Object Array
>> #### ```Object Array``` for 1 Row of Data. 
> - Use ```q.uniqueResult()``` method to fetch data.
>
>> #### ```List Array``` for All Rows.
> - Use ```q.list()``` method for fetching.

### Hibernate Object States
- You can ```UPDATE``` the DB in Persistent State.
- There is ```session.detach();``` 

### Now there is ```Model``` and ```ModelAndView```