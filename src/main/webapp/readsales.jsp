<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sales.ReadSalesPojo"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Sales Data</title>
<!-- Bootstrap CSS -->
<link
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    rel="stylesheet">
<style>
.table {
    margin-top: 20px;
}
</style>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="sales.jsp">Sales Management</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse"
            data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false"
            aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item"><a class="nav-link"
                    href="addsalesdata.jsp">Add Sales Data</a></li>
                <li class="nav-item"><a class="nav-link"
                    href="updatesalesdata.jsp">Update Sales Data</a></li>
                <li class="nav-item"><a class="nav-link"
                    href="deletesalesdata.jsp">Delete Sales Data</a></li>
                <li class="nav-item active"><a class="nav-link"
                    href="readsales.jsp">View Sales Data</a></li>
            </ul>

            <form class="form-inline my-2 my-lg-0" action="home.jsp"
                method="POST">
                <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Logout</button>
            </form>

        </div>
    </nav>
    <div class="container">
        <h1 class="mt-5 mb-4">View Sales Data</h1>

        <!-- Search Form -->
        <form action="readSalesData" method="post" class="mb-4">
            <div class="form-group">
                <label for="salesid">Enter Sales ID:</label> 
                <input type="text" class="form-control" id="salesid" name="salesid" placeholder="Sales ID">
            </div>
            <button type="submit" class="btn btn-primary" name="action" value="search">Search</button>
            <button type="submit" class="btn btn-info" name="action" value="viewAll">View All</button>
            <!-- Back button -->
            <a href="sales.jsp" class="btn btn-secondary">Back</a>
        </form>

        <!-- Display sales data if available -->
        <div class="table-responsive">
            <table class="table table-bordered">
                <thead class="thead-light">
                    <tr>
                        <th>Sales ID</th>
                        <th>Salesperson Name</th>
                        <th>Target</th>
                        <th>Number of Units</th>
                        <th>Number of Units Sold</th>
                        <th>Completion Status</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    if (request.getAttribute("salesData") != null) {
                        ReadSalesPojo salesData = (ReadSalesPojo) request.getAttribute("salesData");
                    %>
                    <tr>
                        <td><%=salesData.getSalesId()%></td>
                        <td><%=salesData.getSalespersonName()%></td>
                        <td><%=salesData.getTarget()%></td>
                        <td><%=salesData.getNumberOfUnits()%></td>
                        <td><%=salesData.getNumberOfUnitsSold()%></td>
                        <td><%=salesData.getCompletionStatus()%></td>
                    </tr>
                    <%
                    } else if (request.getAttribute("allSalesData") != null) {
                        List<ReadSalesPojo> allSalesData = (List<ReadSalesPojo>) request.getAttribute("allSalesData");
                        for (ReadSalesPojo sales : allSalesData) {
                    %>
                    <tr>
                        <td><%=sales.getSalesId()%></td>
                        <td><%=sales.getSalespersonName()%></td>
                        <td><%=sales.getTarget()%></td>
                        <td><%=sales.getNumberOfUnits()%></td>
                        <td><%=sales.getNumberOfUnitsSold()%></td>
                        <td><%=sales.getCompletionStatus()%></td>
                    </tr>
                    <%
                        }
                    } else if (request.getAttribute("error") != null) {
                    %>
                    <tr>
                        <td colspan="6" class="text-danger"><%=request.getAttribute("error")%></td>
                    </tr>
                    <%
                    }
                    %>
                </tbody>
            </table>
        </div>

    </div>

    <!-- Bootstrap JS -->
    <script
        src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
