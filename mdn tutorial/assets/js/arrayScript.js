

const list = document.querySelector('.output ul');
const totalBox = document.querySelector('.output p');

let total = 0;
list.innerHTML = '';
totalBox.textContent = '';

let products = ['Underpants:6.99',
                'Socks:5.99',
                'T-shirt:14.99',
                'Trousers:31.99',
                'Shoes:23.99'];


for(let i = 0; i < products.length; i++){
	let input = products[i];
	let array = input.split(':');
	let productName = array[0];
	let productPrice = Number(array[1]);
	
	total += productPrice;
	
	let ans = productName + '--$' + productPrice;
	
	let itemList = document.createElement('li');
	itemList.textContent = ans;
	list.appendChild(itemList);
}

totalBox.textContent = 'Total : $' + total.toFixed(2);

