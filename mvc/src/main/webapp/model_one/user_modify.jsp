<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MVC</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href="css/user.css" type="text/css">
<script language="JavaScript">
function userModify() {
	if ( f.name.value == "" ) {
		alert("ì´ë¦ì ìë ¥íì­ìì.");
		f.name.focus();
		return false;
	}
	f.action = "user_modify_action.jsp";
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br>
<table width=780 border=0 cellpadding=0 cellspacing=0>
	<tr>
	  <td width="20"></td>
	  <td>
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>íìê´ë¦¬ - íìì ë³´ìì </b></td>
		  </tr>
	  </table>  
	  <br>
	  
	  <form name="f" method="post">
	  <table border="0" cellpadding="0" cellspacing="1" width="590" bgcolor="BBBBBB">
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">ìì´ë</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				abc
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">ë¹ë°ë²í¸</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<input type="password" style="width:150" name="password">
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">ì´ë¦</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<input type="text" style="width:240" name="name" value="íê¸¸ë">
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">ì´ë©ì¼ ì£¼ì</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<input type="text" style="width:240" name="email" value="abc@daum.net">
			</td>
		  </tr>		  
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">íìë±ê¸</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<select name="status">
					<option value="1">ì¼ë°íì</option>
					<option value="9">ê´ë¦¬ì</option>
				</select>
			</td>
		  </tr>	
	  </table>
	  </form>
	  <br>
	  
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td align=center>
			<input type="button" value="ìì " onClick="userModify();">
			<input type="button" value="ëª©ë¡" onClick="location.href='user_list.jsp';">
			</td>
		  </tr>
	  </table>

	  </td>
	</tr>
</table>  

</body>
</html>