<!DOCTYPE html>
<html>
    <head>
        <title>Registred User</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css" />
        </head>
        <body body style="background-color:powderblue;">
  <fieldset>
    <legend>Add New User Role Information</legend>
    <form name="userRole" action="add" method="post">
    <table>
     <tr>
    <td>Name:</td> <td> <input type="text" name="userRoleName"/></td>
    <td>Type:</td> <td> <input type="text" name="userRoleType" /></td>
    <td>Create Date:</td> <td> <input type="text" name="userRoleDate"/></td>
    </tr>
     <tr>
    <td><input type="submit" value="Save" /></td>
    </tr>
    </table>
    </form>
  </fieldset>
  
        <h2>Registrated User List:</h2>
        <table border="1">
            <tr>
                <th>User Role Id</th>  
                <th>Name</th>  
                <th>Type</th>
                <th>Create Date</th>
                <th colspan="2">Action</th>
            </tr>       
            <#list userRoles as userRole>
                <tr>
                    <td>${userRole.userRoleId}</td> 
                    <td>${userRole.userRoleName}</td> 
                    <td>${userRole.userRoleType}</td>
                    <td>${userRole.userRoleDate}</td>
                    <td><a href="userRole?action=update&userRoleId=${userRole.userRoleId}">Update</a></td>
                    <td><a href="userRole?action=delete&userRoleId=${userRole.userRoleId}">Delete</a></td>
                 
                    
                </tr>
            </#list>        
        </table>                
    </body>
</html>