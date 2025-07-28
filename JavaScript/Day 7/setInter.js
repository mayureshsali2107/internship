console.log("Script Start");
setTimeout(()=>{
    console.log("Hi From Inside set timout function");
},3000);

console.log("Script End");



//setTimeout

console.log("Script Start");
const id =setInterval(()=>{
    console.log("Hi From Inside set Interval function");
},3000);
// clearInterval(id);
console.log("Script End");