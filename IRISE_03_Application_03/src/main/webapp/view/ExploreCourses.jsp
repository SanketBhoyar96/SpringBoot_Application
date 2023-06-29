<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="/js/getAllCourseFrontend.js"></script>
<style>
      #showCourseAll{
      display: flex;
      flex-flow: row wrap;
      justify-content: center;
      align-items:center;
      width: 100%;
     
      }
     #showCourseAll>#box{
     margin:20px;
        width:22%;
        height:330px;
        background-color: #ffffff;
      box-shadow: rgba(50, 50, 93, 0.25) 0px 2px 5px -1px, rgba(0, 0, 0, 0.3) 0px 1px 3px -1px;
      }
   
      #box>span{
      margin-top:20px;
       font-size:16px;
        font-family: sans-serif;
        color: #002147;
        padding: 10px;
        
      }
        #box>span>iqxwwswa{
          color:purple;
         font-weight: 900;
        margin-left: 10px;
      }
      #box>i{
       font-size:16px;
        font-family: sans-serif;
        color: #002147;
        padding: 10px;
          letter-spacing: 3px;
      }
       #box>i>b{
      color: green;
      font-weight: 900;
         
      }
 
      #box>button{
      width:120px;
         
         margin: 10px;
         background-color: rgb(0,33,71);
         color: white;
         border-radius:10px; 
      }
      #box>button:hover{
         background-color: red; 
         cursor: pointer;
         border: none;
      }

</style>
</head>
<body>


 <!--Explore Our Courses------------------------------------------------------->
             <h2 style="text-align: center; margin-top:10px; color: #313131; font-family:'Poppins', sans-serif; font-weight: 800">Explore Our Courses</h2>
                   
        <div id=showCourseAll>
              
          
           
        
        </div> 
       
        <!--Explore Our Courses----------------------------------------------------------->
        
       
</body>
</html>



<!--    <div id=showCourseAll>
                    <div id="box">
                   <img src="https://ashokitech.com/uploads/course/azure-devops-online-training.jpeg" alt=""" width="269px" height="170px">
                    <span>ID::</span><br>
                  <span>CourseName::</span><br>
                  <span>Duration::</span><br>
                    <i>Fees::</i><br>
                    <button>Preview</button><button>View Details</button>
            </div> 
        </div>-->