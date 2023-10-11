/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author arija
 */
public class session {
    private static String user,id;
    private static int row;
    
    public static void setuser(String user){
        session.user = user;
        
    }
    
    public static String getuser(){
    return user;
    }
    
    public static void setrow(int row){
        session.row = row;
        
    }
    
    public static int getrow(){
    return row;
    }
    
    public static void setid(String id){
        session.id = id;
        
    }
    
    public static String getid(){
    return id;
    }
    
}
