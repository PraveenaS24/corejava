package com.chainsys.Jdbc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.*;
public class JDBCtest {

		public static void main(String args[]) throws Exception {
			// selectColumnsRead();
			// databaseMetadataInterface();
			// totalNumberOfTables();
			// insertImage();
			//storeFileInDatabase();
			//callableStatement();
			//FuncSum();
			transactionManagementPreparedStatement();
			 //fetch();
		}

		public static void ResultSetMetaData() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");

				PreparedStatement ps = con.prepareStatement("select * from emp");
				ResultSet rs = ps.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();

				System.out.println("Total columns: " + rsmd.getColumnCount());
				System.out.println("Column Name of 1st column: " + rsmd.getColumnName(2));
				System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(2));

				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public static void ResultSetMetaDat() throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Arivu9384@36");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from emp765");

			// getting the record of 3rd row
			rs.absolute(2);
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

			con.close();
		}

		public static void fetchdatas() {
			try {
				Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");
				java.sql.Statement mystat = myCon.createStatement();
				ResultSet myRs = mystat.executeQuery("select * from employees");
				while (myRs.next()) {
					System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
				}
				myCon.close();
			} catch (Exception err) {
				err.printStackTrace();
			}
		}

		public static void InsertRecordsPressN() throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Arivu9384@36");

			PreparedStatement ps = con.prepareStatement("insert into emp130 values(?,?,?)");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			do {
				System.out.println("enter id:");
				int id = Integer.parseInt(br.readLine());
				System.out.println("enter name:");
				String name = br.readLine();
				System.out.println("enter salary:");
				float salary = Float.parseFloat(br.readLine());

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setFloat(3, salary);
				int i = ps.executeUpdate();
				System.out.println(i + " records affected");

				System.out.println("Do you want to continue: y/n");
				String s = br.readLine();
				if (s.startsWith("n")) {
					break;
				}
			} while (true);

			con.close();
		}

		public static void selectColumnsRead() {
			final String QUERY = "SELECT EMAIL FROM Employees";
			// Open a connection
			try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"Arivu9384@36"); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(QUERY);) {
				// Extract data from result set
				while (rs.next()) {
					// Retrieve by column name

					System.out.println(", Last: " + rs.getString("EMAIL"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static void storedDatasInsert() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");
				PreparedStatement ps = myCon.prepareStatement("insert into FileTable values(?,?)");
				ps.setInt(1, 1555501);
				// ps.setCharacterStream(2, fr,(int)f.length());
				ps.setString(2, "myar");
				int i = ps.executeUpdate();
				System.out.println(i + " " + "record affected");
				myCon.close();
			} catch (Exception err) {
				err.printStackTrace();
			}
		}

		public static void insertUpdateDelete() throws Exception {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Arivu9384@36");
			Statement stmt = con.createStatement();

			int result = stmt.executeUpdate("insert into emp765 values(33,'Aary',50000)");
			// int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000
			// where id=33");
			// int result=stmt.executeUpdate("delete from emp765 where id=33");
			System.out.println(result + " records affected");
			con.close();
		}

		public static void InsertPrepared() {
			try {

				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");

				PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?,?,?)");
				stmt.setInt(1, 101);// 1 specifies the first parameter in the query
				stmt.setString(2, "Rat");
				stmt.setInt(3, 200);
				stmt.setString(4, "mari");
				int i = stmt.executeUpdate();
				System.out.println(i + " records inserted");

				// Prepared Statement update the records from the table

				/*
				 * PreparedStatement
				 * stmt1=con.prepareStatement("update emp1 set Name='Omumar' where Sno=33"); //
				 * int result= stmt1.executeUpdate("insert into emp1 values(33,'Omkumar')");
				 * stmt1.setInt(1, 33); stmt1.setString(2, "Om");
				 * 
				 * int i=stmt1.executeUpdate(); System.out.println(i+" records updated");
				 */

				// Delete the records from the table
				/*
				 * PreparedStatement
				 * stmt=con.prepareStatement("delete from emp where emp_id=?");
				 * stmt.setInt(1,10004);
				 * 
				 * int i=stmt.executeUpdate(); System.out.println(i+" records deleted");
				 */

				// Retrieve the records from the table
				/*
				 * PreparedStatement stmt=con.prepareStatement("select * from emp"); ResultSet
				 * rs=stmt.executeQuery(); while(rs.next()){
				 * System.out.println(rs.getInt(1)+" "+rs.getString(2)); }
				 */
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public static void databaseMetadataInterface() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");

				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");
				DatabaseMetaData dbmd = con.getMetaData();

				System.out.println("Driver Name: " + dbmd.getDriverName());
				System.out.println("Driver Version: " + dbmd.getDriverVersion());
				System.out.println("UserName: " + dbmd.getUserName());
				System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
				System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public static void totalNumberOfTables() {
			try {
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");

				DatabaseMetaData dbmd = con.getMetaData();
				String table[] = { "TABLE" };
				ResultSet rs = dbmd.getTables(null, null, null, table);

				while (rs.next()) {
					System.out.println(rs.getString(3));
				}
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public static void insertImage() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");

				PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?)");
				ps.setString(1, "sinoinl");

				FileInputStream fin = new FileInputStream("d:\\2.png");
				ps.setBinaryStream(2, fin, fin.available());
				int i = ps.executeUpdate();
				System.out.println(i + " records affected");

				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void storeFileInDatabase() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
						"Arivu9384@36");

				PreparedStatement ps = con.prepareStatement("insert into filetale values(?,?)");

				File f = new File("d:\\myfile.txt");
				FileReader fr = new FileReader(f);

				ps.setInt(1, 101);
				ps.setCharacterStream(2, fr, (int) f.length());
				int i = ps.executeUpdate();
				System.out.println(i + " records affected");

				con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void callableStatement() throws Exception 
		{
			  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","Arivu9384@36");  
			  
			CallableStatement stmt=con.prepareCall("{call INSERTR(?,?)}");  
			stmt.setInt(1,1011);  
			stmt.setString(2,"Amit");  
			stmt.execute();  
			  
			System.out.println("success");  
			}  
       
      public static void FuncSum() throws Exception 
      {
    	  Class.forName("oracle.jdbc.driver.OracleDriver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:oracle:thin:@localhost:1521:xe","system","Arivu9384@36");  
    		  
    		CallableStatement stmt=con.prepareCall("{?= call sum4(?,?)}");  
    		stmt.setInt(2,10);  
    		stmt.setInt(3,43);  
    		stmt.registerOutParameter(1,Types.INTEGER);  
    		stmt.execute();  
    		  
    		System.out.println(stmt.getInt(1));  
    		}
  
    public static void transactionManagementPreparedStatement()
  {
    try {  
          
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arivu9384@36");  
        con.setAutoCommit(false);  
          
        PreparedStatement ps=con.prepareStatement("insert into user366 values(?,?,?)");  
          
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        while(true){  
          
        System.out.println("enter id");  
        String s1=br.readLine();  
        int id=Integer.parseInt(s1);  
          
        System.out.println("enter name");  
        String name=br.readLine();  
          
        System.out.println("enter salary");  
        String s3=br.readLine();  
        int salary=Integer.parseInt(s3);  
          
        ps.setInt(1,id);  
        ps.setString(2,name);  
        ps.setDouble(3,salary);  
        ps.executeUpdate();  
          
        System.out.println("commit/rollback");  
        String answer=br.readLine();  
        if(answer.equals("commit")){  
        con.commit();  
        }  
        if(answer.equals("rollback")){  
        con.rollback();  
        }  
          
        System.out.println("Want to add more records y/n");  
        
        String ans=br.readLine();  
        if(ans.equals("n"))
        {  
        break;  
        }  
          
        }  
        con.commit();  
        System.out.println("record successfully saved");  
          
        con.close();//before closing connection commit() is called  
        }
         catch(Exception e){System.out.println(e);
         }  
      }
    public static void fetch() throws Exception{  
    	Class.forName("oracle.jdbc.driver.OracleDriver");  
    	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arivu9384@36");  
    	con.setAutoCommit(false);  
    	  
    	Statement stmt=con.createStatement();  
    	stmt.addBatch("insert into user366 values(190,'abhi',40000)");  
    	stmt.addBatch("insert into user366 values(191,'umesh',50000)");  
    	  
    	stmt.executeBatch();//executing the batch  
    	System.out.println();
    	con.commit();  
    	con.close();  
    	}
    }  
   

	


