<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url value="/orders/register/" var="register"/>
<link rel="stylesheet" type="text/css" media="all" href="<c:url value='/resources/calendar/daterangepicker-bs3.css'/>"/>
<script type="text/javascript" src="<c:url value='/resources/calendar/moment.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resources/calendar/daterangepicker.js'/>"></script>
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
<style>
    #map-canvas {
        height: 300%;
        width: 100%;
        padding: 300px
    }
</style>
<script>
    var orderDates={
        start:new Date(),
        end:new Date()
    };
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
    //
    $(document).ready(function () {
        $('#reportrange2 span').html(moment().format('D MMMM, YYYY') + ' - ' + moment().format('D MMMM, YYYY'));
        $('#reportrange2').daterangepicker({
            opens: 'center',
            startDate: orderDates.start,
            format: 'D MMMM, YYYY',
            minDate: new Date()
        }, function(start, end, label) {
           $('#reportrange2 span').html(start.format('D MMMM, YYYY') + ' - ' + end.format('D MMMM, YYYY'));
            orderDates.start=start;
            orderDates.end=end;
    });
    })
</script>
<div>
    <h3><spring:message code="title.Hotel"/></h3>
    <c:if test="${not empty hotel}">
        <address>
            <h3><strong><i>${hotel.name}</i></strong></h3>
            <h4>Category: ${hotel.category}</h4>
            <h4><b>Address:</b></h4>
            <c:if test="${not empty hotel.hotelAddress.county}">
            <b>County:</b> ${hotel.hotelAddress.county}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.city}">
            <b>City: </b>${hotel.hotelAddress.city}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.state}">
            <b>State: </b>${hotel.hotelAddress.state}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.address}">
            <b>Address: </b>${hotel.hotelAddress.address}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.zip}">
            <b>ZIP: </b>${hotel.hotelAddress.zip}<br>
        </c:if>
    </address>
        <div class="well">
            <div style="display: inline-block;">
                <a class="btn btn-primary" onclick="location.href='${register}?hotelId=${hotel.id}&start='+
                        orderDates.start.toDateString()+'&end='+orderDates.end.toDateString();">SEND ORDER TODO</a>
            </div>
            <div id="reportrange2" class="btn"
                 style="display: inline-block; background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                <span></span>
                <b class="caret"></b>
            </div>
        </div>
        <div id="map-canvas" class="col-md-4 well"></div>
    </c:if>
</div>