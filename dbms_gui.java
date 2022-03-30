import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*; 
import java.util.concurrent.TimeUnit; 
 

public class dbms_gui {
	
	static String driver = "com.mysql.cj.jdbc.Driver"; 
	static String url = "jdbc:mysql://localhost:3306/transportation_company"; 
	static String user = "root"; 
	static String password = "will990206";
	
	//Button func: SELECT_FROM_WHERE
	public static ArrayList<String> SELECT_FROM_WHERE() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from customer where C_id = '1234'");
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String colname = "";
						
			for (int i = 1; i <= columnCount; i++ ) {
				colname += rsmd.getColumnName(i) + "	";	
			}
			myArrayList.add(colname);			
			while(rset.next()){
				String result = rset.getString(1) + "	" + rset.getString(2) + "	" + rset.getString(3) + "	";
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute SELECT_FROM_WHERE success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}
	
	//Button func: DELETE
	public static void DELETE() { 
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "DELETE FROM customer WHERE customer.C_id = '1234'";
			int rset = stmt.executeUpdate(s);
			stmt.close();
			conn.close();
			System.out.println("execute DELETE success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return;
	}	
	
	//Button func: INSERT
	public static void INSERT() { 	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "INSERT INTO customer (C_id, name, phone_no) values ('1234', 'Will', '1436473423')";
			int rset = stmt.executeUpdate(s);
			stmt.close();
			conn.close();
			System.out.println("execute INSERT success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return;
	}
	
	//Button func: UPDATE
	public static void UPDATE() { 
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "UPDATE customer SET customer.name = 'Bill', customer.phone_no = '2035923058' WHERE customer.C_id = '1234'";
			int rset = stmt.executeUpdate(s);
			stmt.close();
			conn.close();
			System.out.println("execute UPDATE success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return;
	}
		
	//Button func: IN
	public static ArrayList<String> IN() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT * FROM customer WHERE customer.name IN ('Dale', 'Charlie', 'Leo')";
			ResultSet rset = stmt.executeQuery(s);
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String colname = "";
						
			for (int i = 1; i <= columnCount; i++ ) {
				colname += rsmd.getColumnName(i) + "	";	
			}
			myArrayList.add(colname);			
			while(rset.next()){
				String result = rset.getString(1) + "	" + rset.getString(2) + "	" + rset.getString(3) + "	";
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute IN success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}	
	
	//Button func: NOT_IN
	public static ArrayList<String> NOT_IN() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT * FROM customer WHERE customer.name NOT IN ('Dale', 'Charlie', 'Leo')";
			ResultSet rset = stmt.executeQuery(s);
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String colname = "";
						
			for (int i = 1; i <= columnCount; i++ ) {
				colname += rsmd.getColumnName(i) + "	";	
			}
			myArrayList.add(colname);			
			while(rset.next()){
				String result = rset.getString(1) + "	" + rset.getString(2) + "	" + rset.getString(3) + "	";
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute NOT_IN success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}

	//Button func: EXISTS
	public static ArrayList<String> EXISTS() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT * FROM package WHERE EXISTS (SELECT name FROM customer WHERE customer.C_id = package.sender_id AND package.weight < 20)";
			ResultSet rset = stmt.executeQuery(s);
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String colname = "";
						
			for (int i = 1; i <= columnCount; i++ ) {
				colname += rsmd.getColumnName(i) + "	";	
			}
			myArrayList.add(colname);
			while(rset.next()){
				String result = rset.getString(1) + "	" + rset.getString(2) + "	" + rset.getString(3) + "	" + rset.getString(4) + "	" + rset.getString(5) + "	" + rset.getString(6);
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute EXISTS success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}	
	
	//Button func: NOT_EXISTS
	public static ArrayList<String> NOT_EXISTS() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT * FROM package WHERE NOT EXISTS (SELECT name FROM customer WHERE customer.C_id = package.sender_id AND package.weight < 20)";
			ResultSet rset = stmt.executeQuery(s);
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnCount = rsmd.getColumnCount();
			String colname = "";
						
			for (int i = 1; i <= columnCount; i++ ) {
				colname += rsmd.getColumnName(i) + "	";	
			}
			myArrayList.add(colname);			
			while(rset.next()){
				String result = rset.getString(1) + "	" + rset.getString(2) + "	" + rset.getString(3) + "	" + rset.getString(4) + "	" + rset.getString(5) + "	" + rset.getString(6);
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute NOT_EXISTS success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}	
	
	//Button func: COUNT
	public static ArrayList<String> COUNT() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT COUNT('C_id') AS NumberOfCustomer FROM customer";
			ResultSet rset = stmt.executeQuery(s);
			while(rset.next()){
				String result = "NumberOfCustomer: " + rset.getString(1) + "		";
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute COUNT success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}
	
	//Button func: SUM
	public static ArrayList<String> SUM() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT SUM(package.weight) FROM package WHERE package.receiver_id = '354750'";
			ResultSet rset = stmt.executeQuery(s);
			while(rset.next()){
				String result = "package.receiver_id = '354750' all packages weight is: " + rset.getString(1);
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute SUM success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}
	
	//Button func: MAX
	public static ArrayList<String> MAX() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT MAX(package.weight) FROM package WHERE package.receiver_id = '354750'";
			ResultSet rset = stmt.executeQuery(s);
			while(rset.next()){
				String result = "MAX package weight is: " + rset.getString(1) + "	";
				myArrayList.add(result);
			}	
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute MAX success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}	
	
	//Button func: MIN
	public static ArrayList<String> MIN() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT MIN(package.weight) FROM package WHERE package.receiver_id = '354750'";
			ResultSet rset = stmt.executeQuery(s);	
			while(rset.next()){
				String result = "MIN package weight is: " + rset.getString(1) + "		";
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute MIN success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}
	
	//Button func: AVG
	public static ArrayList<String> AVG() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT AVG(package.weight) FROM package WHERE package.receiver_id = '354750'";
			ResultSet rset = stmt.executeQuery(s);
			while(rset.next()){
				String result = "AVG of packages weight is: " + rset.getString(1);
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute AVG success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}
	
	//Button func: HAVING
	public static ArrayList<String> HAVING() { 
		ArrayList<String> myArrayList = new ArrayList<String>();	
		try(Connection conn = DriverManager.getConnection(url, user, password)){
			Statement stmt = conn.createStatement();
			String s = "SELECT COUNT(package.address) As address_num, package.address FROM package GROUP BY address HAVING COUNT(package.address) >= 0";
			ResultSet rset = stmt.executeQuery(s);
			while(rset.next()){
				String result = "number of " + rset.getString(2) + " is " + rset.getString(1) + "		";
				myArrayList.add(result);
			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.println("execute HAVING success");
		}
		catch(SQLException e) { 
			e.printStackTrace(); 
		}
		return myArrayList;
	}	
	
	//for input_query & button func
	static JTextField instr;
	static JTextArea textarea;
	static JButton b1,b2;
	
	public static void main(String[] args) { 
		//test Jdbc driver
		try{Class.forName(driver);}
		catch(ClassNotFoundException e){ 
			System.out.println("NO~~"); 
			e.printStackTrace(); 
		} 
		
		//create GUI
		JFrame demo = new JFrame();
        //set GUI size
		demo.setSize(1000, 450);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p1 = new JPanel();
		textarea = new JTextArea();
		textarea.setFont(new Font("Helvetica", 0, 18));
		
		//design Button func
		JComboBox jComboBox = new JComboBox();
		jComboBox.setBounds(640, 0, 170, 30);
		jComboBox.addItem("SELECT");
		jComboBox.addItem("DELETE");
		jComboBox.addItem("INSERT");
		jComboBox.addItem("UPDATE");
		jComboBox.addItem("IN");
		jComboBox.addItem("NOT_IN");
		jComboBox.addItem("EXISTS");
		jComboBox.addItem("NOT_EXISTS");
		jComboBox.addItem("COUNT");
		jComboBox.addItem("SUM");
		jComboBox.addItem("MAX");
		jComboBox.addItem("MIN");
		jComboBox.addItem("AVG");
		jComboBox.addItem("HAVING");
		jComboBox.addItem("MySql");
		jComboBox.addActionListener(new ActionListener(){
			@Override
            public void actionPerformed(ActionEvent e){
				String getOption = (String) jComboBox.getSelectedItem();
				//System.out.println(getOption);
				ArrayList<String> result_list = new ArrayList<String>();
				String result = "";
				switch (getOption) {
                    case "SELECT":
                        //get result list
						result_list = SELECT_FROM_WHERE();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
                    case "DELETE":
                        DELETE();
                        break;
                    case "INSERT":
                        INSERT();
                        break;
					case "UPDATE":
                        UPDATE();
                        break;
					case "IN":
                        //get result list
						result_list = IN();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "NOT_IN":
                        //get result list
						result_list = NOT_IN();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "EXISTS":
                        //get result list
						result_list = EXISTS();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "NOT_EXISTS":
                        //get result list
						result_list = NOT_EXISTS();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "COUNT":
                        //get result list
						result_list = COUNT();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "SUM":
                        //get result list
						result_list = SUM();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "MAX":
                        //get result list
						result_list = MAX();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "MIN":
                        //get result list
						result_list = MIN();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "AVG":
                        //get result list
						result_list = AVG();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "HAVING":
                        //get result list
						result_list = HAVING();
						result = "";
						for (int i = 0;i < result_list.size();i++) {
							String s = (String)result_list.get(i);
							result += s + "\n";
						}
						textarea.setText(result);
                        break;
					case "MySql":
                        textarea.setText("");
                        break;
                }
			}
		});
		
		//design input_query func
		b1 = new JButton("executeUpdate");
		b2 = new JButton("executeQuery");
		instr = new JTextField(50);
		//design executeUpdate func
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String s1 = e.getActionCommand();
				if (s1.equals("executeUpdate")) {
					//execute instruction
					try(Connection conn = DriverManager.getConnection(url, user, password)){
						Statement stmt = conn.createStatement();
						String s2 = instr.getText();
						int rset = stmt.executeUpdate(s2);	
						stmt.close();
						conn.close();
						System.out.println("executeUpdate instruction success");
					}
					catch(SQLException error) { 
						error.printStackTrace(); 
					}	
					// set the text of field to blank
					instr.setText("  ");
				}
			}
		});
		//design executeQuery func
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String s1 = e.getActionCommand();
				if (s1.equals("executeQuery")) {
					ArrayList<String> myArrayList = new ArrayList<String>();	
					//execute instruction
					try(Connection conn = DriverManager.getConnection(url, user, password)){
						Statement stmt = conn.createStatement();
						String s2 = instr.getText();
						ResultSet rset = stmt.executeQuery(s2);
						ResultSetMetaData rsmd = rset.getMetaData();
						int columnCount = rsmd.getColumnCount();
						String colname = "";
						//store field name
						for (int i = 1; i <= columnCount; i++ ) {
							colname += rsmd.getColumnName(i) + "	";	
						}
						myArrayList.add(colname);
						//store result
						while(rset.next()){
							String result = "";
							for (int i = 1; i <= columnCount; i++ ) {
								result += rset.getString(i) +  "	";
								
							}
							myArrayList.add(result);
						}
						String result = "";
						for (int i = 0;i < myArrayList.size();i++) {
							String s = (String)myArrayList.get(i);
							result += s + "	" + "\n";
						}
						//show.setText(result);
						textarea.setText(result);
						rset.close();
						stmt.close();
						conn.close();
						System.out.println("executeQuery instruction success");
					}
					catch(SQLException error) { 
						error.printStackTrace(); 
					}
					// set the text of field to blank
					instr.setText("  ");
				}
			}
		});
		
		//init & create GUI
        p1.add(instr);
        p1.add(b1);
		p1.add(b2);
		p1.add(jComboBox);
		p1.add(textarea);
		demo.add(p1);
        demo.setVisible(true);
    }
}