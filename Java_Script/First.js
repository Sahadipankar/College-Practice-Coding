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