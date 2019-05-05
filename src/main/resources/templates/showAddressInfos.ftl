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
    <legend>Add New User Address Information</legend>
    <form name="addressInfo" action="add" method="post">
    <table>
     <tr>
    <td>Address Reference Id:</td> <td> <input type="text" name="adRefId"/></td>
    <td>Type:</td> <td><input type="text" name="adType" /></td>
    <td>City Name:</td> <td> <input type="text" name="adCity"/></td>
    </tr>
    <tr>
    <td>Road Name:</td> <td> <input type="text" name="adRoad"/></td>
    <td>Road Type:</td> <td> <input type="text" name="adRoadType" /></td>
    <td>House Number:</td> <td> <input type="text" name="adHouseNumber"/></td>
    </tr>
    <tr>
    <td>Post Code:</td> <td> <input type="text" name="adPostCode"/></td>
    <td>Country:</td> <td> <input type="text" name="adCountry" /></td>
    </tr>
    
     <tr>
    <td><input type="submit" value="Save" /></td>
    </tr>
    </table>
    </form>
  </fieldset>
  
        <h2>Address Information List:</h2>
        <table border="1">
            <tr>
                <th>Address Id</th>  
                <th>Address Reference Id</th>
                <th>Type</th> 
                <th>City Name</th>  
                 <th>Road Name</th>   
                  <th>Road Type</th>   
                   <th>House Number</th>   
                    <th>Post Code</th>   
                     <th>Country</th>    
                <th colspan="2">Action</th>
            </tr>       
            <#list addressInfos as addressInfo>
                <tr>
                    <td>${addressInfo.adId}</td> 
                    <td>${addressInfo.adRefId}</td>
                    <td>${addressInfo.adType}</td>
                    <td>${addressInfo.adCity}</td>
                     <td>${addressInfo.adRoad}</td>
                     <td>${addressInfo.adRoadType}</td>
                     <td>${addressInfo.adHouseNumber}</td>
                     <td>${addressInfo.adPostCode}</td>
                     <td>${addressInfo.adCountry}</td>
        
                    <td><a href="AddressInfoController?action=update&adId=${addressInfo.adId}">Update</a></td>
                    <td><a href="AddressInfoController?action=delete&adId=${addressInfo.adId}">Delete</a></td>
         
                </tr>
            </#list>        
        </table>                
    </body>
</html>