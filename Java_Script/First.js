// const amazonProduct = {
//     name: "Parker Jotter Standard CT Ball Pen (Black)",
//     rating: 4.3,
//     isDeal: true,
//     price: 270,
//     offer: 5,
// };

// console.log(amazonProduct);
// console.log(typeof amazonProduct);
// console.log(amazonProduct.name);
// console.log(amazonProduct.rating);
// console.log(amazonProduct.isDeal);
// console.log(amazonProduct.price);
// console.log(amazonProduct.offer);
// console.log(typeof amazonProduct["name"]);
// console.log(typeof amazonProduct["rating"]);
// console.log(typeof amazonProduct["isDeal"]);
// console.log(typeof amazonProduct["price"]);
// console.log(typeof amazonProduct["offer"]);

// let num = prompt("Enter a number.");
// if (num % 5 == 0) console.log(num, "is a multiple of 5.");
// else console.log(num, "is not a multiple of 5.");

let data = document.querySelector("h2");
// console.dir(data);
// console.log(data);

// console.dir(data.innerText);
// console.log(data.innerText);
console.log(data.textContent);
// console.log(data.innerHTML);

let click = document.querySelector("button");
click.onclick = function () {
    console.log("Button clicked.");
    data.innerHTML = "This is the new Inner HTML";
};


// const person = {
//     name: "John",
//     age: 30,
//     address: {
//         city: "New York",
//         zip: 10001
//     }
// };

// console.log(person);
// console.log(person.name);
// console.log(person.age);
// console.log(person.address);
// console.log(person.address.city);
// console.log(person.address.zip);

// console.dir(person)







// jQuery practice from Code with Harry


$(document).ready(function () {
    console.log('I am in a new file now inside document ready');

    //Your jquery code here
    console.log("We are using jQuery");
    // jQuery Syntax looks like this
    // $('selector').action()

    //clicks on all the p elements.
    // $('p').click(); //click on p
    // $('p').click(function () {
    //     console.log('you clicked on p tag', this);
    //     //  $('#id').hide();
    //     //  $('.class').hide();
    // }); //do this when we click on p tag

    // $('p').dblclick(function () {
    //     console.log('you double clicked on p', this);
    //     //  $('#id').hide();
    //     //  $('.class').hide();
    // });
    // $('p').hover(function () {
    //     console.log('you hoverd on: ', this);
    //     //  $('#id').hide();
    //     //  $('.class').hide();
    // },
    // function (){

    //     console.log('Thanks for coming')
    // });


    // there are three main types of selectors in jQuery 
    // 1. element selector
    // 2. id selector
    // 3. class selector

    // 1. Element selector -  This is an example of element selector which clicks on all p
    // $('p').click();

    // 2. Id selector - this is an example of id selector
    // $('#second').click();

    // 3. Class selector - this is an example of id selector
    // $('.odd').click();

    // other selectors
    // $('*').click() // clicks on all the elements
    // $('p.odd').click() // clicks on all the elements
    // $('p:first').click() // clicks on all the elements

    // Events in jQuery
    // Mouse events = click, dblclick, mouseenter, mouseleave
    // KeyboardEvent = keypress, keydown, MediaKeyStatusMap
    // form events = submit, change, focus, blur
    // document/window events = load, resize, scroll, unload

    // demoing the on method
    // $('p').on(
    //     {
    //         click: function () {
    //             console.log('Thanks for clicking', this);
    //         },
    //         mouseleave: function () {
    //             console.log("mouseleave");

    //         }



    //     })

    $('#wiki').hide(2000, function () {
        console.log("hidden");
    })   
    $('#wiki').show(2000, function () {
        console.log("show");
    })  
    // $("#but").click(function () {
    //     $('#wiki').fadeOut(2000);
    // })
    // $("#but").click(function () {
    //     $('#wiki').fadeIn(2000);
    // })
    
    $('#but').on ({
        click: function () {
            $('#wiki').toggle(2000); // Animation chaining
        },
        mouseenter: function () {
            $('#wiki').css('color','green');
        },
        mouseleave: function () {
            $('#wiki').css('color','brown');
        }
});

    //     fadeIn()
    // fadeOut()
    // fadeToggle()
    // fadeTo()

    // Slide methods - speed and callback parameters are optional
    // $('#wiki').slideUp(1000, function(){
    //     console.log('done');
    // })
    // $('#wiki').slideDown(1000)
    // $('#wiki').slideToggle(1000)

    // Animate function in jQuery
    // $('#wiki').animate({
    //     opacity:0.3,
    //     height: '150px',
    //     width:'350px'

    // }, "fast")
    // $('#wiki').animate({ opacity: 0.3 }, 4000);
    // $('#wiki').animate({ opacity: 0.9 }, 1000);
    // $('#wiki').animate({ width: '350px' }, 12000);

    // $('#ta').val('setting it to harry');
    // $('#ta').html('setting it to harry');
    // $('#ta').html('setting it to harry3');
    // $('#inp').html('setting it to harry3');
    // $('#inp').val('setting it to harry3');
    // $('#inp').empty()
    // $('#wiki').empty()
    // $('#wiki').text('you are good')
    // $('#wiki').remove()

    //     $('#wiki').addClass('myclass')
    // $('#wiki').addClass('myclass2')
    // $('#wiki').removeClass('myclass2')
    // $('#wiki').css('background-color', 'red')
    // $('#wiki').css('background-color')

    // AJAX Using jQuery
    // $.get('https://code.jquery.com/jquery-3.3.1.js', function (data, status) { alert(data); })

    // $.get('https://code.jquery.com/jquery-3.3.1.js', function (data, status) { alert(status); })

    // $.post('https://code.jquery.com/jquery-3.3.1.js',
    //     { name: 'harry', channel: 'code with harry' },
    //     function (data, status) { alert(status) });

});