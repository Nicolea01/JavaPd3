
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

    String sql2 = "Select studentId From cr101";

    String sql3 ="Select studentId, course, period From cr101 Where room In('322', '105','106','323') AND Grade = '11';";

     String sql4 ="Select * From cr101 Where course LIKE 'M%' AND course LIKE '%X';";

    Database db = new Database("jdbc:sqlite:students.db");

    queryResult = db.runSQL(sql, "table-auto");
    queryResult = db.runSQL(sql0, "table-auto");
    queryResult = db.runSQL(sql2, "table-auto");
    queryResult = db.runSQL(sql3, "table-auto");
    queryResult = db.runSQL(sql4, "table-auto");

    print(queryResult);

   

    


    
     
  }    
}