

const list = document.querySelector('.output ul');
list.innerHTML='';
let greetings = ['Happy Birthday!', 'Merry Christmas my love', 'A happy Christmas to all the family', 'You\'re all I want for Christmas', 'Get well soon'];

for(let i = 0; i < greetings.length; i++){
	let input = greetings[i];
	
	if(input.indexOf('Christmas') !== -1){
		let result = input;
		let listItem = document.createElement('li');
		listItem.textContent = result;
		list.appendChild(listItem);
	}
}

const capList = document.querySelector('.capList ul');
capList.innerHTML = '';

let cities = ['lonDon', 'ManCHESTer', 'BiRmiNGHAM', 'liVERpoOL'];

for(let i = 0;i< cities.length; i++){
	let city = cities[i];
	let lower = city.toLowerCase();
	let firstLet = lower.slice(0,1);
	let fixCity = lower.replace(firstLet,firstLet.toUpperCase());
	let item = document.createElement('li');
	item.textContent = fixCity;
	capList.appendChild(item);
	
}


const wordList = document.querySelector('.wordList ul');
wordList.innerHTML = '';

let stations = ['MAN675847583748sjt567654;Manchester Piccadilly', 'GNF576746573fhdg4737dh4;Greenfield','LIV5hg65hd737456236dch46dg4;Liverpool Lime Street', 'SYB4f65hf75f736463;Stalybridge', 'HUD5767ghtyfyr4536dh45dg45dg3;Huddersfield'];

for(let i = 0; i < stations.length; i++) {
	let station = stations[i];
	
	let code = station.slice(0,3);
	let ind = station.indexOf(';');
	let name = station.slice(ind + 1);
	let ans = code + ': ' + name;
	let stationList = document.createElement('li');
	stationList.textContent = ans;
	wordList.appendChild(stationList);
}

