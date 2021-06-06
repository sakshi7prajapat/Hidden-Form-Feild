/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/HiddenForm_Servlet1"})
public class HiddenForm_Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
           PrintWriter out=response.getWriter();
           
           try{
                String s=request.getParameter("name");
     
                String p=request.getParameter("mail");
        int count=0;
        String status ="Admin";
        if(s.equals("Admin")){
            status="Admin";
            count=1;
        }
       else if(s.equals("Faculty")){
            status="Faculty";
            count=1;
        }
       else if(s.equals("Student")){
            status="Student";
            count=1;
        }
        else{
            count=0;
        }
        if(count==1){
                    
                out.print("<form action='hiddenFormFieldSer2' method='post'>");
                out.print("<input type='hidden' name='name' value='"+s+"'/>");
                out.print("<input type='hidden' name='mail' value='"+p+"'/>");
                out.print("<input type='hidden' name='status' value='"+status+"'/>");
                out.print("<input type='submit'value='submit'/>");
                out.print("</form>");
                }
                else{
                    out.print("Error");
                }
   } 
   catch(Exception e){
       out.print(e.getMessage().toString());
   }
}
}