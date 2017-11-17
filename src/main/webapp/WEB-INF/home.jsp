<%--<link rel="import" href="../templates/navbar.jsp">--%>
<%@include file="templates/header.jsp"%>
<%@include file="navbar.jsp"%>

<c:url value="../static/js/navbar.js" var="test" />
<script src ="${test}"></script>

<script>
    $(document).ready(function () {
        getConferences();
    })
</script>

<h2>Welcome to NFL Management</h2>


<%@include file="templates/footer.jsp"%>