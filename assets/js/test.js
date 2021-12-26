// console.log('hello');
// var x = 5;
// var y = 6;
// var z = x + y;
// document.getElementById("demo").innerHTML
// = "The value of z : " + z;

// var m = 1;
// var m = 2;

// const car = {
	// name : "Toyota",
	// model : 534,
	// color : "Black",
	// start : function() {
		// console.log("Car has started");
		// this.drive();
	// },
	// drive : function() {
		// console.log("Car is moving");
	// }
	// };
	
	// console.log(car.name);
	// car.start();
	// console.log(car['model']);
	
	// let x = 55;
	// let  x = new Number(5);
	// console.log(x);
	
	// function displayDate() {
		// document.getElementById('demo').innerHTML = Date();
	// }
	
	// let x = "Meem";
	// console.log(x.indexOf("m"));
	// console.log(x.lastIndexOf("e"));
	// console.log(x.includes("eee"));
	// x=x.replace("ee","eeee");
	// x = x.toUpperCase();
	// console.log(x);
	// let y = new String("Meem");
	// console.log(x.length);
	// console.log(x===y);
	
	const words = ['hello', 'world', 'welcome','hello'];
	words[0] = 'meem';
	words.push('monira');
	
	
	let length = words.length;
	console.log(length);
	
	// let tex = "<ul>";
	// for(let i = 0; i < length; i++){
		// tex += "<li>" + words[i] + "</li>";
	// }
	// tex+= "</ul>";
	let tex = "<ul>";
	words.forEach(myValue);
	tex+= "</ul>";
	
	console.log(words);
	
	function myValue(value) {
		tex += "<li>" + value + "</li>";
	};
	
	console.log(typeof(words));
	document.getElementById("demo").innerHTML = tex;
