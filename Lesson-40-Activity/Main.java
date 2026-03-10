
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
   

    String queryResult="";
    String sql ="Select * From cr101 Where teacher1 = 'BANU';";

    String sql0 ="Select * From cr101 Where teacher1 = 'PORCHETTA' AND Period = '10';";

    Database db = new Database("jdbc:sqlite:students.db");

    //queryResult = db.runSQL(sql, "table-auto");
    queryResult = db.runSQL(sql0, "table-auto");
    print(queryResult);

   

    


    
     
  }    
}