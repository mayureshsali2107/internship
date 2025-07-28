const bodyElement = document.body;
console.log(bodyElement);
const hd1 = document.querySelector(".head1");
const hd2 = document.querySelector(".head2");
const hd3 = document.querySelector(".head3");
const hd4 = document.querySelector(".head4");


function changeText(element,text,color,time,onSucess,onFailure){
    setTimeout(()=>{
        if(element){
          element.style.fontSize="50px";
          element.textContent = text;
          element.style.color = color;
           if(onSucess){
              onSucess();
            }
           
        }else{
            // console.log("your element doesnt exists")
            if(onFailure){
                onFailure();
            }
        }
    },time);
}


changeText(hd1,"HI","violet",3000,()=>{
    changeText(hd2,"HI","red",4000,()=>{
        changeText(hd3,"HI","purple",5000,()=>{
            changeText(hd4,"HI","blue",6000,()=>{
            },()=>{console.log("Error In Head 1");});
        },()=>{console.log("Error in Head 2");});
    },()=>{console.log("Error in Head 3");});
},()=>{console.log("Error in Head 4");});