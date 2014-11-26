<style>#map-canvas {
    height: 300%;
    width: 100%;
    margin: 0px;
    padding: 300px
}
</style>
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>

<script>
    function initialize(Lat, Lng) {
        var myLatLng = new google.maps.LatLng(Lng, Lat);
        var mapOptions = {
            zoom: 4,
            center: myLatLng,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        var map = new google.maps.Map(document.getElementById('map-canvas'),
                mapOptions);
    }

    //google.maps.event.addDomListener(window, 'load', initialize);
</script>


<div id="map-canvas" class="col-md-4 well"></div>
