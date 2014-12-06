<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url value="/orders/register/param" var="registerPath"/>
<link rel="stylesheet" type="text/css" media="all" href="<c:url value='/resources/calendar/daterangepicker-bs3.css'/>"/>
<script type="text/javascript" src="<c:url value='/resources/calendar/moment.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/calendar/daterangepicker.js'/>"></script>
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
<c:set value="reportrange2" var="calendar"/>
<style>
    #map-canvas {
        height: 300%;
        width: 100%;
        padding: 300px
    }
</style>
<script>
    var orderDatas={
        start:new Date(),
        end:new Date(),
        places:1,
        roomCategory:"ECONOMY"
    };

    //
    $(document).ready(function () {
        $('\#${calendar} span').html(moment().format('D MMMM, YYYY') + ' - ' + moment().format('D MMMM, YYYY'));
        $('\#${calendar}').daterangepicker({
            opens: 'center',
            startDate: orderDatas.start,
            format: 'D MMMM, YYYY',
            minDate: orderDatas.start
        }, function (start, end) {
            $('\#${calendar} span').html(start.format('D MMMM, YYYY') + ' - ' + end.format('D MMMM, YYYY'));
            orderDatas.start=start;
            orderDatas.end=end;
    });
    })
    function sendOrder(){
        location.href='${registerPath};hotelId=${hotel.id};start='+orderDatas.start.valueOf()+
                ';end='+orderDatas.end.valueOf()+';places='+orderDatas.places+
                ';roomCategory='+orderDatas.roomCategory;
    }
</script>
<script type="text/javascript">
    //
    function initialize() {
        var mapOptions = {
            zoom:12,
            center: new google.maps.LatLng(${hotel.hotelLocation.locLat}, ${hotel.hotelLocation.locLong}),
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        var map = new google.maps.Map(document.getElementById('map-canvas'),
                mapOptions);
    }
    //
    google.maps.event.addDomListener(window, 'load', initialize);
</script>
<div>
    <h3><spring:message code="title.Hotel"/></h3>
    <c:if test="${not empty hotel}">
        <address>
            <h3><strong><i>${hotel.name}</i></strong></h3>
            <h4><spring:message code="hotel.Category"/>: ${hotel.category}</h4>
            <h4><b><spring:message code="address.Address"/>:</b></h4>
            <c:if test="${not empty hotel.hotelAddress.state}">
                <b><spring:message code="address.State"/>: </b>${hotel.hotelAddress.state}<br>
            </c:if>
            <c:if test="${not empty hotel.hotelAddress.county}">
                <b><spring:message code="address.County"/>: </b> ${hotel.hotelAddress.county}<br>
            </c:if>
            <c:if test="${not empty hotel.hotelAddress.city}">
                <b><spring:message code="address.Sity"/>: </b>${hotel.hotelAddress.city}<br>
            </c:if>
            <c:if test="${not empty hotel.hotelAddress.address}">
                <b><spring:message code="address.Address"/>: </b>${hotel.hotelAddress.address}<br>
            </c:if>
            <c:if test="${not empty hotel.hotelAddress.zip}">
                <b><spring:message code="address.ZIP"/>: </b>${hotel.hotelAddress.zip}<br>
            </c:if>
        </address>
        <div class="well">
            <div style="display: inline-block;">
                <input type="button" class="btn btn-primary"
                        onclick="sendOrder();"
                        value="<spring:message code='send.Order'/>"/>
            </div>
            <div id="${calendar}" class="btn"
                 style="display: inline-block; background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                <span></span>
                <b class="caret"></b>
            </div>
        </div>
        <div id="map-canvas" class="col-md-4 well"></div>
    </c:if>
</div>