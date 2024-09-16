const amazonProduct = {
    name: "Parker Jotter Standard CT Ball Pen (Black)",
    rating: 4.3,
    isDeal: true,
    price: 270,
    offer: 5,
};

console.log(amazonProduct);
console.log(typeof amazonProduct);
console.log(amazonProduct.name);
console.log(amazonProduct.rating);
console.log(amazonProduct.isDeal);
console.log(amazonProduct.price);
console.log(amazonProduct.offer);
console.log(typeof amazonProduct["name"]);
console.log(typeof amazonProduct["rating"]);
console.log(typeof amazonProduct["isDeal"]);
console.log(typeof amazonProduct["price"]);
console.log(typeof amazonProduct["offer"]);

// let num = prompt("Enter a number.");
// if (num % 5 == 0) console.log(num, "is a multiple of 5.");
// else console.log(num, "is not a multiple of 5.");

let data = document.querySelector("h2");
console.dir(data);
console.log(data);

console.dir(data.innerText);
console.log(data.innerText);
console.log(data.textContent); 
console.log(data.innerHTML);

let click = document.querySelector("button");
click.onclick = function () {
    console.log("Button clicked.");
    data.innerHTML = "This is the new Inner HTML";
};


const person = {
    name: "John",
    age: 30,
    address: {
        city: "New York",
        zip: 10001
    }
};

console.log(person);
console.log(person.name);
console.log(person.age);
console.log(person.address);
console.log(person.address.city);
console.log(person.address.zip);

console.dir(person)
