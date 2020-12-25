<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 25/12/2020
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Price Product Discount</title>
  </head>
  <body>
  <form method="post" action="/discount_price_war_exploded/discouted-price" style="width: 300px; height: 250px; border: solid 1px black;">
    <div style="margin-left: 50px">
      <h1>Discount Menu</h1>
      <label for="productdesc">Product Description:</label><br>
      <input type="text" id="productdesc" name="productdesc" placeholder="Product Description"><br>
      <label for="price">Product Price</label><br>
      <input type="text" id="price" name="productprice" placeholder="Price"><br>
      <label for="discount">Product Description</label><br>
      <input type="text" id="discount" name="productdiscount" placeholder="Discount: (0.1-1.0)"><br>
      <input type="submit" value="Caculate Price">
    </div>
  </form>
  </body>
</html>
