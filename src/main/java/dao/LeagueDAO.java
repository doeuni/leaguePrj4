package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.*;
import javax.naming.*;

public class LeagueDAO {
	DataSource ds;
	
	public LeagueDAO() {
        try {
        	Context ic=new InitialContext();
            ds=(DataSource)ic.lookup("java:comp/env/jdbc/MySQLDB");                
        }catch(NamingException e ) {
        	e.printStackTrace();
        }		
    }
	
	public ArrayList listLeagues() {
	       Connection conn = null;
	       PreparedStatement pstmt = null;
	       ResultSet rs = null;
	       ArrayList leagueList=null;
	       try {
	           conn = ds.getConnection();
	           
	           pstmt = conn.prepareStatement("select * from tb_league");	           
	           rs = pstmt.executeQuery();

	           if (rs.next()) {
	        	   leagueList = new ArrayList();
	               do{
	            	   LeagueVO leagueVO = new LeagueVO();
	            	   leagueVO.setId(rs.getString("id"));
	            	   leagueVO.setYear(rs.getString("year"));
	            	   leagueVO.setSeason(rs.getString("season"));
	            	   leagueVO.setTitle(rs.getString("title"));
					  
	            	   leagueList.add(leagueVO);
				    }while(rs.next());
				}
	       } catch(Exception ex) {
	           ex.printStackTrace();
	       } finally {
	           if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	           if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	           if (conn != null) try { conn.close(); } catch(SQLException ex) {}
	       }
			return (ArrayList)leagueList;
	}
	public void addLeague(LeagueVO lVO) {
        try {
            Connection con=ds.getConnection();
            PreparedStatement stmt = con.prepareStatement("insert into tb_league(year, season, title) values(?,?,?)");
            stmt.setString(1,lVO.getYear());
            stmt.setString(2,lVO.getSeason());
            stmt.setString(3,lVO.getTitle());
            int i= stmt.executeUpdate();		
            System.out.println(i+"행이 추가되었습니다.");

            stmt.close();
            con.close();
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }	
	
}
