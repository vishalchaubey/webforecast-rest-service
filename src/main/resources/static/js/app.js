var d = new Date();
var weekday = new Array(7);
weekday[0] = "Sunday";
weekday[1] = "Monday";
weekday[2] = "Tuesday";
weekday[3] = "Wednesday";
weekday[4] = "Thursday";
weekday[5] = "Friday";
weekday[6] = "Saturday";
var url = "http://3.88.144.128/";

(function($, document, window){
	$.ajax({
		type: "POST",
		headers: {
			"Content-Type": "application/json" 
		},
		url: url+"authenticate",
		data: JSON.stringify({"username":"vishal","password":"password"}),
		error: function(err) {
			localStorage.removeItem('token');

			switch (err.status) {
			case "400":
			default:
				console.log("bad request")
				break;
			}
		},
			success: function(msg) {
				debugger;
				localStorage.setItem('token',msg.token);
			}
	})

	$(document).ready(function(){
		// Cloning main navigation for mobile menu
		$(".mobile-navigation").append($(".main-navigation .menu").clone());

		// Mobile menu toggle 
		$(".menu-toggle").click(function(){
			$(".mobile-navigation").slideToggle();
		});

		$("#find").click(function(e){
	e.preventDefault();
			var code=$('#code').val().trim();
			if(code=='' || isNaN($('#code').val())){
				alert('Please enter valid pincode')
			}
			else{
			$('#find').val("Checking Weather Forecast ...")
				getWeatherDetails(code);
			}
		})

		var map = $(".map");
		var latitude = map.data("latitude");
		var longitude = map.data("longitude");
		if( map.length ){
			
			map.gmap3({
				map:{
					options:{
						center: [latitude,longitude],
						zoom: 15,
						scrollwheel: false
					}
				},
				marker:{
					latLng: [latitude,longitude],
				}
			});
			
		}
	});

	$(window).load(function(){

	});

})(jQuery, document, window);

function getWeatherDetails(code){

	// Call Web API the weather report
	var token = localStorage.getItem('token');
	if(!token){
		alert('Authorization token not found')
	}
	console.log(code);
	var payload=url+"api/Name/"+code.trim();
	$.ajax({
			type: "GET",
			headers: {
				"authorization": 'Bearer ' + token 
			},
			url: payload,
			//data: "json",
			error: function(err) {
			$('#find').val("Find another code")
				$('.error').removeClass('hide')
				$('.success').addClass('hide')
				debugger;
				switch (err.status) {
				case "400":
					console.log("bad request")
					break;
				case "401":
					console.log("bad request")
					break;
				case "403":
					console.log("bad request")
					break;
				default:
					console.log("bad request")
					break;
				}
			},
				success: function(msg) {
					debugger;
			$('#find').val("Find")
					$('.error').addClass('hide')
					$('.success').removeClass('hide')
					var container=$('.today .forecast-content');
					container.find('.location').text(msg.cityName);
					var temp=parseFloat(msg.foreCastTemperatue);
					container.find('.numc').text(((temp-32)/1.8).toFixed(2));
					var dt=new Date(msg.foreCastDate);
					var header=$('.today .forecast-header');
					header.find('.day').text(weekday[dt.getDay()]);
					header.find('.date').text(dt.toDateString().substr(4,d.toDateString().length));
					$('#forecastdesc').text(msg.foreCastExpected);
					// Binding Logic Goes here
				}
			});
	}