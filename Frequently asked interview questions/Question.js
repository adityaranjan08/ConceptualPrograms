var inputArray = [ "1233454356\tGET /index.html\t10.10.10.1",
"1233454356\tGET /index.html\t10.10.10.1",
"1233454356\tGET /index.html\t10.10.10.1",
"1233454323\tGET /index.htm\t10.13.10.1",
"1233454356\tGET /find.html\t10.14.10.1",
"1232343356\tGET /index.html\t10.14.10.1",
"1233454356\tGET /index.html\t10.14.10.1",
"1233654906\tGET /index.html\t123.14.10.1",
"1233454316\tGET /index.html\t10.14.10.1",
"1233887346\tGET /index.html\t10.14.10.1"];

function getIpAddress(inputArray=[]){
    inputArray.forEach((inputArray)=>(
        inputArray.getIpAddress()
    ))


}