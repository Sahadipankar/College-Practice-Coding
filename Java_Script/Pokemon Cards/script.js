let main = document.getElementById("main");
let cards = "";

let random =  [`<img src="Pok 1.jpg" alt="Card 1">`, `<img src="Pok 2.jpg" alt="Card 2">`, `<img src="Pok 3.jpg" alt="Card 3">`, `<img src="Pok 4.jpg" alt="Card 4">`];

for (let i = 1; i <= 55; i++) {
    let randomIndex = Math.floor(Math.random() * random.length);
    cards += `<div class="card">${random[randomIndex]}</div>`
}
main.innerHTML = cards;
main.addEventListener("click", function () {
    location.reload()   // Refreshes the page
});