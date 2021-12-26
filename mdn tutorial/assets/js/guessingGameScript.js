

let randomNum = Math.floor(Math.random() * 100) +1;

const guesses = document.querySelector('.guesses');
const lastResult = document.querySelector('.lastResult');
const lowOrHi = document.querySelector('.lowOrHi');

const guessField = document.querySelector('.guessField');
const guessSubmit = document.querySelector('.guessSubmit');

let guessCount = 1;
let resetButton;

function checkGuess(){
	let userGuess = guessField.value;
	
	if(guessCount == 1) {
		guesses.textContent = 'Previous guess : ';
	}
	guesses.textContent += userGuess + ' ,';
	
	if( userGuess == randomNum){
		lastResult.textContent = 'Congratulations! you got it right';
		lastResult.style.backgroundColor = 'green';
		lowOrHi.textContent = '';
		setGameOver();
	} else if( guessCount == 10){
		lastResult.textContent = 'Game Over !!!';
		lowOrHi.textContent = '';
		setGameOver();
	} else{
		lastResult.textContent = 'Wrong !!';
		lastResult.style.backgroundColor = 'red';
		if (userGuess > randomNum){
			lowOrHi.textContent = 'Last guess was too high !!';
		} else {
			lowOrHi.textContent = 'Last guess was too low !!!';
		}
	}
	
	guessCount++;
	guessField.value = '';
	guessField.focus();
}

//guessSubmit.addEventListener('click', checkGuess);

function setGameOver(){
	guessField.disabled = 'true';
	guessSubmit.disabled = 'true';
	resetButton = document.createElement('button');
	resetButton.textContent = 'Start new Game !! ';
	document.body.append(resetButton);
	resetButton.addEventListener('click', resetGame);
}

function resetGame(){
	guessCount = 1;
	
	const resetParas = document.querySelectorAll('.resultParas p');
	for (let i = 0 ; i < resetParas.length; i++){
		resetParas[i].textContent = '';
	}
	
	resetButton.parentNode.removeChild(resetButton);
	
	guessField.disabled = false;
	guessSubmit.disabled = false;
	guessField.value = '';
	guessField.focus();
	
	lastResult.style.backgroundColor = 'white';
	
	randomNum = Math.floor(Math.random() * 100) + 1; 
}