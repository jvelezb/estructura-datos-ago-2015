<%@page import="java.io.*"%>
<%
 //File creation
 String strPath = "/Users/juanvelezballesteros/prueba.txt";
 File strFile = new File(strPath);
 boolean fileCreated = strFile.createNewFile();
 //File appending
 Writer objWriter = new BufferedWriter(new FileWriter(strFile));
 objWriter.write("This is a test");
 objWriter.flush();
 objWriter.close();
%> 