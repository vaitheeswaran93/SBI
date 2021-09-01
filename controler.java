

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: controler
 *
 */
 public class controler extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public controler() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
	Bean be = new Bean();
	Customeradd re=new Customeradd();
	String str=request.getParameter("action");
if(str.equals("update")){
	doupdate(request,response);
}

else if(str.equals("delete")){
	boolean doDeletes = re.doDeletes(be.getUsername());
	}
	}

	
private void doupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Integer amount=Integer.parseInt(request.getParameter("amount"));
	Double inter=Double.parseDouble(request.getParameter("rate"));
	Integer month=Integer.parseInt("month");
	String user=request.getParameter("user");
	Integer id=Integer.parseInt("id");
	Double emipayable=Double.parseDouble("emi_payable");
	Double totalinterest=Double.parseDouble("total_interest");
	Double totalpay=Double.parseDouble("totalpay");
	
	Bean ra=new Bean();
	ra.setId(id);
	ra.setUsername(user);
	ra.setEnterthenumberofmonths(month);
    ra.setEntertheniterestrate(inter);
    ra.setEntertheamount(amount);
    ra.setTotalpayment(totalpay);
    ra.setInterestpayable(totalinterest);
    ra.setFinalValue(emipayable);

    Customeradd re=new Customeradd();  
	boolean status = re.registerDetail(ra);

	
	}

	

    private boolean registerDetail() {
	// TODO Auto-generated method stub
	return false;
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
		Integer amount=Integer.parseInt(request.getParameter("amount"));
		Double inter=Double.parseDouble(request.getParameter("rate"));
		Integer month=Integer.parseInt(request.getParameter("month"));
		String user=request.getParameter("user");
		Integer id=Integer.parseInt(request.getParameter("id"));
		Integer loanAmount = amount;
		double rateOfInterest = inter;
		Integer numberOfMonths = month;
		double temp = 1200;           //100*numberofmonths(12))
		double interestPerMonth = rateOfInterest/temp;
		
		double interestpayable = Math.round(loanAmount*(rateOfInterest/100)*numberOfMonths)/365; 

        double onePlusInterestPerMonth = 1 + interestPerMonth;

        double powerOfOnePlusInterestPerMonth = Math.pow(onePlusInterestPerMonth,numberOfMonths);

        double powerofOnePlusInterestPerMonthMinusOne = powerOfOnePlusInterestPerMonth-1;

        double divides = powerOfOnePlusInterestPerMonth/powerofOnePlusInterestPerMonthMinusOne;

		double principleMultiplyInterestPerMonth = loanAmount * interestPerMonth;

        double totalEmi =  principleMultiplyInterestPerMonth*divides;

        double finalValue = Math.round( totalEmi * 100.0 ) / 100.0;
        
        double totalpayment = loanAmount + interestpayable;

        Bean ra = new Bean();
        ra.setId(id);
        ra.setUsername(user);
        ra.setEnterthenumberofmonths(month);
        ra.setEntertheniterestrate(inter);
        ra.setEntertheamount(amount);
        ra.setTotalpayment(totalpayment);
        ra.setInterestpayable(interestpayable);
        ra.setFinalValue(finalValue);
        
        Customeradd re=new Customeradd();
        boolean status=re.registerDetail(ra);
        
        
	 request.setAttribute("emi_payable", finalValue);
	 request.setAttribute("total_interest", interestpayable);
	 request.setAttribute("totalpay", totalpayment);
	 request.getRequestDispatcher("/emi.jsp").forward(request,response);
	}   	  	    
}