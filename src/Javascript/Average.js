let A=3;
let B=5;
let C=7;

console.log(arithmeticMean(A,B,C));
console.log(quadraticMean(A,B,C));
console.log(harmonicMean(A,B,C));
console.log(geometricMean(A,B,C));

function arithmeticMean(A,B,C) {
	return (A+B+C)/3;   
}
function quadraticMean(A,B,C) {
  return Math.sqrt((Math.pow(A,2)+Math.pow(B,2)+Math.pow(C,2))/3).toFixed(1);
}
function harmonicMean(A,B,C) {
  return Math.pow(((Math.pow(A,-1)+Math.pow(B,-1)+Math.pow(C,-1))/3),-1).toFixed(1);
}
function geometricMean(A,B,C) {
  return Math.cbrt(A*B*C).toFixed(1);
}