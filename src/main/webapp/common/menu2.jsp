<%@ include file="/common/taglibs.jsp"%>

<menu:useMenuDisplayer name="Velocity" config="navbarMenu.vm" permissions="rolesAdapter">
<div class="collapse navbar-collapse" id="navbar" style="float: right !important;">
<ul class="nav navbar-nav">
    <c:if test="${empty pageContext.request.remoteUser}">
        <li class="active">
            <a href="<c:url value="/login"/>"><fmt:message key="login.title"/></a>
        </li>
    </c:if>

    <menu:displayMenu name="Logout"/>
</ul>
</div>
</menu:useMenuDisplayer>
