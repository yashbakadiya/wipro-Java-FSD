
function submitContact(event) {
    console.log("inside submitContact ",event);
    const form=event.target;
    const formData=new FormData(form);
    console.log("form entries",formData.entries());
    const contact={};
    for(let entry of formData.entries()){
        console.log(entry[0],entry[1]);
        contact[entry[0]]=entry[1];
    }
    persistSubmittedContact(contact);
    
}

