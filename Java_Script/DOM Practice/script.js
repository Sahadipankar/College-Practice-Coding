let x = document.querySelector("h1");
setTimeout(function () {
    x.innerHTML = "Hello";
    x.style.color = "red";
    x.style.backgroundColor = "yellow";
},4000);

let y = document.querySelector("h2");
setTimeout(function () {
    y.innerHTML = "I'm Fine. Thank You";
    y.style.color = "navy";
    y.style.backgroundColor = "lime";
},8000);

let z = document.querySelector("h3");
setTimeout(function () {
    z.innerHTML = "Nothing much. Just chilling";
    z.style.color = "white";
    z.style.backgroundColor = "brown";
},12000);




let a = document.getElementById("id1");
a.addEventListener("click", function () {
    a.style.color = "red";
    a.style.backgroundColor = "yellow";
});
a.addEventListener("mouseleave", function () {
    a.style.color = "blue";
    a.style.backgroundColor = "white";
});

let b = document.getElementById("id2");
b.addEventListener("mouseenter", function () {
    b.style.color = "brown";
    b.style.backgroundColor = "Orange";
});

b.addEventListener("mouseleave", function () {
    b.style.color = "blue";
    b.style.backgroundColor = "white";
});

let c = document.getElementById("id3");
b.addEventListener("click", function () {
    c.style.color = "yellow";
    c.style.backgroundColor = "red";
});

b.addEventListener("mouseleave", function () {
    c.style.color = "blue";
    c.style.backgroundColor = "white";
});