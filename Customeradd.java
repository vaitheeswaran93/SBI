import java.sql.*;
import java.util.ArrayList;


public class Customeradd {
	public boolean registerDetail(Bean sib){
		boolean status=false;
		Integer id=sib.getId();
		String login_name=sib.getUsername();
		Integer loan_tenure=sib.getEnterthenumberofmonths();
		Double rate_of_interest=sib.getEntertheniterestrate();
		Integer loan_amount=sib.getEntertheamount();
		Double total_interest=sib.getInterestpayable();
		Double total_amount=sib.getTotalpayment();
		Double interest_permonth=sib.getFinalValue();


		Connection con=null;


		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vaithee","vaithee");
			Statement st=con.createStatement();
			int i = st.executeUpdate("insert into SBI values('"+loan_amount+"','"+rate_of_interest+"','"+loan_tenure+"','"+login_name+"','"+interest_permonth+"','"+total_interest+"',"+id+")");
			if(i>0){
				//status=true;
			}

		}catch(Exception e){
				System.out.println(e);
		}
		return status;

	}
public boolean update(Bean sb) {
		boolean status=false;	
	Integer id=sb.getId();
	String login_name=sb.getUsername();
	Integer loan_tenure=sb.getEnterthenumberofmonths();
	Double rate_of_interest=sb.getEntertheniterestrate();
	Integer loan_amount=sb.getEntertheamount();
	Double total_interest=sb.getInterestpayable();
	Double total_amount=sb.getTotalpayment();
	Double interest_permonth=sb.getFinalValue();
		
		try {
			Statement st = getConnections().createStatement();
			int i=st.executeUpdate("update SBI set (loan_amount=loan_amount,rate_of_interest=rate_of_interest,loan_tenure=loan_tenure,login_name=login_name,interest_permonth=interest_permonth,total_interest=total_interest,id=id)");
			if(i>0){
				status=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return status;
}

public boolean doDeletes(String Username) {
	boolean status=false;
	try {
		Statement st = getConnections().createStatement();
		int i=st.executeUpdate("delete SBI where login_name='"+Username+"')");
		if(i>0){
			status=true;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
	return status;
}




private Connection getConnections() {
	// TODO Auto-generated method stub
	return null;
}
}





