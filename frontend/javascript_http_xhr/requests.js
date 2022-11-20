function getTrainee(idField, containerId) {
    const inputElement = document.getElementById(idField);
    const traineeId = inputElement.value;
    console.log("inside getTrainee id=" + traineeId);
    const container = document.getElementById(containerId);
    const url = "http://localhost:3000/trainees/" + traineeId;
    const httpRequest = new XMLHttpRequest();
    httpRequest.open("GET", url);
    httpRequest.onload = () => {
        const responseText = httpRequest.responseText;
        const trainee = JSON.parse(responseText);
        console.log("trainee fetched", trainee);
        const containerHtml = `<h2> id is ${trainee.id} ,name is ${trainee.name} ,  age is ${trainee.age}  </h2>`
        container.innerHTML = containerHtml;
    };
    httpRequest.onerror=()=>{
        console.log("error is ",httpRequest.responseText);
    }
    httpRequest.send();

}

function addTrainee(event,resultFieldId) {
    const form =event.target;
    const formData=new FormData(form)
    const entries=formData.entries()
    const requestData={};
    for (let entry of entries){
     console.log("entry="+entry[0]+" "+ entry[1]);      
     const fieldName=entry[0];
     const fieldValue=entry[1];
     requestData[fieldName]=fieldValue;
    }

    const url = "http://localhost:3000/trainees"
    const httpRequest = new XMLHttpRequest();
    const container=document.getElementById(resultFieldId);
    httpRequest.open("POST", url);
    httpRequest.setRequestHeader("Content-Type","application/json")
    const requestDataText=JSON.stringify(requestData);
    httpRequest.onload = () => {
        const responseText = httpRequest.responseText;
        const trainee = JSON.parse(responseText);
        console.log("trainee fetched", trainee);
        const containerHtml = `<h3> Trainee Added, id is ${trainee.id} ,name is ${trainee.name} ,
          age is ${trainee.age}  </h3>`
        container.innerHTML = containerHtml;
    };
    httpRequest.onerror=()=>{
        console.log("error is ",httpRequest.responseText);
    }
    httpRequest.send(requestDataText);

}