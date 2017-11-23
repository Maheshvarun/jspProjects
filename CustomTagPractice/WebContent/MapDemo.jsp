<!DOCTYPE html>
<html>
<body>
<div id="map" style="width:100%;height:500px"></div>
<script>
var mapCanvas = document.getElementById("map");
function myMap() 
{
  var myCenter = new google.maps.LatLng(17.4220,78.3389); 
  var myCenter1 = new google.maps.LatLng(17.4946,78.3922); 
  var mapOptions = {center: myCenter1, zoom: 12};
  var map = new google.maps.Map(mapCanvas,mapOptions);
  var marker = new google.maps.Marker({
    position: myCenter,
    animation: google.maps.Animation.BOUNCE
  });
  marker.setMap(map);
  var marker1= new google.maps.Marker({
	    position: myCenter1,
	    animation: google.maps.Animation.BOUNCE
	  });
	  marker1.setMap(map);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjVdX2brCinUre414ufP_d6L2ebtBdB9k&callback=myMap"></script>
</body>
</html>