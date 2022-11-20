const baseUrl= "http://localhost:3000/contacts";

// Provide persistence solution code here
const persistSubmittedContact = (contact) => {
    console.log("persist submitted contact");
    const url = baseUrl;
    const httpRequest = new XMLHttpRequest();
    httpRequest.open("POST", url);
    httpRequest.setRequestHeader("Content-Type","application/json")
    const requestDataText=JSON.stringify(contact);
    httpRequest.onload = () => {
        const responseText = httpRequest.responseText;
        const persistedContact = JSON.parse(responseText);
        console.log("contact fetched", persistedContact);
       
    };
    httpRequest.onerror=()=>{
       console.log("error encountered", httpRequest.responseText);
    };
    httpRequest.send(requestDataText);

}

// Code to show the persisted data
const showPersistedData = () => {
    const url =baseUrl;
    const httpRequest = new XMLHttpRequest();
    httpRequest.open("GET", url);
    httpRequest.onload = () => {
        const responseText = httpRequest.responseText;
        const contacts = JSON.parse(responseText);
        console.log("contacts fetched", contacts);
        
       
    };
    httpRequest.onerror=()=>{
        console.log("error encountered", httpRequest.responseText);
     };
    httpRequest.send();

}

module.exports = { persistSubmittedContact, showPersistedData }
