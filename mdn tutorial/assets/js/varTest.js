

const buttonA = document.querySelector('#button_A');
const headingA = document.querySelector('#heading_A');

buttonA.onclick = function(){
	let name = prompt('What is your name??');
	alert('Hello ' + name + ', nice to meet you!!!!!');
	headingA.textContent = 'Welcome ' + name;
};


const machineBtn = document.getElementById('btn');
const txt = document.getElementById('txt');

function updateBtn(){
	if (machineBtn.textContent === 'Start machine'){
		machineBtn.textContent = 'Stop machine';
		txt.textContent = 'The machine has started.';
	} else {
		machineBtn.textContent = 'Start machine';
		txt.textContent = 'The machine has stoped';
	}
};

machineBtn.addEventListener('click',updateBtn);