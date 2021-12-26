


const player = document.getElementById('player');

player.addEventListener('click', updateName);

function updateName(){
	let name = prompt('Enter a player name');
	player.textContent = 'Player 1 : ' + name;
}

function createPara() {
	let para = document.createElement('p');
	para.textContent = 'You click on button.';
	document.body.appendChild(para);
}

// const button = document.getElementById('btn');
// button.addEventListener('click', createPara);
