package league;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LeagueVO;
import dao.PlayerVO;

import service.LeagueService;

@WebServlet("/LeagueServlet")
public class LeagueServlet extends HttpServlet {	
	LeagueService service;
	
	public LeagueServlet() {
        service = new LeagueService();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("euc-kr");         
        
        String choice = request.getParameter("choice");
        
		if(choice.equals("list-leagues")) {
			listLeagues(request, response);
		} else if(choice.equals("add-league")) {
			addLeague(request, response);
	    } else if (choice.equals("register-league")) {
	    	System.out.println("***");
	    	registerLeague(request, response);
	    }
    }
    
    protected void addLeague(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String year=request.getParameter("year");
        String season=request.getParameter("season");
        String title=request.getParameter("title");
        
        LeagueVO lVO=new LeagueVO(year, season, title);        
		service.addLeague(lVO);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("addLeague.jsp");
        request.setAttribute("lVO",lVO);
        dispatcher.forward(request,response);
        
		
	}
    protected void registerLeague(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String year=request.getParameter("year");
        String season=request.getParameter("season");
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        String city=request.getParameter("city");
        String province=request.getParameter("province");
        String postalCode=request.getParameter("postalCode");
        String division=request.getParameter("division");
        System.out.println("dfsa");
        PlayerVO vo=new PlayerVO(year,season, name, address, city, province, postalCode,division);        
		service.registerLeague(vo);
		System.out.println("3423");
		RequestDispatcher dispatcher=request.getRequestDispatcher("registerLeague.jsp");
        request.setAttribute("vo",vo);
        dispatcher.forward(request,response);
		System.out.println("#####");

	}
    protected void listLeagues(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList leagueList = service.listLeagues();
		RequestDispatcher dispatcher=request.getRequestDispatcher("leagueList.jsp");
        request.setAttribute("leagueList",leagueList);
        dispatcher.forward(request,response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
