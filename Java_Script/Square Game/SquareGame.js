let s1 = document.getElementById("sq1");
let s2 = document.getElementById("sq2");
let s3 = document.getElementById("sq3");
let s4 = document.getElementById("sq4");

s1.addEventListener("mouseenter", function () {
    let a = Math.floor(Math.random() * 100);
    s1.innerHTML = `<h1>${a}</h1>`;
})

s1.addEventListener("mouseleave", function () {
    s1.innerHTML = "<h1>1</h1>";
})

let clr = "green";
s2.addEventListener("mouseenter", function () {
    if (clr == "green") {
        s2.style.backgroundColor = "green";
        clr = "red";
    }
    else if (clr == "red") {
        s2.style.backgroundColor = "red";
        clr = "blue";
    }
    else {
        s2.style.backgroundColor = "blue";
        clr = "green";
    }
})

s2.addEventListener("mouseleave", function () {
    s2.style.backgroundColor = "white";
})

s3.addEventListener("mouseenter", function () {
    cl1 = Math.floor(Math.random() * 256);
    cl2 = Math.floor(Math.random() * 256);
    cl3 = Math.floor(Math.random() * 256);
    s3.style.backgroundColor = `rgb(${cl1}, ${cl2}, ${cl3})`;
});

s3.addEventListener("mouseleave", function () {
    s3.style.backgroundColor = "white";
})

s4.addEventListener("click", function () {
    cl1 = Math.floor(Math.random() * 256);
    cl2 = Math.floor(Math.random() * 256);
    cl3 = Math.floor(Math.random() * 256);


    s1.style.backgroundColor = `rgb(${cl1}, ${cl2}, ${cl3})`;
    s2.style.backgroundColor = `rgb(${cl2}, ${cl3}, ${cl1})`;
    s3.style.backgroundColor = `rgb(${cl3}, ${cl1}, ${cl2})`;

    let a = Math.floor(Math.random() * 100);
    s1.innerHTML = `<h1>${a}</h1>`;
    let b = Math.floor(Math.random() * 100);
    s2.innerHTML = `<h1>${b}</h1>`;
    let c = Math.floor(Math.random() * 100);
    s3.innerHTML = `<h1>${c}</h1>`;

});

s4.addEventListener("mouseleave", function () {
    s1.style.backgroundColor = "white";
    s2.style.backgroundColor = "white";
    s3.style.backgroundColor = "white";
    
    s1.innerHTML = "<h1>1</h1>";
    s2.innerHTML = "<h1>2</h1>";
    s3.innerHTML = "<h1>3</h1>";
})
