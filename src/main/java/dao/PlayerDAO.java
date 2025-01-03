package dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.*;
import javax.naming.*;

public class PlayerDAO {
	DataSource ds;
	
	public PlayerDAO() {
        try {
        	Context ic=new InitialContext();
            ds=(DataSource)ic.lookup("java:comp/env/jdbc/MySQLDB");          
            System.out.println("home");
        }catch(NamingException e ) {
        	e.printStackTrace();
        }		
    }
	
	public ArrayList playerList() {
	       Connection conn = null;
	       PreparedStatement pstmt = null;
	       ResultSet rs = null;
	       ArrayList playerList=null;
	       try {
	           conn = ds.getConnection();
	           
	           pstmt = conn.prepareStatement("select * from tb_league");	           
	           rs = pstmt.executeQuery();

	           if (rs.next()) {
	        	   playerList = new ArrayList();
	               do{
	            	   PlayerVO playerVO = new PlayerVO();
	            	   playerVO.setName(rs.getString("name"));
	            	   playerVO.setAddress(rs.getString("address"));
	            	   playerVO.setCity(rs.getString("city"));
	            	   playerVO.setProvince(rs.getString("province"));
	            	   playerVO.setPostalCode(rs.getString("postalCode"));

	            	   playerList.add(playerVO);
				    }while(rs.next());
				}
	       } catch(Exception ex) {
	           ex.printStackTrace();
	       } finally {
	           if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	           if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	           if (conn != null) try { conn.close(); } catch(SQLException ex) {}
	       }
			return (ArrayList)playerList;
	}
	
	public void registerLeague(PlayerVO lVO) {
        try {
        	System.out.println("hong");
            Connection con=ds.getConnection();
            PreparedStatement stmt = con.prepareStatement("insert into tb_player(playerId, password, role, name, address, city, province, postalCode) values(?,?,?,?,?,?,?,?)");
            stmt.setString(1,"12");
            stmt.setString(2,"1332");
            stmt.setString(3,"coo");
            stmt.setString(4,lVO.getName());
            stmt.setString(5,lVO.getAddress());
            stmt.setString(6,lVO.getCity());
            stmt.setString(7,lVO.getProvince());
            stmt.setString(8,lVO.getPostalCode());
            int i= stmt.executeUpdate();
            System.out.println(i+"���� �߰��Ǿ����ϴ�.");
            System.out.println(lVO);
           

            stmt.close();
            con.close();
        }catch(SQLException e) {
        	e.printStackTrace();
        	System.out.println(e.getMessage());
        }catch(Exception e) {
        	System.out.println(e);
        }
    }	
	
}
	


