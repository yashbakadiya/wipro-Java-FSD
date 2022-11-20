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
    httpRequest.send();

}

function addTrainee(nameFieldId,ageFieldId,resultFieldId) {
    const nameField = document.getElementById(nameFieldId);
    const ageField=document.getElementById(ageFieldId);
    const name=nameField.value;
    const age=ageField.value;
    console.log("inside addTrainee name=",name,"age",age);
    const url = "http://localhost:3000/trainees"
    const httpRequest = new XMLHttpRequest();
    const container=document.getElementById(resultFieldId);
    httpRequest.open("POST", url);
    const requestData={'name':name, 'age' : age};
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
    httpRequest.send(requestDataText);

}