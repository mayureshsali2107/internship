const bodyElement = document.body;


const text1 = document.querySelector(".value1");
text1.style.margin = "20px";

const text2 = document.querySelector(".value2");
text2.style.margin = "20px";

const button1 = document.querySelector(".add");
button1.style.margin = "10px";

const button2 = document.querySelector(".div");
button2.style.margin = "10px";

const button3 = document.querySelector(".mul");
button3.style.margin = "10px";



const head1 = document.querySelector(".head");

head1.style.margin= "40px";
head1.style.marginLeft = "0";
head1.style.fontSize="30px";
head1.style.fontWeigth = "bold";
head1.style.borderBottom="3px solid grey";


const input1= document.querySelector(".value1");
const input2= document.querySelector(".value2");

let val1=0;
let val2=0;

input1.addEventListener("input", (e)=> {
    val1=Number(e.target.value);
    console.log("Value 1 =",val1);
})

input2.addEventListener("input", (e)=> {
    val2=Number(e.target.value);
    console.log("Value 2 =",val2);
})

button1.addEventListener("click", ()=>{
 alert(val1+val2);

})

button2.addEventListener("click", ()=>{
 alert(val1/val2);

})

button3.addEventListener("click", ()=>{
 alert(val1*val2);

})





