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
    <legend>New User Registration</legend>
    <form name="userRegistration" action="add" method="post">
    <table>
     <tr>
     
    <td>Address Id:</td> <td> <input type="number" name="userAddressId"/></td>
    <td>First Name:</td> <td> <input type="text" name="userRegistrationFName"/></td>
    <td>Middle Name:</td> <td> <input type="text" name="userRegistrationMName" /></td>
    <td>Last Name:</td> <td> <input type="text" name="userRegistrationLName"/></td>
    </tr>
    <tr>
    <td>Full Name:</td> <td> <input type="text" name="userRegistrationfullName" /></td>
    <td>User Name:</td> <td>  <input type="text" name="userRegistrationName" /></td>
    <td>User Password:</td> <td><input type="password" name="userRegistrationPassword"/></td>
    <td>User Create Date:</td><td><input type="text" name="userRegistrationCrDate"/></td>
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
                <th>Registrated User Id</th>  
                <th>Address Id</th>  
                <th>First Name</th>
                <th>Middle Name</th>
                <th>Last Name</th>
                <th>User Name</th>
                <th>Full Name</th>
                <th>Create Date</th>
                <th colspan="2">Action</th>
            </tr>       
            <#list userRegistrations as userRegistration>
                <tr>
                    <td>${userRegistration.userRegistrationId}</td> 
                    <td>${userRegistration.userAddressId}</td> 
                    <td>${userRegistration.userRegistrationFName}</td>
                    <td>${userRegistration.userRegistrationMName}</td>
                    <td>${userRegistration.userRegistrationLName}</td>
                    <td>${userRegistration.userRegistrationName}</td>
                    <td>${userRegistration.userRegistrationfullName}</td>
                    <td>${userRegistration.userRegistrationCrDate}</td>
                    
                    <td><a href="userRegistration?action=update&userRegistrationId=${userRegistration.userRegistrationId}">Update</a></td>
                    <td><a href="userRegistration?action=delete&userRegistrationId=${userRegistration.userRegistrationId}">Delete</a></td>
                 
                    
                </tr>
            </#list>        
        </table>                
    </body>
</html>