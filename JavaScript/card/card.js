const bodyElement = document.body;
console.log(bodyElement);
const divElement = document.createElement("div");
bodyElement.appendChild(divElement);
bodyElement.style.background = "linear-gradient(to right, #ffffff, #f0f0f0)";

bodyElement.style.display = "flex";
bodyElement.style.margin = "200px 60px";
bodyElement.style.justifyContent = "space-between";
divElement.innerHTML = 'Hi,<br> I\'m <span style = "color:blue;">Mayuresh </span> <br> Web Designer';
divElement.style.margin="90px 120px ";
divElement.style.lineHeight="2.5";
divElement.style.fontSize="30px";
divElement.style.fontWeight="bold";
divElement.style.fontFamily = " 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif";


const img1 = document.createElement('img');
img1.src ='mayur.jpg';
img1.style.width="400px";
img1.style.height="400px";
img1.style.border="2px solid black";
img1.style.boxShadow = "0 0 20px rgba(0,0,0,0.3)";
img1.style.borderRadius="800px";
img1.style.marginRight=" 120px";

document.body.appendChild(img1);



