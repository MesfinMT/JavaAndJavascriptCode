let standardtune=[329.63,246.94,196,146.83,110,82.41];
let a=[0, 246.94, 0, 0, 0, 80];
let b=[329, 246, 195, 146, 111, 82];
let c=[329.63, 246.94, 196, 146.83, 110, 82.41];
let result=[];

console.log(compareStrings(standardtune,a));
console.log(compareStrings(standardtune,b));
console.log(compareStrings(standardtune,c));

function compareStrings(standardtune, custometune) {
	//reset the result
	result.length=0;
        for(let i=0; i<6; i++) {

          if(custometune[i]==0) {
                result.push("-");
            }
            else if(Math.trunc(standardtune[i]) == Math.trunc(custometune[i])) {
                result.push("OK");
            }

            else if(Math.round(standardtune[i]) > Math.round(custometune[i])) {
		            if((standardtune[i]/custometune[i]*100)-100 <3) {
  		              result.push(">•");
        		    }else 
					{result.push(">>•");}

            }
            else { 
				if((standardtune[i]/custometune[i]*100)-100 <3) {
  		              result.push("•<");
        		    }else 
					{result.push("•<<");}
    	    }
 		}
		 return result;
}